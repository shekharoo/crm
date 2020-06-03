package com.zoho.crm.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.crm.generics.BaseTest;

public class ProductsPage extends BaseTest{
	
	public WebDriver driver;
	public WebElement element;
	JavascriptExecutor jsp =  null;
	
	public static final Logger log =  LogManager.getLogger(ProductsPage.class.getName());
	
	@FindBy(id = "commonUimoreModuleListicon")
	private WebElement moreOptions;
	
	//Enter Price book search
	@FindBy(id = "crmpluscommonuimoremodulesearchbox")
	private WebElement searchBox;
	
	//Click on Purchase Order
	@FindBy(id = "crmpluscommonui_crm_Products")
	private WebElement productsClick;
	
	//Create button link when already products are existing
	//span[@class='customPluswithImpotBtnCon pR']/link-to/button
	//public final String createAnprod = "//button[@data-zcqa='cv_createbtn']";
	@FindBy(xpath = "//button[@data-zcqa='cv_createbtn']")
	//@FindBy(className = "newwhitebtn customPlusBtn ")
	//@FindBy(xpath = "//span[@class='customPluswithImpotBtnCon pR']/link-to/button")
	//@FindBy(xpath = "//button[@data-zcqa='cv_createbtn' and @class='newwhitebtn customPlusBtn ']")
	private WebElement createAnotherProducts;
	
	@FindBy(xpath = "//iframe[@id='crmLoadFrame']")
	private WebElement switchFrame;
	
	//Click when there is no product is displayed.
	@FindBy(xpath = "//button[text()='Create a Product']")
	private WebElement createFirstProducts;
	
	/******************Fields***********************/
	//Add Product Name
	@FindBy(id = "Crm_Products_PRODUCTNAME")     
	private WebElement productName;
	
	//Add Product Code
	@FindBy(id = "Crm_Products_PRODUCTCODE")
	private WebElement productCode;
	
	
	//Click on Vendor Name Look Up
	@FindBy(id = "Crm_Products_VENDORID_img")
	private WebElement vendorLookUpIcon;
	
	//To add new product
	@FindBy(id = "newEntityButton")
	private WebElement addNewVendor;
	
	//New Vendor Crm_Vendors_VENDORNAME(id)
	@FindBy(id = "Crm_Vendors_VENDORNAME")
	private WebElement vendorName;
	
	//New Vendor phone Crm_Vendors_PHONE(id)
	@FindBy(id = "Crm_Vendors_PHONE")
	private WebElement vendorPhone;
	
	//New Vendor email Crm_Vendors_EMAIL(id)
	@FindBy(id = "Crm_Vendors_EMAIL")
	private WebElement vendorEmail;
	
	//Click on Save
	@FindBy(id = "btn_Save")
	private WebElement vendorSave;
	
	//Select vendor
	//@FindBy(xpath = "(//input[@name='radiobtn'])[1]")
	@FindBy(xpath = "//table[@class='newtable mT0 entityNameLookupNew']/tbody/tr[2]/td[1]/label/span")
	private WebElement selectVendor;
	
	//Click on manufacturer drop down
	@FindBy(id = "select2-Crm_Products_MANUFACTURER-container")
	private WebElement selectManufacturer;
	
	//Select manufacturer
	@FindBy(xpath = "//span[@class='select2-results']/ul/li[3]")
	private WebElement selManftr;
	
	//Click on product category
	@FindBy(id = "select2-Crm_Products_CATEGORY-container")
	private WebElement clickProdCategory;
	
	//Select prod category
	@FindBy(xpath = "//span[@class='select2-results']/ul/li[3]/span")
	private WebElement selectProdCategory;
	
	//Select Sales start date
	@FindBy(id = "Crm_Products_SALES_START_DATE")
	private WebElement startDate;
	
	//Select Sales end date
	@FindBy(id = "Crm_Products_SALES_END_DATE")
	private WebElement endDate;
	
	//Select support start date
	@FindBy(id = "Crm_Products_SUPPORT_START_DATE")
	private WebElement supportStartDate;
	
	//Select support expiry date
	@FindBy(id = "Crm_Products_SUPPORT_EXPIRY_DATE")
	private WebElement suppExpiryDate;
	
	//Select Unit price
	@FindBy(id = "Crm_Products_UNITPRICE")
	private WebElement unitPrice;
	
	//Select commission rate
	@FindBy(id = "Crm_Products_COMMISSION_RATE")
	private WebElement commRate;
		
	//click Tax
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
	private WebElement tax;
		
	//Select Tax(Sales Tax)
	//@FindBy(xpath = "//span[@class='select2-results']/ul/li[1]/span")
	@FindBy(xpath = "//span[@class='select2-dropdown select2-dropdown--below']/span/ul/li[1]/span")
	private WebElement salesTax;
	
	/***********Stocks information*************/
	
	
	//Click usage unit
	//@FindBy(id = "select2-Crm_Products_USAGE_UNIT-container")
	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Products_USAGE_UNIT-container']")
	private WebElement selUsage;
	
	//Select usage unit
	//@FindBy(xpath = "//span[@class='select2-results']/ul/li[11]/span")
	@FindBy(xpath = "//ul[@class='select2-results__options']/li[1]/span")
	private WebElement selUsageUnit;
	
	//Select Qty ordered
	@FindBy(id = "Crm_Products_QUANTITY")
	private WebElement qtyOrdered;
	
	//Select Qty in Stock
	@FindBy(id = "Crm_Products_QUANTITY_IN_STOCK")
	private WebElement qtyStock;
	
	//Select re-order level
	@FindBy(id = "Crm_Products_REORDER_LEVEL")
	private WebElement reOrderLevel;
				
	//click Handler
	@FindBy(id = "Crm_Products_HANDLER")
	private WebElement clickHandler;
			
	
	//select Handler
	//@FindBy(xpath = "//lyte-table[@id='cruxUserLookupTable']/div/lyte-yield/lyte-table-structure/lyte-tbody/lyte-tr/lyte-td/lyte-radiobutton/label/input")
	@FindBy(xpath = "//img[@class='cruxUserImg']")
	private WebElement selHandler;
	
	//Select Qty in Demand
	@FindBy(id = "Crm_Products_QUANTITY_IN_DEMAND")
	private WebElement qtyDemand;
	
	//Enter product description
	@FindBy(id = "Crm_Products_DESCRIPTION")
	private WebElement prodDescription;
	
	//select Save
	@FindBy(id = "saveProductsBtn")
	private WebElement save;
	
	//select Save&New
	@FindBy(id = "saveAndNewProductsBtn")
	private WebElement saveAndNew;
	/***********Stocks information End*************/
	/******************Fields End*******************/
	/***********Product Deatils Page***************/
	
	//Click on New Version
	//@FindBy(xpath = "//tr[@id='detailViewButtonLayerDummyTableRow']/td[3]/div[1]")
	@FindBy(xpath = "//div[text()='Switch to New Version']")
	private WebElement clickNewVersion;
	
	//Click on Products Link at the header @ Product Details page
	@FindBy(id = "crmpluscommonui_crm_Products")
	private WebElement clickProducts;
	
	//Click on timeline
	//@FindBy(id = "newleft_History")
	@FindBy(xpath = "//a[text()='Timeline']")
	private WebElement clickTimeline;
	
	//Click on overview
	//@FindBy(id = "newleft_Info")
	@FindBy(xpath = "//a[text()='Overview']")
	private WebElement clickOverview;
	
	@FindBy(id = "crmpluscommonui_crm_Products")
	private WebElement productsButton;
	
	@FindBy(xpath = "//td[contains(text(),'Stock')] ")
	private WebElement toScroll;
	
	@FindBy(xpath = "//div[@id='listviewtablescroll']/table/tbody/tr")
	private WebElement list;
	
	/***********Product Deatils Page End***************/

	public ProductsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("=======================================================================");
		log.info("Initialization of elements successfull for Products Page elements!!");
		log.info("=======================================================================");
	}
	
	public void moreOptions()
	{
		element=waitDriverClickable(driver,moreOptions,15);
		log.info("moreOptions textfield is displayed");
		element.click();
		log.info("moreOptions is clicked");
	}
	
	public void searchBox(String search)
	{
		element=waitDriver(driver,searchBox,15);
		log.info("searchBox textfield is displayed");
		element.sendKeys(search);
		log.info("searchBox is filled");
	}
	
	public void productOrdersClick()
	{
		element=waitDriverClickable(driver,productsClick,15);
		log.info("purchaseOrders link is displayed");
		element.click();
		log.info("purchaseOrders is clicked");
	}
	
	
	public void clickCreateProducts()
	{
		try {
		    driver.switchTo().frame(switchFrame);
		    log.info("=======================================================================");
		    log.debug("Switch to Products frame successful");
		    log.info("=======================================================================");
			element=waitDriverClickable(driver,createFirstProducts,15);
			//driver.findElement(By.xpath("//button[text()='Create a Product']")).click();
			log.debug("Create New Products button displayed");
			element.click();
			log.info("Create New Products button is clicked");
		} catch (Exception e) {
			log.debug("Create New Products button is not displayed");
		}
	}
	
	public void clickAnotherProducts()
	{
		element=waitDriverClickable(driver,createAnotherProducts,15);
		log.info("createAnotherProducts button is displayed");
		element.click();
		log.info("createAnotherProducts button is clicked");
	}
	
//	public void clickAnotherProducts1()
//	{
//		//element=waitDriver(driver,createAnotherProducts);
//		//element.click();
//		//return element;
//		createAnotherProducts.click();
//	}
	
	public void createProducts(String pName)
	{
		element=waitDriver(driver,productName,15);
		log.info("productName textfield is displayed");
		element.sendKeys(pName);
		log.info("productName is filled");
	}
	
	public void createProductsCode(String pCode)
	{
		element=waitDriver(driver,productCode,15);
		log.info("productCode textfield is displayed");
		element.sendKeys(pCode);
		log.info("productCode is filled");
	}
	
	public void clickVendorLookUp()
	{
		element=waitDriver(driver,vendorLookUpIcon,15);
		log.info("vendorLookUpIcon is displayed");
		element.click();
		log.info("vendorLookUpIcon is clicked");
	}
	
	public void createNewVendor()
	{
		element=waitDriverClickable(driver,addNewVendor,15);
		log.info("addNewVendor button is displayed");
		element.click();
		log.info("addNewVendor button is clicked");
	}
	
	public void vendorName(String vendName)
	{
		element=waitDriver(driver,vendorName,15);
		log.info("vendorName textfield is displayed");
		element.sendKeys(vendName);
		log.info("vendorName is filled");
	}
	
	public void vendorPhone(String vendPhone)
	{
		element=waitDriverClickable(driver,vendorPhone,15);
		log.info("vendorPhone textfield is displayed");
		element.sendKeys(vendPhone);
		log.info("vendorPhone is filled");
	}
	
	public void vendorEmail(String vendEmail)
	{
		element=waitDriver(driver,vendorEmail,15);
		log.info("vendorEmail textfield is displayed");
		element.sendKeys(vendEmail);
		log.info("vendorEmail is filled");
	}
	
	public void vendorSave()
	{
		element=waitDriverClickable(driver,vendorSave,15);
		log.info("vendorSave button is displayed");
		element.click();
		log.info("vendorSave button is clicked");
	}
	
	
//	public void clickVendSave()
//	{
//		element=waitDriver(driver,selectManufacturer);
//		element.click();
//	}
	
	public void selVendor()
	{
		element=waitDriverClickable(driver,selectVendor,15);
		log.info("selectVendor is displayed");
		element.click();
		log.info("selectVendor is clicked");
	}
	
	public void clickManftr()
	{
		element=waitDriverClickable(driver,selectManufacturer,15);
		log.info("selectManufacturer is displayed");
		element.click();
		log.info("selectManufacturer is clicked");
	}
		
	public void selManufacturer(String manftr)
	{
		element=waitDriverClickable(driver,selManftr,15);
		log.info("selManftr is displayed");
		element.click();
		log.info("selManftr is clicked");
	}
	
	public void clickprodCategory()
	{
		element=waitDriverClickable(driver,clickProdCategory,15);
		log.info("clickProdCategory is displayed");
		element.click();
		log.info("clickProdCategory is clicked");
	}
	public void selProdCategory()
	{
		element=waitDriverClickable(driver,selectProdCategory,15);
		log.info("selectProdCategory is displayed");
		element.click();
		log.info("selectProdCategory is clicked");
	}
	
	public void selStartDate(String sDate)
	{
		element=waitDriver(driver,startDate,15);
		log.info("startDate is displayed");
		element.sendKeys(sDate);
		log.info("startDate is filled");
	}
	
	public void selEndDate(String eDate)
	{
		element=waitDriver(driver,endDate,15);
		log.info("endDate is displayed");
		element.sendKeys(eDate);
		log.info("endDate is filled");
	}
	
	public void suppStartDate(String ssDate)
	{
		element=waitDriver(driver,supportStartDate,15);
		log.info("supportStartDate is displayed");
		element.sendKeys(ssDate);
		log.info("supportStartDate is filled");
	}
	
	public void suppExpDate(String seDate)
	{
		element=waitDriver(driver,suppExpiryDate,15);
		log.info("suppExpiryDate is displayed");
		element.sendKeys(seDate);
		log.info("suppExpiryDate is filled");
	}
	
	public void enterUnitPrice(String price)
	{
		element=waitDriver(driver,unitPrice,15);
		log.info("unitPrice is displayed");
		element.sendKeys(price);
		log.info("unitPrice is filled");
	}
	
	public void enterCommRate(String comm)
	{
		element=waitDriver(driver,commRate,15);
		log.info("commRate is displayed");
		element.sendKeys(comm);
		log.info("commRate is filled");
	}
	
	public void clickTax()
	{
		element=waitDriverClickable(driver,tax,15);
		log.info("tax is displayed");
		element.click();
		log.info("tax is clicked");
	}
	
	public void selTax()
	{
		element=waitDriverClickable(driver,salesTax,20);
		log.info("salesTax is displayed");
		element.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", toScroll);
		log.debug("Scroll scusseful to: "+ toScroll);
	}
	
	/******************To Scroll Down******************************************/
//	public void scrollDown(WebDriver driver)
//	{
//	 //driver.switchTo().frame(switchFrame).fin
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].scrollIntoView,true", toScroll);
//	}
	/******************To Scroll Down End******************************************/
	
	/***********Stock information*********/
	
	public void selUsage()
	{
		element=waitDriverClickable(driver,selUsage,15);
		log.info("selUsage is displayed");
		element.click();
		log.info("selUsage is clicked");
	}
	
	public void selUsageUnit()
	{
		element=waitDriverClickable(driver,selUsageUnit,15);
		log.info("selUsageUnit is displayed");
		element.click();
		log.info("selUsageUnit is clicked");
	}
	
	public void qtyOrdered(String qty)
	{
		element=waitDriver(driver,qtyOrdered,15);
		log.info("qtyOrdered is displayed");
		element.sendKeys(qty);
		log.info("qtyOrdered is filled");
	}
	
	public void qtyStock(String qty)
	{
		element=waitDriver(driver,qtyStock,15);
		log.info("qtyStock is displayed");
		element.sendKeys(qty);
		log.info("qtyStock is filled");
	}
	
	public void reOrdlevel(String reOrdLev)
	{
		element=waitDriver(driver,reOrderLevel,15);
		log.info("reOrderLevel is displayed");
		element.sendKeys(reOrdLev);
		log.info("reOrderLevel is filled");
	}
	
	public void clickHandler()
	{
		element=waitDriverClickable(driver,clickHandler,15);
		log.info("clickHandler is displayed");
		element.click();
		log.info("clickHandler is clicked");
	}
	
	public void setHandler()
	{
		element=waitDriverClickable(driver,selHandler,15);
		log.info("selHandler is displayed");
		element.click();
		log.info("selHandler is clicked");
	}
	
	public void qtyDemand(String qty)
	{
		element=waitDriverClickable(driver,qtyDemand,15);
		log.info("qtyDemand is displayed");
		element.sendKeys(qty);
		log.info("qtyDemand is clicked");
	}
	
	public void prodDescription(String desc)
	{
		element=waitDriverClickable(driver,prodDescription,15);
		log.info("prodDescription is displayed");
		element.sendKeys(desc);
		log.info("prodDescription is clicked");
	}
	
	public void save()
	{
		element=waitDriverClickable(driver,save,15);
		log.info("save button is displayed");
		element.click();
		log.info("save button is clicked");
	}
	
	public void saveAndNew()
	{
		element=waitDriverClickable(driver,saveAndNew,15);
		log.info("saveAndNew button is displayed");
		element.click();
		log.info("saveAndNew button is clicked");
	}
	
	/****************Product Details page*************/
	
	public void clickOnNewVersion()
	{
		element=waitDriverClickable(driver,clickNewVersion,15);
		log.info("clickNewVersion is displayed");
		element.click();
		log.info("clickNewVersion is clicked");
	}
	
	public void clickOnTimeline()
	{
		element=waitDriverClickable(driver,clickTimeline,15);
		log.info("clickTimeline is displayed");
		element.click();
		log.info("clickTimeline is clicked");
	}
	
	public void clickOnOverview()
	{
		element=waitDriverClickable(driver,clickOverview,15);
		log.info("clickOverview is displayed");
		element.click();
		log.info("clickOverview is clicked");
	}

//	public void list()
//	{
//		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='listviewtablescroll']/table/tbody/tr"));
//        System.out.println("Total no of records is: "+ list1.size());
//	}
	
//	public void clickOnProducts()
//	{
//		element=waitDriver(driver,clickProducts,15);
//		element.click();
//	}
	
	public void productsButton()
	{
		element=waitDriverClickable(driver,productsButton,15);
		log.info("productsButton is displayed");
		element.click();
		log.info("productsButton is clicked");
	}
	public void productsButtonOutFrame()
	{
		driver.switchTo().defaultContent();
		log.info("=======================================================================");
		log.debug(" (Out of frame) from Products module ");
		log.info("=======================================================================");
		element=waitDriverClickable(driver,productsButton,30);
		element.click();
		log.info("Products button is clicked");
	}
	
}
