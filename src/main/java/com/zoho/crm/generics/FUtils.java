package com.zoho.crm.generics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FUtils {
	
	/**
	 * This method is used to take Screenshot
	 * @param driver
	 * @param filePath
	 */
	public static void takeScreenshot(WebDriver driver, String filePath)
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File desc = new File(filePath);
			FileUtils.copyFile(src, desc);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
