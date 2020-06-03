package com.zoho.crm.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestListeners extends BaseTest{
//	static
//	{
//		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
//	}
	//difference between itestcontext and itestlistener

//	public void onStart(ITestContext c)
//	{
//		c.
//	}
//	public void onStart(ITestListener c)
//	{
//		c.
//	}
//	@Test
//	public void onStartmyTest(ITestResult c)
//	{
//		Reporter.log("Sample",true);
//		System.out.println("Test Name is: "+c.getName());
//		System.out.println("Test Status is: "+ c.getStatus());
//		if(c.getStatus()==ITestResult.SUCCESS)
//		{
//			Reporter.log("Test is passed",true);
//		}
//	}
	@Test
	public void run()
	{
		//WebDriver driver = new FirefoxDriver();
		openUrl(driver, "http://www.zoho.com");
		//driver.manage().window().maximize();
		//driver.get("http://www.google.com");
		driver.findElement(By.id("smp")).sendKeys("ghjk");
		//Reporter.log("Running",true);
		//System.out.println("Test Name is: "+c.getTestName());
	}
//	@Test
//	public void run1()
//	{
//		Reporter.log("Running1",true);
//		//System.out.println("Test Name is: "+c.getTestName());
//	}
//	@Test()
//	public void hi()
//	{
//		String s1 = "Ram";
//		String s2 = "Shyam";
//		Assert.assertEquals(s1, s2);
//	}
//	
//	@Test(dependsOnMethods = "hi")
//	public void hi1()
//	{
//		Reporter.log("Hello",true);
//	}
	
}
