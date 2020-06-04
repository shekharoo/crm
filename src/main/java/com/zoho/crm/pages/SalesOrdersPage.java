package com.zoho.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.crm.generics.BaseTest;

public class SalesOrdersPage extends BaseTest{
	
	public WebDriver driver;
	public WebElement element;
	JavascriptExecutor jsp =  null;
	
	public static final Logger log =  LogManager.getLogger(SalesOrdersPage.class.getName());

	@FindBy(xpath = "//span[contains(text(),'Welcome')]")
	private WebElement homePage;
	
	@FindBy(xpath = "//iframe[@id='crmLoadFrame']")
	private WebElement switchFrame;
	
	@FindBy(id = "commonUimoreModuleListicon")
	private WebElement moreOptions;
	
	//Enter Price book search
	@FindBy(id = "crmpluscommonuimoremodulesearchbox")
	private WebElement searchBox;
	
	//Click on Purchase Order
	@FindBy(id = "crmpluscommonui_crm_SalesOrders")
	private WebElement salesOrdersClick;
	
	//Click Create New Purchase Order
	@FindBy(xpath = "//button[text()='Create a Sales Order']")
	private WebElement createNewSalesOrders;
	
	//Click create another product
	@FindBy(xpath = "//button[@data-zcqa='cv_createbtn']")
	private WebElement createAnotherSalesOrders;
	
	/********************************Create Sales Orders Elements***************/
	
	
	//Click Deal Name lookup icon
	@FindBy(id = "Crm_SalesOrders_POTENTIALID_img")
	private WebElement dealNameLookUpIcon;
	
	//Click New Deal
	@FindBy(id = "newEntityButton")
	private WebElement newDeal;
	
	//Enter New Deal/Amount
	@FindBy(id = "Crm_Potentials_AMOUNT")
	private WebElement dealAmount;
	
	//Enter Deal Name
	@FindBy(id = "Crm_Potentials_POTENTIALNAME")
	//@FindBy(xpath = "//table[@class=' cccontact_fix wf_form_UI wf_form_focus mT0 searchFormDiv']/tbody/tr[2]/td[2]/input")
	private WebElement dealName;
	
	//Enter Deal Closing date
	@FindBy(id = "property(Closing Date)")
	//@FindBy(xpath = "//table[@class=' cccontact_fix wf_form_UI wf_form_focus mT0 searchFormDiv']/tbody/tr[3]/td[2]/div/input")
	private WebElement dealClosingDate;
	
	//Click Account Name look up icon
	@FindBy(xpath = "//span[@class='lookup dIB vam']")
	private WebElement accountNameLookUpIcon;
	
	//Select Account / Choose Account
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement selectAccount;
	
	//To select  Account
	@FindBy(xpath = "//ul[@id='ui-id-5']/li/a/span")
	private WebElement newAccountExcep;
	
	//Click Stage drop down
	@FindBy(id = "select2-Stage-container")
	private WebElement stageDropDown;
	
	//Stage choose
	@FindBy(xpath = "//span[@class='select2-results']/ul/li[5]/span")
	private WebElement stageChoose;
	
	//Stage choose
	@FindBy(id = "btn_Save")
	private WebElement dealSave;
	
	//Choose Deal
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement chooseDeal;
	
	//Enter Subject
	@FindBy(id = "Crm_SalesOrders_SALESORDERSUBJECT")
	private WebElement subject;
	
	//Enter PO Number
	@FindBy(id = "Crm_SalesOrders_PURCHASEORDER")
	private WebElement poNumber;
	
	//Enter Customer Number
	@FindBy(id = "Crm_SalesOrders_CUSTOMERNUMBER")
	private WebElement custNumber;
	
	//Enter  Due Date
	@FindBy(id = "Crm_SalesOrders_DUEDATE")
	private WebElement DueDate;
	
	//Click Quote Name Look up icon
	@FindBy(xpath = "//img[@data-zcqa='lookup_QUOTEID']")
	private WebElement quoteNameLookUpIcon;
	
	//Select Quote 
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement selectQuote;
	
	//Contact name look up icon
	@FindBy(id = "Crm_SalesOrders_CONTACTID_img")
	private WebElement contactNameLookUpIcon;
	
	//Click show Contact
	@FindBy(id = "select2-contCateogory-container")
	private WebElement showContactClick;
	
	//Select All Contacts
	@FindBy(xpath = "//span[@class='select2-results']/ul/li[2]/span")
	private WebElement allContactsSelect;
		
	//Contact Button
	@FindBy(id = "newEntityButton")
	private WebElement newContactButton;
		
	//Select title
	@FindBy(id = "select2-fnQuickCreate-container")
	private WebElement titleClick;
		
	//Select Mr
	@FindBy(xpath = "//span[@class='select2-results']/ul/li[2]/span")
	private WebElement selectMr;
		
	//Enter First name
	@FindBy(name = "property(First Name)")
	private WebElement firstName;
		
	//Enter Last name
	@FindBy(id = "Crm_Contacts_LASTNAME")
	private WebElement lastName;
		
	//AccountNamelookupIcon
	@FindBy(xpath = "//span[@class='lookup dIB vam']")
	private WebElement accountNameLookUpInContact;
		
	//ChooseAccount
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement selectAccountInContact;
		
	//Enter Account
	@FindBy(id  = "Account Name")
	private WebElement accountName;
	
	//Enter email
	@FindBy(id = "Crm_Contacts_EMAIL")
	private WebElement eMail;
		
	//Enter phone
	@FindBy(id = "Crm_Contacts_PHONE")
	private WebElement phone;
		
	//Click save
	@FindBy(id = "btn_Save")
	private WebElement saveContact;
		
	//Select/ChooseContact
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement selectContact;
	
	//Enter Pending
	@FindBy(id = "Crm_SalesOrders_PENDING")
	private WebElement pending;
	
	//Enter Excise Duty
	@FindBy(id = "Crm_SalesOrders_EXCISEDUTY")
	private WebElement exciseDuty;
	
	//Click Carrier List Box
	@FindBy(id = "select2-Crm_SalesOrders_CARRIER-container")
	private WebElement carrierListBoxClick;
	
	//Select carrier
	@FindBy(xpath = "//ul[@class='select2-results__options']/li[5]/span")
	private WebElement carrierSelect;
	
	//Click on Status
	@FindBy(xpath= "//span[@aria-labelledby='select2-Crm_SalesOrders_STATUS-container']")
	private WebElement statusClick;
	
	//Select status
	
	@FindBy(xpath = "//span[@class='select2-results']/ul/li[2]/span")
	private WebElement statusSelect;
	
	//Enter Sales Commission
	@FindBy(id = "Crm_SalesOrders_SALESCOMMISSION")
	private WebElement salesCommission;
	
	//Click AccountNamelookupIcon
	@FindBy(xpath = "//img[@data-zcqa='lookup_ACCOUNTID']")
	private WebElement accountNameLookUp;
	
	//ChooseAccount
	//@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement chooseAccount;
	
	//Enter Billing Street
	@FindBy(id = "Crm_SalesOrders_BILLINGSTREET")
	private WebElement billingStreet;
		
	//Enter Billing City
	@FindBy(id = "Crm_SalesOrders_BILLINGCITY")
	private WebElement billingCity;
		
	//Enter Billing State
	@FindBy(id = "Crm_SalesOrders_BILLINGSTATE")
	private WebElement billingState;
		
	//Enter Billing Code
	@FindBy(id = "Crm_SalesOrders_BILLINGCODE")
	private WebElement billingCode;
		
	//Enter Billing Country
	@FindBy(id = "Crm_SalesOrders_BILLINGCOUNTRY")
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
	
	//Click search items(Product Name or Code)
	@FindBy(id = "codein1")
	private WebElement searchProdNameClick;
		
	//Enter product name
	@FindBy(id = "codein1")
	private WebElement prodNameSearch;
		
	//Select search items(Product Name or Code)//This is very dynamic
	@FindBy(xpath = "//ul[contains(@id,'ui-id') and contains(@class,'ui-menu ui-widget ui-widget-content')]/li[5]/a/span")
	private WebElement searchProdNameSelect1;
		
	//Enter the quantity
	@FindBy(id = "qtyin1")
	private WebElement quantityEnter1;
	
	//Click on add Products button
	@FindBy(id = "addPrdbtn")
	private WebElement addproductButtonInChooseProducts;
	
	//Enter Terms and Conditions
	@FindBy(id = "Crm_SalesOrders_TERMSANDCONDITIONS")
	private WebElement termsAndConditions;
	
	//Click Description
	@FindBy(id = "Crm_SalesOrders_DESCRIPTION")
	private WebElement description;
	
	//Click savePurchaseOrderButton
	@FindBy(id = "saveSalesOrdersBtn")
	private WebElement saveSOButton;

/*******************************************************************************************/	
	public SalesOrdersPage(WebDriver driver)
	{		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("=======================================================================");
		log.info("Initialization of elements successfull for Sales Order elements!!");
		log.info("=======================================================================");
	}
	
	public void homePage()
	{
		driver.switchTo().frame(switchFrame);
		element=waitDriver(driver,homePage,30);
		log.info("Welcome(Home Page) is displayed");
		driver.switchTo().defaultContent();
	}
	
	public void moreOptions()
	{
		element=waitDriverClickable(driver,moreOptions,25);
		log.info("moreOptions button is displayed");
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
	
	public void salesOrdersClick()
	{
		element=waitDriverClickable(driver,salesOrdersClick,15);
		log.info("salesOrders search is displayed");
		element.click();
		log.info("salesOrders is clicked");
	}
	public void createNewSalesOrders()
	{
		try {
		    driver.switchTo().frame(switchFrame);
		    log.info("=======================================================================");
		    log.info("Switch to Purchase Orders module frame successful");
		    log.info("=======================================================================");
			element=waitDriverClickable(driver,createNewSalesOrders,15);
			//driver.findElement(By.xpath("//button[text()='Create a Product']")).click();
			log.debug("Create New SalesOrders button displayed");
			element.click();
			log.info("Create New SalesOrders button is clicked");
		} catch (Exception e) {
			log.debug("Create New SalesOrders button is not displayed");
		}
	}
	
	
	public void createAnotherSalesOrders()
	{
		element=waitDriverClickable(driver,createAnotherSalesOrders,15);
		log.info("createAnotherSalesOrders button is displayed");
		element.click();
		log.info("createAnotherSalesOrders button is clicked");
	}
	
	public void dealNameLookUpIcon()
	{
		element=waitDriverClickable(driver,dealNameLookUpIcon,15);
		log.info("dealNameLookUp Icon is displayed");
		element.click();
		log.info("dealNameLookUp Icon is clicked");
	}

	public void newDeal()
	{
		element=waitDriverClickable(driver,newDeal,15);
		log.info("newDeal button is displayed");
		element.click();
		log.info("newDeal button is clicked");
	}
	

	public void dealAmount(String dAmount)
	{

		element=waitDriver(driver,dealAmount,15);
		log.info("dealAmount textfield is displayed");
		element.sendKeys(dAmount);
		log.info("dealAmount is filled");
	}
	
	public void dealName(String dName)
	{
		element=waitDriver(driver,dealName,15);
		log.info("dealName textfield is displayed");
		element.sendKeys(dName);
		log.info("dealName is filled");
	}
	
	public void dealClosingDate(String dClosingDate)
	{
		element=waitDriver(driver,dealClosingDate,15);
		log.info("dealClosingDate textfield is displayed");
		element.sendKeys(dClosingDate);
		log.info("dealClosingDate is filled");
	}
	
	public void accountNameLookUpIcon()
	{
		element=waitDriverClickable(driver,accountNameLookUpIcon,15);
		log.info("accountNameLookUpIcon is displayed");
		element.click();
		log.info("accountNameLookUpIcon is clicked");
	}
	
	public void selectAccount()
	{
		element=waitDriverClickable(driver,selectAccount,15);
		log.info("selectAccount is displayed");
		element.click();
		log.info("selectAccount is clicked");
	}
	
	
	public void stageDropDown()
	{
		element=waitDriverClickable(driver,stageDropDown,15);
		log.info("stageDropDown is displayed");
		element.click();
		log.info("stageDropDown is clicked");
	}
	
	public void stageChoose()
	{
		element=waitDriverClickable(driver,stageChoose,15);
		log.info("stageChoose is displayed");
		element.click();
		log.info("stageChoose is clicked");
	}
	
	public void dealSave()
	{
		element=waitDriverClickable(driver,dealSave,15);
		log.info("dealSave is displayed");
		element.click();
		log.info("dealSave is clicked");
	}
	
	public void chooseDeal()
	{
		element=waitDriverClickable(driver,chooseDeal,15);
		log.info("chooseDeal is displayed");
		element.click();
		log.info("chooseDeal is clicked");
	}
	
	public void subject(String subj)
	{
		element=waitDriver(driver,subject,15);
		log.info("subject textfield is displayed");
		element.sendKeys(subj);
		log.info("subject textfield is filled");
	}

	public void poNumber(String poNo)
	{  
//		try
//		{
//		Boolean stale;
//		//element=	driver.findElement(By.id("Crm_SalesOrders_PURCHASEORDER"));
//		stale = staleElement(driver, poNumber, 20);
//		if(stale)
//		{
//		while(stale)
//		{
			try {
				driver.findElement(By.id("Crm_SalesOrders_PURCHASEORDER")).sendKeys(poNo);
				log.info("Element is found successfully again in the Dome page");
				//stale = false;
			} catch (Exception e) {
				log.error("This stale element is not handled!!");
				//stale = true;
//			}
//			
//		}
		log.debug("Successfully handled Stale Element Reference!!");
		}
//		else
//		{
//			log.info("Element is not stale");
//		}
	}
//	catch(Exception e)
//	{
//		log.debug("Successfully handled Stale Element Reference!!");
//	}
//		element=waitDriver(driver,poNumber,25);
//		log.info("poNumber is displayed");
//		element.sendKeys(poNo);
//		log.info("poNumber is filled");
	public void custNumber(String custNo)
	{
		element=waitDriver(driver,custNumber,15);
		log.info("custNumber is displayed");
		element.sendKeys(custNo);
		log.info("custNumber is filled");
	}
	
	public void DueDate(String dDate)
	{
		element=waitDriver(driver,DueDate,15);
		log.info("DueDate is displayed");
		element.sendKeys(dDate);
		element.sendKeys(Keys.TAB);
		log.info("DueDate is filled");
	}
	
	public void quoteNameLookUpIcon()
	{
		element=waitDriverClickable(driver,quoteNameLookUpIcon,15);
		log.info("quoteNameLookUp Icon is displayed");
		element.click();
		log.info("quoteNameLookUp Icon is clicked");
	}
	
	public void selectQuote()
	{
		element=waitDriverClickable(driver,selectQuote,15);
		log.info("selectQuote list is displayed");
		element.click();
		log.info("selectQuote list is clicked");
	}
	
	public void contactNameLookUpIcon()
	{
		element=waitDriverClickable(driver,contactNameLookUpIcon,15);
		log.info("contactNameLookUp Icon is displayed");
		element.click();
		log.info("contactNameLookUp Icon is clicked");
	}
	
	public void showContactClick()
	{
		element=waitDriverClickable(driver,showContactClick,15);
		log.info("showContactClick is displayed");
		element.click();
		log.info("showContactClick is clicked");
	}
	
	public void allContactsSelect()
	{
		element=waitDriverClickable(driver,allContactsSelect,15);
		log.info("allContactsSelect is displayed");
		element.click();
		log.info("allContactsSelect is clicked");
	}
	
	public void newContactButton()
	{
		element=waitDriverClickable(driver,newContactButton,15);
		log.info("newContactButton is displayed");
		element.click();
		log.info("newContactButton is clicked");
	}
	
	public void titleClick()
	{
		element=waitDriverClickable(driver,titleClick,15);
		log.info("titleClick is displayed");
		element.click();
		log.info("titleClick is clicked");
	}
	
	public void selectMr()
	{
		element=waitDriverClickable(driver,selectMr,15);
		log.info("selectMr is displayed");
		element.click();
		log.info("selectMr is clicked");
	}
	
	public void firstName(String fName)
	{
		element=waitDriver(driver,firstName,15);
		log.info("firstName is displayed");
		element.sendKeys(fName);
		log.info("firstName is filled");
	}
	
	public void lastName(String lName)
	{
		element=waitDriver(driver,lastName,15);
		log.info("lastName is displayed");
		element.sendKeys(lName);
		log.info("lastName is filled");
	}
	public void accountNameLookUpInContact()
	{
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()", accountNameLookUpInContact );
		element=waitDriverClickable(driver,accountNameLookUpInContact,15);
		log.info("accountNameLookUpInContact Icon is displayed");
		element.click();
		log.info("accountNameLookUpInContact is clicked");
	}
	public void selectAccountInContact()
	{
		element=waitDriverClickable(driver,selectAccountInContact,15);
		log.info("selectAccountInContact is displayed");
		element.click();
		log.info("selectAccountInContact is clicked");
	}
	
	public void eMail(String mail)
	{
		element=waitDriver(driver,eMail,10);
		log.info("eMail is displayed");
		element.sendKeys(mail);
		log.info("eMail is filled");
	}
	
	public void phone(String phn)
	{
		element=waitDriver(driver,phone,10);
		log.info("phone is displayed");
		element.sendKeys(phn);
		log.info("phone is filled");
	}
	
	public void saveContact()
	{
		element=waitDriverClickable(driver,saveContact,15);
		log.info("saveContact is displayed");
		element.click();
		log.info("saveContact is clicked");
	}
	
	public void selectContact()
	{
		element=waitDriverClickable(driver,selectContact,15);
		log.info("selectContact is displayed");
		element.click();
		log.info("selectContact is clicked");
	}
	
	public void exciseDuty(String exDuty)
	{
		element=waitDriver(driver,exciseDuty,10);
		log.info("exciseDuty is displayed");
		element.clear();
		element.sendKeys(exDuty);
		log.info("exciseDuty is filled");
	}
	
	public void pending(String pend)
	{
		element=waitDriver(driver,pending,10);
		log.info("pending is displayed");
		element.sendKeys(pend);
		log.info("pending is filled");
	}
	
	public void carrierListBoxClick()
	{
		element=waitDriverClickable(driver,carrierListBoxClick,15);
		log.info("carrierListBox is displayed");
		element.click();
		log.info("carrierListBox is clicked");
	}
	
	public void carrierSelect()
	{
		element=waitDriverClickable(driver,carrierSelect,15);
		log.info("carrierSelect is displayed");
		element.click();
		log.info("carrierSelect is clicked");
	}
	
	public void statusClick()
	{
		//element=waitDriverClickable(driver,statusClick,20);
		Actions action = new Actions(driver);
		action.moveToElement(statusClick).click(statusClick).perform();
		log.info("statusClick is clicked");
		//element.click();
	}
	
	public void statusSelect()
	{
		element=waitDriverClickable(driver,statusSelect,15);
		log.info("statusSelect is displayed");
		element.click();
		log.info("statusSelect is clicked");
	}
	
	public void salesCommission(String salComm)
	{
		element=waitDriver(driver,salesCommission,10);
		log.info("salesCommission is displayed");
		element.clear();
		element.sendKeys(salComm);
		log.info("salesCommission is filled");
	}
	
	public void accountNameLookUp()
	{
		element=waitDriverClickable(driver,accountNameLookUp,15);
		log.info("accountNameLookUp icon is displayed");
		element.click();
		log.info("accountNameLookUp is clicked");
	}
	
	public void chooseAccount()
	{
		element=waitDriverClickable(driver,chooseAccount,15);
		log.info("chooseAccount list is displayed");
		element.click();
		log.info("chooseAccount is clicked");
	}
	
//	public void accountName(String acName)
//	{
//		element=waitDriver(driver,accountName,10);
//		element.sendKeys(acName);
//	}
	
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
		log.info("termsAndConditions is filled");
	}
	
	public void description(String desc)
	{
		element=waitDriver(driver,description,20);
		log.info("description is displayed");
		element.clear();
		element.sendKeys(desc);
		log.info("description is filled");
	}

	
	public void saveSOButton()
	{
		element=waitDriverClickable(driver,saveSOButton,15);
		log.info("saveSO Button is displayed");
		element.click();
		log.info("saveSO Button is clicked");
	}
	
	public void salesOrdersButtonOutFrame()
	{
		driver.switchTo().defaultContent();
		log.info("=======================================================================");
		log.info(" Out of frame from Products module ");
		log.info("=======================================================================");
		element=waitDriverClickable(driver,salesOrdersClick,30);
		log.info("Sales Order link is displayed");
		element.click();
		log.info("Sales Order link is clicked");
	}
}

	/*******************************************************/

	

	

	

	
	
	


	


	
	

	