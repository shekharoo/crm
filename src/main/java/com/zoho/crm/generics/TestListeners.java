package com.zoho.crm.generics;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListeners extends BaseTest implements ITestListener{
	
	ThreadLocal<ExtentTest> tl = new ThreadLocal<ExtentTest>();
	public static final Logger log =  LogManager.getLogger(TestListeners.class.getName());
	  /**
	   * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
	   * filled with the references to class, method, start millis and status.
	   *
	   * @param result the partially filled <code>ITestResult</code>
	   * @see ITestResult#STARTED
	   */
	  ExtentReports extent = ExtentReporterNG.getReportObject();
	  ExtentTest test;
	  public void onTestStart(ITestResult result) {
		  log.info("Test has started.."+ result.getMethod().getMethodName());
		  test = extent.createTest(result.getMethod().getMethodName());
		  tl.set(test);
	  }

	  /**
	   * Invoked each time a test succeeds.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS
	   */
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test succeded.."+result.getMethod().getMethodName());
		  tl.get().log(Status.PASS, "Test Passed");
	  }

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	  public void onTestFailure(ITestResult result) {
		  tl.get().fail(result.getThrowable());
		  //tl.get().log(Status.FAIL, "Test Failed");
		  try {
		  System.out.println("Test failed.."+result.getMethod().getMethodName());
		  
		  String filePath = IConstant.PHOTO_PATH + result.getMethod().getMethodName() + ".png";
		  FUtils.takeScreenshot(driver, filePath);
		 
			tl.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
			//test.addScreenCaptureFromPath(filePath);
			//test.addScreenCaptureFromBase64String(filePath);
			log.info("Screenshot Attach successful");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  log.info("Screenshot is taken for the failed method: "+ result.getMethod().getMethodName());
		 // tl.get().fail(result.getThrowable());
//		  test.fail(result.getThrowable());
	  }

	  /**
	   * Invoked each time a test is skipped.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SKIP
	   */
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test Skipped.."+result.getMethod().getMethodName());
	  }

	  /**
	   * Invoked each time a method fails but has been annotated with successPercentage and this failure
	   * still keeps it within the success percentage requested.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	   */
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	  }

	  /**
	   * Invoked each time a test fails due to a timeout.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   */
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  /**
	   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
	   * and calling all their Configuration methods.
	   */
	  public void onStart(ITestContext context) {
		  System.out.println("All the Tests methods will be started"+ context.getName());
	  }

	  /**
	   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
	   * and all their Configuration methods have been called.
	   */
	  public void onFinish(ITestContext context) {
		  log.info("All the Tests methods have been called"+ context.getName());
		  extent.flush();
	  }

}
