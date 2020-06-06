package com.zoho.crm.generics;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {
	public static ExtentReports extent;
	public static ExtentReports getReportObject()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		//ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setEncoding("utf-8");
		reporter.config().setReportName("Zoho Crm Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setAutoCreateRelativePathMedia(true);
		
		extent = new ExtentReports();
		extent.setSystemInfo("Tester", "Shekhar Anand");
		extent.attachReporter(reporter);
		
		
		return extent;
	}

}
