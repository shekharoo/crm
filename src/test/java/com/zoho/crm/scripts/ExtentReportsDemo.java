package com.zoho.crm.scripts;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	ExtentReports er ;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		String path = System.getProperty("user.dir")+"\\reports\\report.html";
		System.out.println("User dir: " + path);
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Demo Report");
		reporter.config().setDocumentTitle("Report Title");
		
		er = new ExtentReports();
		er.attachReporter(reporter);
		er.setSystemInfo("Tester", "Shekhar");
		
	}
	
	@Test
	public void set() throws IOException
	{
		ExtentTest test = er.createTest("Set");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		test.fail("Result do not match");
		test.addScreenCaptureFromPath("./reports/image.png");
		er.flush();
	}

}
