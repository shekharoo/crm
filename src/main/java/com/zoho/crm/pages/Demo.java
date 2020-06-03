package com.zoho.crm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Demo implements ITestListener{
//	public static WebDriver driver = null;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
//	//@BeforeTest
//	public boolean found1()
//	{
//		try {
//			driver.findElement(By.xpath("(//div[@class='zgh-accounts'])[1]/a[1]abc"));
//			return true;
//		} catch (Exception n) {
//			return false;
//			
//		}
//	}	
//		
//	@Test(alwaysRun = true)
//	public void setUp1()
//	{
//		System.out.println("Executing");
//		Assert.assertTrue(found1(),"Element is not found");
//		System.out.println("Found");
//	}
//public static void main(String[] args) {
//	if(true);
//	{
//		System.out.println("Hi1..");
//	}
//	if(true);
//	{
//		System.out.println("Hi2..");
//	}
//	if(true);
//	{
//		System.out.println("Hi3..");
//	}
//}
	
//	public interface ITestListener extends ITestNGListener {
//		  /**
//		   * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
//		   * filled with the references to class, method, start millis and status.
//		   *
//		   * @param result the partially filled <code>ITestResult</code>
//		   * @see ITestResult#STARTED
//		   */
//		  default void onTestStart(ITestResult result) {
//		    // not implemented
//		  }
//
//		  /**
//		   * Invoked each time a test succeeds.
//		   *
//		   * @param result <code>ITestResult</code> containing information about the run test
//		   * @see ITestResult#SUCCESS
//		   */
//		  default void onTestSuccess(ITestResult result) {
//		    // not implemented
//		  }
//
//		  /**
//		   * Invoked each time a test fails.
//		   *
//		   * @param result <code>ITestResult</code> containing information about the run test
//		   * @see ITestResult#FAILURE
//		   */
//		  default void onTestFailure(ITestResult result) {
//		    // not implemented
//		  }
//
//		  /**
//		   * Invoked each time a test is skipped.
//		   *
//		   * @param result <code>ITestResult</code> containing information about the run test
//		   * @see ITestResult#SKIP
//		   */
//		  default void onTestSkipped(ITestResult result) {
//		    // not implemented
//		  }
//
//		  /**
//		   * Invoked each time a method fails but has been annotated with successPercentage and this failure
//		   * still keeps it within the success percentage requested.
//		   *
//		   * @param result <code>ITestResult</code> containing information about the run test
//		   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
//		   */
//		  default void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		    // not implemented
//		  }
//
//		  /**
//		   * Invoked each time a test fails due to a timeout.
//		   *
//		   * @param result <code>ITestResult</code> containing information about the run test
//		   */
//		  default void onTestFailedWithTimeout(ITestResult result) {
//		    onTestFailure(result);
//		  }
//
//		  /**
//		   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
//		   * and calling all their Configuration methods.
//		   */
//		  default void onStart(ITestContext context) {
//		    // not implemented
//		  }
//
//		  /**
//		   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
//		   * and all their Configuration methods have been called.
//		   */
//		  default void onFinish(ITestContext context) {
//		    // not implemented
//		  }
//		}
	public static void main(String[] args) {
	WebDriver	driver = new ChromeDriver();
	driver.get("https://www.filmibeat.com/bollywood/movies/box-office-collection-2019.html");
	List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='boxoffice-list']/table/tbody/tr"));
	System.out.println("Size is: " + list1.size());
	}
}

