package com.zoho.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import com.zoho.crm.generics.BaseTest;

public class LoginPage extends BaseTest{
	
	public boolean found = false;
	public WebDriver driver;
	public WebElement element;
	public static final Logger log =  LogManager.getLogger(LoginPage.class.getName());
	
	//Search Results
	//Featured snippet from the web
	//@FindBys will return the elements depending upon how @FindBy specified inside it. 
	//to put it in simple words, @FindBys have AND conditional relationship among the 
	//@FindBy whereas @FindAll has OR conditional relationship.
	
	@FindAll(
			{ 
				@FindBy(xpath = "(//div[@class='zgh-accounts'])[1]/a[1]")
			}
			)
	private WebElement login;

	
//	@FindBy(xpath = "//a[text()='Login']")
//	private WebElement login;

	@FindBy(id = "login_id")
	private WebElement email1;
	
	@FindBy(id = "nextbtn")
	private WebElement nextBtn1;
	
	@FindBy(id = "password")
	private WebElement psswd;
	
	@FindBy(xpath = "(//span[text()='Sign in'])[2]")
	private WebElement signIn;
	
	@FindBy(xpath = "(//img[@class='zcrmp-profileImg'])[2]")
	private WebElement clicklogOutButton;
	
	@FindBy(xpath = "//div[@class='zcrmpUpprLinks posRel clearFix']/a[2]")
	private WebElement logOutButton;
	
	/***************Yes i understand button for max reach login******/
	@FindBy(xpath = "//a[text()='Yes, I Understand']")
	private WebElement yesIUnd;
	
	/****************end*************************************************/
	
	@FindBy(xpath = "//div[text()='CRM']")
	private WebElement cRmClick;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("=======================================================================");
		log.info("Initialization of elements successfull for Login Page elements!!");
		log.info("=======================================================================");
	}
	
	public void loginClick()
	{
		element=waitDriverClickable(driver,login,15);
		//isElementVisible(login);
		log.info("login button is displayed");
		element.click();
		log.info("login button is clicked");
		//return found;
	}
	
	public void eMail(String mailId)
	{
		element=waitDriver(driver,email1,15);
		//isElementVisible(email);
		log.info("Email text field is displayed");
		element.sendKeys(mailId);
		log.info("Email is filled");
		//return found;
	}
	
	public void nextBtnClick()
	{
		element=waitDriverClickable(driver,nextBtn1,15);
		//isElementVisible(nextBtn1);
		log.info("Next Button is displayed");
		element.click();
		log.info("After Email NextBtn is clicked");
		//return found;
	}
	public void password(String password)
	{
		element=waitDriver(driver,psswd,20);
		//isElementVisible(nextBtn1);
		log.info("Password text field is displayed");
		element.sendKeys(password);
		log.info("Password is filled");
		//return found;
	}
	
	public void signInClick()
	{
		element=waitDriverClickable(driver,signIn,20);
		//isElementVisible(signIn);
		log.info("Sign in button is displayed");
		element.click();
		log.info("Sign in button is clicked");
		//return found;
	}
	
	/*********yes i under*****/
	 
	 	public void yesIUnd()
	{
		element=waitDriverClickable(driver,yesIUnd,5);
		//isElementVisible(yesIUnd);
		log.info("yes I understand is visible");
		element.click();
		log.info("yes I understand is clicked");
		//return found;
	}
	 
	/**** yesIUnd***********/
	 
	
//	public void ClickCrm()
//	{
//		element=waitDriverClickable(driver,cRmClick,5);
//		isElementVisible(element);
//		log.info("Crm link is displayed");
//		element.click();
//		log.info("Crm link is clicked");
//	}
	
	//logOut link
	
	public void logOutClick()
	{
		element=waitDriverClickable(driver,clicklogOutButton,5);
		//isElementVisible(clicklogOutButton);
		log.info("logOut link is displayed");
		element.click();
		log.info("logOut link is clicked");
	}
	
	public void logOut()
	{
		element=waitDriverClickable(driver,logOutButton,5);
		//isElementVisible(logOutButton);
		log.info("logOut button is displayed");
		element.click();
		log.info("logOut button is clicked");
	}
	
	
}
