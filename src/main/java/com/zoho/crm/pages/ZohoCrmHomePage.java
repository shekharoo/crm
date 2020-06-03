package com.zoho.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoho.crm.generics.BaseTest;

public class ZohoCrmHomePage extends BaseTest{
	
	public WebDriver driver;
	public WebElement element;
	
	@FindBy(xpath = "//span[@class='lyteDot svgIconsImg']")
	private WebElement moreOptions;

	@FindBy(xpath = "//lyte-drop-body[@class='tab_more_body']/lyte-drop-item[2]/a")
	private WebElement productsLink;
	
	@FindBy(id = "crmpluscommonui_crm_Products")
	private WebElement productsButton;
	
//	@FindBy(id = "nextbtn")
//	private WebElement nextBtn1;
//	
//	@FindBy(id = "password")
//	private WebElement psswd;
//	
//	@FindBy(xpath = "(//span[text()='Sign in'])[2]")
//	private WebElement signIn;
//	
//	@FindBy(xpath = "//div[text()='CRM']")
//	private WebElement cRmClick;
//	
	
	public ZohoCrmHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void moreClick()
	{
		element=waitDriver(driver,moreOptions,10);
		element.click();
	}
	
	public void products()
	{
		element=waitDriver(driver,productsLink,30);
		element.click();
	}
	
	public void productsButton()
	{
		element=waitDriver(driver,productsButton,30);
		element.click();
	}
//	
//	public void nextBtnClick()
//	{
//		element=waitDriver(driver,nextBtn1);
//		element.click();
//	}
//	public void password(String password)
//	{
//		element=waitDriver(driver,psswd);
//		element.sendKeys(password);
//	}
//	
//	public void signInClick()
//	{
//		element=waitDriver(driver,signIn);
//		element.click();
//	}
//	
//	public void ClickCrm()
//	{
//		element=waitDriver(driver,cRmClick);
//		element.click();
//	}
//	
	
	
}
