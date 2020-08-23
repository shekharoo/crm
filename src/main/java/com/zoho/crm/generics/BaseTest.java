package com.zoho.crm.generics;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseTest implements IConstant{
	public static WebDriver driver;
	public static final Logger log =  LogManager.getLogger(BaseTest.class.getName());
	public static int passCount;
	public static int failCount;
	public static int skipCount;
	
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	@BeforeClass
	public void setUp()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		log.info("Path set up successful");
	}

	@BeforeClass
	@Parameters("browser")
	public static void openBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(option);
			log.info("=======================================================================");
			log.debug("Chrome browser is launched successfully!!");
			log.info("=======================================================================");
		}
		else if(browser.equals("firefox"))
		{
			driver  = new FirefoxDriver();	
			log.info("=======================================================================");
			log.debug("Firefox browser is launched successfully!!");
			log.info("=======================================================================");
		}
	}
	
	
	public static void openUrl(WebDriver driver,String Url)
	{
		driver.manage().window().maximize();
		log.info("Chrome browser window is maximized");
		driver.get(Url);
		log.info("Current url opened is: " + Url);
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	}
	
	//Normal WebElement Visibility
	public static WebElement waitDriver(WebDriver driver, WebElement element,long time)
	{
		WebElement el = null;
		try {
		WebDriverWait wait  = new WebDriverWait(driver, time);
		el = wait.until(ExpectedConditions.visibilityOf(element));
		
			//Assert.assertTrue(element.isDisplayed(),"Element is not visible");
			
		} catch (Exception e) {
			log.debug("Element is not displayed");
		}
		return el;
	}
	
	//Element to be Clickable
	public static WebElement waitDriverClickable(WebDriver driver, WebElement element,long time)
	{
		WebElement el=null;
		try {
		WebDriverWait wait  = new WebDriverWait(driver, time);
		el = wait.until(ExpectedConditions.elementToBeClickable(element));
		
			//Assert.assertTrue(element.isEnabled(),"Element is not clicked");
		} catch (Exception e) {
			log.debug("Element is not clickable");
		}
		return el;
	}
	
	//Returns no of Records from the table
	public static int records(WebDriver driver,By record ,long time)
	{
		int recordsCount = 0;
		WebElement el=null;
		try {
		WebDriverWait wait  = new WebDriverWait(driver, time);
		el = wait.until(ExpectedConditions.visibilityOfElementLocated(record));
		List<WebElement> records = driver.findElements(record);
		log.debug("records count is found successfully");
		recordsCount = records.size();
		} catch (Exception e) {
			log.debug("Element is not Visible");
		}
		return recordsCount;
	}
	
	//Staleness of element
	public static boolean staleElement(WebDriver driver, WebElement element,long time)
	{
		Boolean stale = false;
		try
		{
		//WebElement	el = null;
		//stale = false;
		WebDriverWait wait  = new WebDriverWait(driver, time);
		stale = wait.until(ExpectedConditions.stalenessOf(element));
		log.info("Element is stale :" + stale);
//		if(stale)
//		{
			//el=wait.until(ExpectedConditions.refreshed());
		//}
		}catch (Exception e)
		{
			log.info("Element is not stale and not handled");
		}
		return stale;
	}
	
//	public static void isElementVisible(WebElement element)
//	{
//		try {
//			Assert.assertTrue(element.isDisplayed(),"Element is not visible");
//		} catch (Exception e) {
//			log.debug("Element is not displayed");
//		}
//
//	}
//	
//	public static void isCheckBoxSelected(WebElement element)
//	{
//		try {
//			Assert.assertTrue(element.isSelected(),"Element is not selected");
//		} catch (Exception e) {
//			log.debug("Element is not selected");
//		}
//		//boolean selected = element.isSelected();
//		//Assert.assertTrue(element.isDisplayed());
//		//return selected;
//	}
//	
//	//Check elememt is visible or not
//	public static boolean isPresent(WebDriver driver, WebElement element,long time)
//	{
//		boolean found = false;
//		WebDriverWait wait  = new WebDriverWait(driver, time);
//		wait.until(ExpectedConditions.visibilityOf(element));
//		try {
//			if (element.isDisplayed()) {
//				found = true;
//			}
//		} catch (Exception e) {
//			System.out.println("New Create Quote button exception handled");
//		}
////		finally {
////				found = false;
////		}
//
//		return found;
//	}
	
	//Switch to Frame
//	public static WebDriver waitDriverFrame(WebDriver driver,long time,String frameLocator)
//	{
//		WebDriverWait wait  = new WebDriverWait(driver, time);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
//		WebDriver wd = driver.switchTo().frame(frameLocator);
//		return wd;
//		
//	}
//	Parameter[] param = m.getParameters();
//	for(Parameter par:param)
//	{
//		System.out.println("Parameters are: "+par);
//	}
//	System.out.println("SheetName is: "+sheetName);
	//================Common Data Provider Begins==============================//
    /*****************Code changes applying Excel Utility*************/
    @DataProvider(name = "dp")
    public Object[][] getData(Method m) //Here Method is used to get the method(test) name 
    {                                   //everytime
    	String[][] data = null;
    	String sheetName = m.getName();
		try {
    		data = ReadExcel2D.getData(IConstant.EXCEL_PATH, sheetName);
		} catch (Exception e) {
			log.debug("Error while fetching Deatils frm Excel for the method: " + m.getName());
		}

		return data;
   }
	
	//================Common Data Provider End==============================//
	
//	@AfterMethod
//	public void testStatus(ITestResult result)
//	{
//		String testMethodName = result.getMethod().getMethodName();
//		int testMethodStatus = result.getStatus();
//		if(result.getStatus()==ITestResult.SUCCESS)
//		{
//			passCount++;
//			log.info(testMethodName + "is sucessfully executed");
//		}
//		else if(result.getStatus()==ITestResult.FAILURE)
//		{
//			failCount++;
//			log.info(testMethodName + "is failed");
//			String filePath = IConstant.PHOTO_PATH + testMethodName + ".png";
//			FUtils.takeScreenshot(driver, filePath);
//			log.info("Screenshot is taken for the failed method: "+ testMethodName);
//		}
//		else if(result.getStatus()==ITestResult.SKIP)
//		{
//			skipCount++;
//		}
//	}
	
	public void closeBrowser()
	{
		driver.close();
		log.info("Chrome browser window is closed..");
	}
	
	@AfterSuite
	public void testCounts()
	{
		Reporter.log("Total pass tests: "+passCount,true);
		Reporter.log("Total fail tests: "+failCount,true);
		Reporter.log("Total skip tests: "+skipCount,true);
		//driver.quit();
	}
	
	
	
}
