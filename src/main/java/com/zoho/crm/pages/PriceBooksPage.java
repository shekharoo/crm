package com.zoho.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.crm.generics.BaseTest;

public class PriceBooksPage extends BaseTest{
	
	public static final Logger log =  LogManager.getLogger(PriceBooksPage.class.getName());
	
	public WebDriver driver;
	public WebElement element;
	
	@FindBy(xpath = "//iframe[@id='crmLoadFrame']")
	private WebElement switchFrame;
	
	@FindBy(id = "commonUimoreModuleListicon")
	private WebElement moreOptions;
	
	//Enter Price book search
	@FindBy(id = "crmpluscommonuimoremodulesearchbox")
	private WebElement searchBox;
	
	//Click on Price Book
	@FindBy(id = "crmpluscommonui_crm_PriceBooks")
	private WebElement priceBooksClick;
	
	@FindBy(xpath = "//button[text()='Create a Price Book']")
	private WebElement createNewPriceBooksButton;
	
	@FindBy(xpath = "//button[@data-zcqa='cv_createbtn']")
	private WebElement createAnotherPriceBooksButton;
	

	
	/********************************Price Books Elements***************/
	
	//Enter price book name
	@FindBy(id = "Crm_PriceBooks_BOOKNAME")
	private WebElement priceBookName;
	
	//Click pricing model
	@FindBy(id = "select2-Crm_PriceBooks_PRICINGMODEL-container")
	private WebElement pricingModelClick;
	
	//Select pricing model
	@FindBy(xpath = "//ul[@id='select2-Crm_PriceBooks_PRICINGMODEL-results']/li[2]/span")
	private WebElement pricingModelSelect;
	
	//Enter price book description
	@FindBy(id = "Crm_PriceBooks_DESCRIPTION")
	private WebElement priceBookDescription;

	//Enter From Range
	@FindBy(id = "Crm_PriceBooks_txtFromRange1")
	private WebElement fromRange;
	
	//Enter To Range
	@FindBy(id = "Crm_PriceBooks_txtToRange1")
	private WebElement toRange;

	//Enter Discount %
	@FindBy(id = "Crm_PriceBooks_txtDiscount1")
	private WebElement discount;
	
	//Click Save button
	@FindBy(id = "savePriceBooksBtn")
	private WebElement saveButton;
	
	//Click Add Products button on QuotesOverview
	@FindBy(xpath = "(//td[@valign='center'])[1]/div[2]/a[1]")
	private WebElement addProducts;
	
	//Select checkBox to Add Products to Price Book
	@FindBy(xpath= "//form[@name='showcvdetailsinshowmultivalues']/div[2]/div/table/tbody/tr[2]/td[1]")
	//@FindBy(xpath = "//div[@id='popup-model-content-multivalue-table']/table/tbody/tr[3]/td[1]/input")
	private WebElement clickCheckBoxAddProducts1;
	
	//Select checkBox to Add Products to Price Book
	@FindBy(xpath= "//form[@name='showcvdetailsinshowmultivalues']/div[2]/div/table/tbody/tr[2]/td[1]/input")
	//@FindBy(xpath = "//div[@id='popup-model-content-multivalue-table']/table/tbody/tr[3]/td[1]/input")
	private WebElement clickCheckBoxAddProducts2;
	
	//Select checkBox to Add Products to Price Book
	//@FindBy(xpath= "(//td[@class='pR20 vat pR']/input)[3]")
	@FindBy(xpath = "(//a[text()='HP laptop'])[1]")
	private WebElement clickCheckBoxAddProducts3;
	
	//Enter LIST PRICE
	@FindBy(xpath = "//div[@id='popup-model-content-multivalue']/div/table/tbody/tr[2]/td[8]/input")
	private WebElement listPrice;
	
	//Click Add to Products button
	@FindBy(id = "submitButton")
	private WebElement addToProducts;
	
/*******************************************************************************************/	
	public PriceBooksPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("=======================================================================");
		log.info("Initialization of elements successfull for Price Books Page elements!!");
		log.info("=======================================================================");
	}
	
	public void moreOptions()
	{
		element=waitDriverClickable(driver,moreOptions,15);
		log.info("moreOptions button is displayed");
		element.click();
		log.info("moreOptions button is clicked");
	}
	
	public void searchBox(String search)
	{
		element=waitDriverClickable(driver,searchBox,15);
		log.info("searchBox textbox is displayed");
		element.click();
		log.info("searchBox result is clicked");
	}
	
	public void priceBooksClick()
	{
		element=waitDriverClickable(driver,priceBooksClick,15);
		log.info("priceBooks link is displayed");
		element.click();
		log.info("priceBooks link is clicked");
	}
	public void createNewPriceBooksButton()
	{
		driver.switchTo().frame(switchFrame).findElement(By.xpath("//button[text()='Create a Price Book']")).click();
		log.info("=======================================================================");
		log.debug("Switch to Price Book frame successful");
		log.info("=======================================================================");
	}
	
	
	public void createAnotherPriceBooksButton()
	{
		
		element=waitDriverClickable(driver,createAnotherPriceBooksButton,15);
		log.info("createAnotherPriceBooksButton button is displayed");
		element.click();
		log.info("createAnotherPriceBooksButton button is clicked");
	}
	
	public void priceBookName(String pbName)
	{
		element=waitDriverClickable(driver,priceBookName,15);
		log.info("priceBookName textfield is displayed");
		element.sendKeys(pbName);
		log.info("priceBookName is filled");
	}
	
	
	public void pricingModelClick()
	{
		element=waitDriverClickable(driver,pricingModelClick,15);
		log.info("pricingModel is displayed");
		element.click();
		log.info("pricingModel is clicked");
	}
	
	public void pricingModelSelect()
	{
		element=waitDriverClickable(driver,pricingModelSelect,15);
		log.info("pricingModelSelect is displayed");
		element.click();
		log.info("pricingModelSelect is selected");
	}

	public void priceBookDescription(String pbDescription)
	{
		element=waitDriverClickable(driver,priceBookDescription,15);
		log.info("priceBookDescription textfield is displayed");
		element.sendKeys(pbDescription);
		log.info("priceBookDescription is filled");
	}
	
	public void fromRange(String fRange)
	{
		element=waitDriverClickable(driver,fromRange,15);
		log.info("fromRange textfield is displayed");
		element.sendKeys(fRange);
		log.info("fromRange is filled");
	}
	
	public void toRange(String tRange)
	{
		element=waitDriverClickable(driver,toRange,15);
		log.info("toRange textfield is displayed");
		element.sendKeys(tRange);
		log.info("toRange is filled");
	}
	
	public void discount(String dsc)
	{
		element=waitDriverClickable(driver,discount,15);
		log.info("discount textfield is displayed");
		element.sendKeys(dsc);
		log.info("discount is filled");
	}
	
	public void saveButton()
	{
		element=waitDriverClickable(driver,saveButton,15);
		log.info("save Button is displayed");
		element.click();
		log.info("save Button is clicked");
	}
	
//	public void present()
//	{
//		boolean found = isPresent(driver,createNewPriceBooksButton,10);
//		if(found)
//		{
//			createNewPriceBooksButton();
//		}
//		else
//		{
//			createAnotherPriceBooksButton();
//		}
//	}
	
	public void addProducts()
	{
		element=waitDriverClickable(driver,addProducts,15);
		log.info("AddProducts link is displayed");
		element.click();
		log.info("AddProducts link is clicked");
	}
	
	public void clickCheckBoxAddProducts1()
	{
		element=waitDriverClickable(driver,clickCheckBoxAddProducts1,15);
		log.info("clickCheckBoxAddProducts1 is displayed");
		element.click();
		log.info("clickCheckBoxAddProducts1 is clicked");
	}
	
	public void clickCheckBoxAddProducts2()
	{
		element=waitDriverClickable(driver,clickCheckBoxAddProducts2,15);
		log.info("clickCheckBoxAddProducts2 is displayed");
		element.click();
		log.info("clickCheckBoxAddProducts2 is clicked");
	}
	
	public void clickCheckBoxAddProducts3()
	{
		element=waitDriverClickable(driver,clickCheckBoxAddProducts3,15);
		log.info("clickCheckBoxAddProducts3 is displayed");
		element.click();
		log.info("clickCheckBoxAddProducts3 is clicked");
	}
	
	public void listPrice(String lPrice)
	{
		element=waitDriverClickable(driver,listPrice,15);
		log.info("listPrice textfield is displayed");
		element.sendKeys(lPrice);
		log.info("listPrice is filled");
	}
	
	public void addToProducts()
	{
		element=waitDriverClickable(driver,addToProducts,15);
		log.info("addToProducts is displayed");
		element.click();
		log.info("addToProducts is clicked");
	}
	public void priceBooksButtonOutFrame()
	{
		driver.switchTo().defaultContent();
		log.info("=======================================================================");
		log.info(" Out of frame from Price Book module ");
		log.info("=======================================================================");
		element=waitDriver(driver,priceBooksClick,30);
		log.info("priceBooks link is displayed");
		element.click();
		log.info("Price Books button is clicked");
	}
}
