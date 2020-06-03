package com.zoho.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.crm.generics.BaseTest;

public class PurchaseOrdersPage extends BaseTest{
	
	public WebDriver driver;
	public WebElement element;
	JavascriptExecutor jsp =  null;
	
	public static final Logger log =  LogManager.getLogger(PurchaseOrdersPage.class.getName());
	
	@FindBy(xpath = "//iframe[@id='crmLoadFrame']")
	private WebElement switchFrame;
	
	@FindBy(id = "commonUimoreModuleListicon")
	private WebElement moreOptions;
	
	//Enter Price book search
	@FindBy(id = "crmpluscommonuimoremodulesearchbox")
	private WebElement searchBox;
	
	//Click on Purchase Order
	@FindBy(id = "crmpluscommonui_crm_PurchaseOrders")
	private WebElement purchaseOrdersClick;
	
	//Click Create New Purchase Order
	@FindBy(xpath = "//button[text()='Create a Purchase Order']")
	private WebElement createNewPurchaseOrders;
	
	//Click create another product
	@FindBy(xpath = "//button[@data-zcqa='cv_createbtn']")
	private WebElement createAnotherPurchase;
	
	/********************************Create Purchase Orders Elements***************/
	
	//Enter PO Number
	@FindBy(id = "Crm_PurchaseOrders_PONUMBER")
	private WebElement poNumber;
	
	//Enter Subject
	@FindBy(id = "Crm_PurchaseOrders_PURCHASEORDERSUBJECT")
	private WebElement subject;
	
	//Click vendorNameLookUpIcon
	@FindBy(id = "Crm_PurchaseOrders_VENDORID_img")
	private WebElement vendorNameLookUpIcon;
	
	//Click newVendorClick
	@FindBy(id = "newEntityButton")
	private WebElement newVendorClick;
	
	//Enter vendor Name
	@FindBy(id = "Crm_Vendors_VENDORNAME")
	private WebElement vendorName;
	
	//Enter vendor phone
	@FindBy(id = "Crm_Vendors_PHONE")
	private WebElement vendorPhone;
	
	//Enter Vendor email
	@FindBy(id = "Crm_Vendors_EMAIL")
	private WebElement vendorEmail;
	
	//Click save vendor
	@FindBy(id = "btn_Save")
	private WebElement saveVendor;
	
	//Select vendor
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement vendorSelect;
	
	//Enter Requisition Number
	@FindBy(id = "Crm_PurchaseOrders_REQUISITIONNUMBER")
	private WebElement requisitionNumber;

	//Enter tracking Number
	@FindBy(id = "Crm_PurchaseOrders_TRACKINGNUMBER")
	private WebElement trackingNumber;
	
	//Click Contact name look up icon
	@FindBy(id = "Crm_PurchaseOrders_CONTACTID_img")
	private WebElement contactNameLookUpIconInPO;
	
	//Select contact
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[3]/td[1]/label/span")
	private WebElement chooseContact;
	
	//Enter PO Date
	@FindBy(id = "Crm_PurchaseOrders_PODATE")
	private WebElement poDate;
	
	//Enter PO Due Date
	@FindBy(id = "Crm_PurchaseOrders_DUEDATE")
	private WebElement poDueDate;
	
	//Click Carrier List Box
	@FindBy(id = "select2-Crm_PurchaseOrders_CARRIER-container")
	private WebElement carrierListBoxClick;
	
	//Select carrier
	@FindBy(xpath = "//ul[@class='select2-results__options']/li[5]/span")
	private WebElement carrierSelect;
	
	//Enter Excise Duty
	@FindBy(id = "Crm_PurchaseOrders_EXCISEDUTY")
	private WebElement exciseDuty;
	
	//Enter Sales Commission
	@FindBy(id = "Crm_PurchaseOrders_SALESCOMMISSION")
	private WebElement salesCommission;
	
	//Click on Status
	@FindBy(xpath= "//span[@aria-labelledby='select2-Crm_PurchaseOrders_STATUS-container']")
	private WebElement statusClick;
	
	//Select status
	
	@FindBy(xpath = "//span[@class='select2-results']/ul/li[2]/span")
	private WebElement statusSelect;
	
	//Enter Billing Street
	@FindBy(id = "Crm_PurchaseOrders_BILLINGSTREET")
	private WebElement billingStreet;
	
	//Enter Billing City
	@FindBy(id = "Crm_PurchaseOrders_BILLINGCITY")
	private WebElement billingCity;
	
	//Enter Billing State
	@FindBy(id = "Crm_PurchaseOrders_BILLINGSTATE")
	private WebElement billingState;
	
	//Enter Billing Code
	@FindBy(id = "Crm_PurchaseOrders_BILLINGCODE")
	private WebElement billingCode;
	
	//Enter Billing Country
	@FindBy(id = "Crm_PurchaseOrders_BILLINGCOUNTRY")
	private WebElement billingCountry;
	
	//Click Copy address button
	@FindBy(id = "copyAddress")
	private WebElement copyAddressClick;
	
	//Select copy address option
	@FindBy(xpath = "//div[@id='copy']/ul/li[1]/span")
	private WebElement copyAddressSelect;
	
	//Click Add Lines Items
	@FindBy(id = "addLinesBtnLwr")
	private WebElement addLineItemsClick;
	
	//Click uncheck Show products that have vendors associated with them.
	@FindBy(xpath = "//label[@class='newCustomchkbox-md']/input")
	private WebElement checkboxVendor;
	
	//Click search items(Product Name or Code)
	@FindBy(id = "codein1")
	private WebElement searchProdNameClick;
	
	//Enter product name
	@FindBy(id = "codein1")
	private WebElement prodNameSearch;
	
	//Select search items(Product Name or Code)//This is very dynamic
	@FindBy(xpath = "//ul[contains(@id,'ui-id') and contains(@class,'ui-menu ui-widget ui-widget-content')]/li[1]/a/span")
	private WebElement searchProdNameSelect1;
	
	//Enter the quantity
	@FindBy(id = "qtyin1")
	private WebElement quantityEnter1;
	
	//Click add New Product button
	@FindBy(xpath = "//li[@data-value='+ Add New Product']/a")
	private WebElement addNewProduct;
	
	//Enter Product Name
	@FindBy(id = "Crm_Products_PRODUCTNAME")
	private WebElement productName;
	
	//Enter product code
	@FindBy(id = "Crm_Products_PRODUCTCODE")
	private WebElement productCode;
	
	//Click vendor name look up icon
	@FindBy(xpath = "//span[@class='lookup dIB vam']")
	private WebElement vendorNameLookUpIconinNewProduct;

	//Select vendor
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement vendorSelectInAddNewProduct;
	
	//Enter Unit Price
	@FindBy(id = "Crm_Products_UNITPRICE")
	private WebElement unitPrice;
	
	//click Tax
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
	private WebElement tax;
		
	//Select Tax(Sales Tax)
	//@FindBy(xpath = "//span[@class='select2-results']/ul/li[1]/span")
	@FindBy(xpath = "//span[@class='select2-dropdown select2-dropdown--below']/span/ul/li[1]/span")
	private WebElement salesTax;
	
	
	//Click Save create product
	@FindBy(id = "btn_Save")
	private WebElement saveCreateProduct;
	
	//Enter Quantity
	@FindBy(id = "qtyin1")
	private WebElement quantity;
	
	//Click on add Products button
	@FindBy(id = "addPrdbtn")
	private WebElement addproductButtonInChooseProducts;
	
	//Enter Terms and Conditions
	@FindBy(id = "Crm_PurchaseOrders_TERMSANDCONDITIONS")
	private WebElement termsAndConditions;
	
	//Click Description
	@FindBy(id = "Crm_PurchaseOrders_DESCRIPTION")
	private WebElement description;
	
	//Click savePurchaseOrderButton
	@FindBy(id = "savePurchaseOrdersBtn")
	private WebElement savePOButton;
	
	@FindBy(xpath = "//td[text()=' Purchase Order Information  ']")
	private WebElement toScroll;

	public PurchaseOrdersPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("=======================================================================");
		log.info("Initialization of elements successfull for Purchase Order elements!!");
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
	
	public void purchaseOrdersClick()
	{
		element=waitDriverClickable(driver,purchaseOrdersClick,15);
		log.info("purchaseOrders link is displayed");
		element.click();
		log.info("purchaseOrders is clicked");
	}
	
	public void createNewPurchaseOrders()
	{
		try {
		    driver.switchTo().frame(switchFrame);
		    log.info("=======================================================================");
		    log.info("Switch to Purchase Orders module frame successful");
		    log.info("=======================================================================");
			element=waitDriverClickable(driver,createNewPurchaseOrders,15);
			//driver.findElement(By.xpath("//button[text()='Create a Product']")).click();
			log.info("Create New Purchase Order button displayed");
			element.click();
			log.info("Create New Purchase Order button is clicked");
		} catch (Exception e) {
			log.info("Create New Purchase Order button is not displayed");
		}
	}
	
	public void createAnotherPurchase()
	{
		element=waitDriverClickable(driver,createAnotherPurchase,15);
		log.info("createAnother Purchase Order button is displayed");
		element.click();
		log.info("createAnother Purchase Order button is clicked");
	}
	
	
	
	public void poNumber(String purchNo)
	{
		element=waitDriver(driver,poNumber,25);
		log.info("poNumber textfield is displayed");
		element.sendKeys(purchNo);
		log.info("poNumber is filled");
	}
	
	public void subject(String subj)
	{
		element=waitDriverClickable(driver,subject,15);
		log.info("subject textfield is displayed");
		element.sendKeys(subj);
		log.info("subject is filled");
	}
	
	public void vendorNameLookUpIcon()
	{
		element=waitDriverClickable(driver,vendorNameLookUpIcon,15);
		log.info("vendorNameLookUpIcon textfield is displayed");
		element.click();
		log.info("vendorNameLookUpIcon is clicked");
	}
	
	public void newVendorClick()
	{
		element=waitDriverClickable(driver,newVendorClick,15);
		log.info("newVendorClick is displayed");
		element.click();
		log.info("newVendorClick is clicked");
	}
	
	public void vendorName(String vName)
	{
		element=waitDriver(driver,vendorName,15);
		log.info("vendorName is displayed");
		element.sendKeys(vName);
		log.info("vendorName is filled");
	}
	
	public void vendorPhone(String vPhone)
	{
		element=waitDriver(driver,vendorPhone,15);
		log.info("vendorPhone is displayed");
		element.sendKeys(vPhone);
		log.info("vendorPhone is filled");
	}
	
	public void vendorEmail(String vEmail)
	{
		element=waitDriver(driver,vendorEmail,15);
		log.info("vendorEmail is displayed");
		element.sendKeys(vEmail);
		log.info("vendorEmail is filled");
	}
	
	public void saveVendor()
	{
		element=waitDriverClickable(driver,saveVendor,15);
		log.info("saveVendor is displayed");
		element.click();
		log.info("saveVendor is clicked");
	}
	
	public void vendorSelect()
	{
		element=waitDriverClickable(driver,vendorSelect,20);
		log.info("vendorSelect is displayed");
		element.click();
		log.info("vendorSelect is clicked");
	}
	
	
	public void requisitionNumber(String reqNo)
	{
		element=waitDriver(driver,requisitionNumber,15);
		log.info("requisitionNumber is displayed");
		element.sendKeys(reqNo);
		log.info("requisitionNumber is filled");
	}
	
	public void trackingNumber(String trackNo)
	{
		element=waitDriver(driver,trackingNumber,15);
		log.info("trackingNumber is displayed");
		element.sendKeys(trackNo);
		log.info("trackingNumber is filled");
	}
	
	public void contactNameLookUpIconInPO()
	{
		element=waitDriverClickable(driver,contactNameLookUpIconInPO,15);
		log.info("contactNameLookUpIconInPO is displayed");
		element.click();
		log.info("contactNameLookUpIconInPO is clicked");
	}
	
	public void chooseContact()
	{
		element=waitDriverClickable(driver,chooseContact,15);
		log.info("chooseContact is displayed");
		element.click();
		log.info("chooseContact is clicked");
	}
	
	public void poDate(String purchaseOrderDate)
	{
		element=waitDriver(driver,poDate,15);
		log.info("poDate is displayed");
		element.clear();
		element.sendKeys(purchaseOrderDate);
		log.info("poDate is filled");
	}
	
	public void poDueDate(String purchaseDueDate)
	{
		element=waitDriver(driver,poDueDate,15);
		log.info("poDueDate is displayed");
		element.sendKeys(purchaseDueDate);
		log.info("poDueDate is filled");
	}
	
	public void carrierListBoxClick()
	{
		element=waitDriverClickable(driver,carrierListBoxClick,15);
		log.info("carrierListBoxClick is displayed");
		element.click();
		log.info("carrierListBoxClick is clicked");
	}
	
	public void carrierSelect()
	{
		element=waitDriverClickable(driver,carrierSelect,15);
		log.info("carrierSelect is displayed");
		element.click();
		log.info("carrierSelect is clicked");
	}
	
	public void exciseDuty(String excDuty)
	{
		element=waitDriver(driver,exciseDuty,15);
		log.info("exciseDuty is displayed");
		element.sendKeys(excDuty);
		log.info("exciseDuty is filled");
	}
	
	public void salesCommission(String salesComm)
	{
		element=waitDriver(driver,salesCommission,10);
		log.info("salesCommission is displayed");
		element.sendKeys(salesComm);
		log.info("salesCommission is filled");
	}
	
	public void statusClick()
	{
		element=waitDriverClickable(driver,statusClick,15);
		log.info("statusClick is displayed");
		element.click();
		log.info("statusClick is clicked");
	}
	
	public void statusSelect()
	{
		element=waitDriverClickable(driver,statusSelect,15);
		log.info("statusSelect is displayed");
		element.click();
		log.info("statusSelect is clicked");
	}
	
	public void billingStreet(String billStreet)
	{
		element=waitDriver(driver,billingStreet,10);
		log.info("billingStreet is displayed");
		element.sendKeys(billStreet);
		log.info("billingStreet is filled");
	}	
	
	public void billingCity(String billCity)
	{
		element=waitDriver(driver,billingCity,10);
		log.info("billingCity is displayed");
		element.sendKeys(billCity);
		log.info("billingCity is filled");
	}
	
	public void billingState(String billState)
	{
		element=waitDriver(driver,billingState,10);
		log.info("billingState is displayed");
		element.sendKeys(billState);
		log.info("billingState is filled");
	}
	
	public void billingCode(String billCode)
	{
		element=waitDriver(driver,billingCode,10);
		log.info("billingCode is displayed");
		element.sendKeys(billCode);
		log.info("billingCode is filled");
	}
	
	public void billingCountry(String billCountry)
	{
		element=waitDriver(driver,billingCountry,10);
		log.info("billingCountry is displayed");
		element.sendKeys(billCountry);
		log.info("billingCountry is filled");
	}
	
	public void copyAddressClick()
	{
		element=waitDriverClickable(driver,copyAddressClick,15);
		log.info("copyAddressClick is displayed");
		element.click();
		log.info("copyAddressClick is clicked");
	}
	public void copyAddressSelect()
	{
		element=waitDriverClickable(driver,copyAddressSelect,15);
		log.info("copyAddressSelect is displayed");
		element.click();
		log.info("copyAddressSelect is clicked");
	}
	
	public void addLineItemsClick()
	{
		element=waitDriverClickable(driver,addLineItemsClick,15);
		log.info("addLineItemsClick is displayed");
		element.click();
		log.info("addLineItemsClick is clicked");
	}
	
	public void checkboxVendor()
	{
		
		Actions action  = new Actions(driver);
		action.moveToElement(checkboxVendor).click(checkboxVendor).perform();
		log.info("checkboxVendor is displayed and action click is performed on it");
	}
	
	public void searchProdNameClick()
	{
		element=waitDriverClickable(driver,searchProdNameClick,15);
		log.info("searchProdName is displayed");
		element.click();
		log.info("searchProdName is clicked");
	}
	
	public void prodNameSearch(String prodName1)
	{
		element=waitDriver(driver,prodNameSearch,15);
		log.info("prodNameSearch is displayed");
		element.sendKeys(prodName1);
		log.info("prodNameSearch is filled");
	}

	public void searchProdNameSelect1()
	{
		element=waitDriverClickable(driver,searchProdNameSelect1,15);
		log.info("searchProdName is displayed");
		element.click();
		log.info("searchProdName is clicked");
	}
	
	public void quantityEnter1(String qty1)
	{
		element=waitDriver(driver,quantityEnter1,15);
		log.info("quantityEnter is displayed");
		element.sendKeys(qty1);
		log.info("quantityEnter is clicked");
	}
	
	public void  handleAlertAddProducts()
	{
		Alert s = driver.switchTo().alert();
		s.accept();
	}
	
	public void addNewProduct()
	{
		element=waitDriverClickable(driver,addNewProduct,15);
		log.info("addNewProduct is displayed");
		element.click();
		log.info("addNewProduct is clicked");
	}
	
	public void productName(String prodName)
	{
		element=waitDriver(driver,productName,15);
		log.info("productName is displayed");
		element.clear();
		element.sendKeys(prodName);
		log.info("productName is clicked");
	}
	public void productCode(String prodCode)
	{
		element=waitDriver(driver,productCode,15);
		log.info("productCode is displayed");
		element.sendKeys(prodCode);
		log.info("productCode is clicked");
	}
	public void vendorNameLookUpIconinNewProduct()
	{
		element=waitDriverClickable(driver,vendorNameLookUpIconinNewProduct,15);
		log.info("vendorNameLookUpIconinNewProduct is displayed");
		element.click();
		log.info("vendorNameLookUpIconinNewProduct is clicked");
	}
	
	public void vendorSelectInAddNewProduct()
	{
		element=waitDriverClickable(driver,vendorSelectInAddNewProduct,15);
		log.info("vendorSelectInAddNewProduct is displayed");
		element.click();
		log.info("vendorSelectInAddNewProduct is clicked");
	}
	
	public void unitPrice(String uPrice)
	{
		element=waitDriver(driver,unitPrice,15);
		log.info("unitPrice is displayed");
		element.sendKeys(uPrice);
		log.info("unitPrice is filled");
	}
	
	public void tax()
	{
		element=waitDriverClickable(driver,tax,15);
		log.info("tax is displayed");
		element.click();
		log.info("tax is clicked");
	}
	
	public void salesTax()
	{
		element=waitDriverClickable(driver,salesTax,15);
		log.info("salesTax is displayed");
		element.click();
		log.info("salesTax is clicked");
	}
	
	
	public void saveCreateProduct()
	{
		element=waitDriverClickable(driver,saveCreateProduct,15);
		log.info("saveCreateProduct is displayed");
		element.click();
		log.info("saveCreateProduct is clicked");
	}
	
	public void addproductButtonInChooseProducts()
	{
		element=waitDriverClickable(driver,addproductButtonInChooseProducts,15);
		log.info("addproductButtonInChooseProducts is displayed");
		element.click();
		log.info("addproductButtonInChooseProducts is clicked");
	}
	
	public void termsAndConditions(String tandCond)
	{
		element=waitDriver(driver,termsAndConditions,15);
		log.info("termsAndConditions is displayed");
		element.sendKeys(tandCond);
		log.info("termsAndConditions is clicked");
	}
	
	public void description(String desc)
	{
		element=waitDriver(driver,description,20);
		log.info("description is displayed");
		element.sendKeys(desc);
		log.info("description is filled");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", toScroll);
		log.info("Scroll to view to: "+ toScroll);
	}
	
	public void savePOButton()
	{
		element=waitDriverClickable(driver,savePOButton,15);
		log.info("savePOButton is displayed");
		element.click();
		log.info("savePOButton is clicked");
	}
	
	public void purchaseOrdersButtonOutFrame()
	{
		driver.switchTo().defaultContent();
		log.info("=======================================================================");
		log.info(" Out of frame from Products module ");
		log.info("=======================================================================");
		element=waitDriverClickable(driver,purchaseOrdersClick,30);
		log.info("Purchase Order link is displayed");
		element.click();
		log.info("Purchase Order link is clicked");
	}
	
}
