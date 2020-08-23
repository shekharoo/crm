package com.zoho.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.crm.generics.BaseTest;

public class QuotesPage extends BaseTest{
	
	public WebDriver driver;
	public WebElement element;
	
	public static final Logger log =  LogManager.getLogger(QuotesPage.class.getName());
	
	@FindBy(xpath = "//span[contains(text(),'Welcome')]")
	private WebElement homePage;
	
	@FindBy(xpath = "//iframe[@id='crmLoadFrame']")
	private WebElement switchFrame;
	
	@FindBy(xpath = "//button[text()='Create a Quote']")
	private WebElement createQuoteButton;
	
	@FindBy(xpath = "//button[@data-zcqa='cv_createbtn']")
	private WebElement createAnotherQuoteButton;
	
	@FindBy(id = "crmpluscommonui_crm_Quotes")
	private WebElement quotesLink;
	
	/********************************Create Quotes Elements***************/
	
	//Deal Name lookup icon
	@FindBy(id = "Crm_Quotes_POTENTIALID_img")
	private WebElement dealNameLookUpIcon;
	
	//New Deal
	@FindBy(id = "newEntityButton")
	private WebElement newDeal;
	
	//Create New Deal/Amount
	@FindBy(id = "Crm_Potentials_AMOUNT")
	private WebElement dealAmount;
	
	//Deal Name
	//@FindBy(id = "Crm_Potentials_POTENTIALNAME")
	@FindBy(xpath = "//table[@class=' cccontact_fix wf_form_UI wf_form_focus mT0 searchFormDiv']/tbody/tr[2]/td[2]/input")
	private WebElement dealName;
	
	//Deal Closing date
	//@FindBy(id = "property(Closing Date)")
	@FindBy(xpath = "//table[@class=' cccontact_fix wf_form_UI wf_form_focus mT0 searchFormDiv']/tbody/tr[3]/td[2]/div/input")
	private WebElement dealClosingDate;
	
	//Deal Account Name
	//@FindBy(id = "Account Name")
	@FindBy(xpath = "//table[@class=' cccontact_fix wf_form_UI wf_form_focus mT0 searchFormDiv']/tbody/tr[4]/td[2]/input[1]")
	private WebElement dealAccount;
	
	//Deal Account Name Lookup icon
	@FindBy(xpath = "(//div[@class='popup-model-content'])[1]/div[2]/table[2]/tbody/tr[4]/td[2]/span/span")
	private WebElement dealAccountNameLookUpIcon;
	
	//To select new Account
	@FindBy(xpath = "//ul[@id='ui-id-5']/li/a/span")
	private WebElement newAccountExcep;
	
	//Stage drop down
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
	
	//EnterSubject
	@FindBy(id = "Crm_Quotes_QUOTESUBJECT")
	private WebElement subjectTF;
	
	//Valid until
	@FindBy(id = "Crm_Quotes_VALIDTILL")
	private WebElement validUntil;
	
	//Quote Stage
	@FindBy(id = "select2-Crm_Quotes_QUOTESTAGE-container")
	private WebElement quoteStageClick;
	
	//Select Quote Stage
	@FindBy(xpath = "//span[@class='select2-results']/ul/li[5]/span")
	private WebElement quoteStageSelect;
	
	//Contact name look up icon
	@FindBy(id = "Crm_Quotes_CONTACTID_img")
	private WebElement contactNameLookUpIcon;
	
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
	@FindBy(xpath = "//span[@class='dIB pR fR']/span")
	private WebElement accountNameLookUpInContact;
	
	//ChooseContact
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement chooseContact;
	
	//ChooseAccount
	@FindBy(xpath = "//div[@class='popup-model-content pB20']/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/label/span")
	private WebElement chooseAccount;
	
	//Enter email
	@FindBy(id = "Crm_Contacts_EMAIL")
	private WebElement eMail;
	
	//Enter phone
	@FindBy(id = "Crm_Contacts_PHONE")
	private WebElement phone;
	
	//Click save
	@FindBy(id = "btn_Save")
	private WebElement saveContact;
	
	//Enter team
	@FindBy(id = "Crm_Quotes_TEAM")
	private WebElement team;
	
	//Click accountNameLookUpIconInAccount
	@FindBy(id = "Crm_Quotes_ACCOUNTID_img")
	private WebElement accountNameLookUpIconInAccount;
	
	//Click newAccountButton
	@FindBy(id = "newEntityButton")
	private WebElement newAccountButton;
	
	//Enter Account name
	@FindBy(id = "Crm_Accounts_ACCOUNTNAME")
	private WebElement accountName;
	
	//Enter Account phone
	@FindBy(id = "Crm_Accounts_PHONE")
	private WebElement accountPhone;
	
	//Enter account website
	@FindBy(id = "Crm_Accounts_WEBSITE")
	private WebElement accountWebsite;
	
	//Click save
	@FindBy(id = "btn_Save")
	private WebElement accountSave;
	
	//Click Carrier
	@FindBy(id = "select2-Crm_Quotes_CARRIER-container")
	private WebElement carrierListBoxClick;
	
	//Select carrier
	@FindBy(xpath = "//ul[@class='select2-results__options']/li[5]/span")
	private WebElement carrierSelect;
	
	//Enter Billing Street
	@FindBy(id = "Crm_Quotes_BILLINGSTREET")
	private WebElement billingStreet;
	
	//Enter Billing City
	@FindBy(id = "Crm_Quotes_BILLINGCITY")
	private WebElement billingCity;
	
	//Enter Billing State
	@FindBy(id = "Crm_Quotes_BILLINGSTATE")
	private WebElement billingState;
	
	//Enter Billing Code
	@FindBy(id = "Crm_Quotes_BILLINGCODE")
	private WebElement billingCode;
	
	//Enter Billing Country
	@FindBy(id = "Crm_Quotes_BILLINGCOUNTRY")
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
	private WebElement searchProdNameClick1;
	
	//Select search items(Product Name or Code)//This is very dynamic
	@FindBy(xpath = "//ul[contains(@id,'ui-id') and contains(@class,'ui-menu ui-widget ui-widget-content')]/li[1]/a/span")
	private WebElement searchProdNameSelect1;
	
	//Enter the quantity
	@FindBy(id = "qtyin1")
	private WebElement quantityEnter1;
	
	//Click add Product button
	@FindBy(id = "addProd_1")
	private WebElement addProductClick;
	
	//Click on 2nd Add product text field
	@FindBy(id = "codein2")
	private WebElement searchProdNameClick2;
	
	//Enter search prodName
	//@FindBy(xpath = "//ul[@id='ui-id-7']/li[1]/a/span")
	@FindBy(xpath = "(//ul[contains(@id,'ui-id') and contains(@class,'ui-menu ui-widget ui-widget-content')]/li[5]/a/span)[2]")
	private WebElement searchProdNameSelect2;
	
	//Click add Product button
	@FindBy(id = "qtyin2")
	private WebElement quantityEnter2;
	
	//Click add Product button
	@FindBy(id = "addPrdbtn")
	private WebElement addProdButton;
	
	//Enter Terms and Conditions
	@FindBy(id = "Crm_Quotes_TERMSANDCONDITIONS")
	private WebElement termsAndConditions;
	
	//Click Description
	@FindBy(id = "Crm_Quotes_DESCRIPTION")
	private WebElement description;
	
	//Click Save
	@FindBy(id = "saveQuotesBtn")
	private WebElement saveQuote;
	
	//Click on Quotes button
	@FindBy(id = "crmpluscommonui_crm_Quotes")
	private WebElement quotesButton;
/*******************************************************************************************/	
	public QuotesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("=======================================================================");
		log.info("Initialization of elements successful for Quotes elements!!");
		log.info("=======================================================================");
	}
	
	public void homePage()
	{
		driver.switchTo().frame(switchFrame);
		element=waitDriver(driver,homePage,30);
		log.info("Welcome(Home Page) is displayed");
		driver.switchTo().defaultContent();
	}
	
	public void clickQuotesLink()
	{
		element=waitDriverClickable(driver,quotesLink,15);
		log.info("quotesLink is displayed");
		element.click();
		log.info("quotesLink is clicked");
	}
	
	public void createNewQuote()
	{
			try {
			    driver.switchTo().frame(switchFrame);
			    log.info("=======================================================================");
			    log.info("Switch to Purchase Orders module frame successful");
			    log.info("=======================================================================");
				element=waitDriverClickable(driver,createQuoteButton,15);
				//driver.findElement(By.xpath("//button[text()='Create a Product']")).click();
				log.debug("Create New createQuote button displayed");
				element.click();
				log.info("Create New createQuote button is clicked");
			} catch (Exception e) {
				log.debug("Create New createQuote button is not displayed");
			}
		}
	
	public void createAnotherQuoteButton()
	{
		element=waitDriverClickable(driver,createAnotherQuoteButton,15);
		log.info("createAnotherQuote button is displayed");
		element.click();
		log.info("createAnotherQuote button is clicked");
	}
	
	public void dealNameLookUpIcon()
	{
		element=waitDriverClickable(driver,dealNameLookUpIcon,15);
		log.info("dealNameLookUpIcon is displayed");
		element.click();
		log.info("dealNameLookUpIcon is clicked");
	}
	
	public void newDeal()
	{
		element=waitDriverClickable(driver,newDeal,15);
		log.info("newDeal is displayed");
		element.click();
		log.info("newDeal is clicked");
	}
	
	public void dealAmount(String dealAmt)
	{
		element=waitDriver(driver,dealAmount,15);
		log.info("dealAmount textfield is displayed");
		element.sendKeys(dealAmt);
		log.info("dealAmount is filled");
	}
	
	public void dealName(String dName)
	{
		element=waitDriver(driver,dealName,15);
		log.info("dealName textfield is displayed");
		element.sendKeys(dName);
		log.info("dealName is filled");
	}
	
	public void dealClosingDate(String dClosDate)
	{
		element=waitDriver(driver,dealClosingDate,15);
		log.info("dealClosingDate textfield is displayed");
		element.sendKeys(dClosDate);
		log.info("dealClosingDate is filled");
	}
	public void dealAccountLookUp()
	{
		element=waitDriverClickable(driver,dealAccountNameLookUpIcon,15);
		log.info("dealAccount is displayed");
		element.click();
		log.info("dealAccount is clicked");
	}
	
	public void dealAccount(String dAccount)
	{
		element=waitDriver(driver,dealAccount,15);
		log.info("dealAccount textfield is displayed");
		element.sendKeys(dAccount);
		log.info("dealAccount is filled");
	}
	
	public void newAccountExcep()
	{
		element=waitDriverClickable(driver,newAccountExcep,15);
		log.info("newAccountExcep is displayed");
		element.click();
		log.info("newAccountExcep is clicked");
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
	
	public void subjectTF(String subj)
	{
		element=waitDriver(driver,subjectTF,15);
		log.info("subjectTF textfield is displayed");
		element.sendKeys(subj);
		log.info("subjectTF is filled");
	}
	
	public void validUntil(String date)
	{
		element=waitDriver(driver,validUntil,15);
		log.info("validUntil textfield is displayed");
		element.sendKeys(date);
		log.info("validUntil is filled");
	}
	
	public void quoteStageClick()
	{
		element=waitDriverClickable(driver,quoteStageClick,15);
		log.info("quoteStageClick is displayed");
		element.click();
		log.info("quoteStageClick is clicked");
	}
	
	public void quoteStageSelect()
	{
		element=waitDriverClickable(driver,quoteStageSelect,15);
		log.info("quoteStageSelect is displayed");
		element.click();
		log.info("quoteStageSelect is clicked");
	}
	
	public void contactNameLookUpIcon()
	{
		element=waitDriverClickable(driver,contactNameLookUpIcon,15);
		log.info("contactNameLookUpIcon is displayed");
		element.click();
		log.info("contactNameLookUpIcon is clicked");
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
	
	public void firstName(String fname)
	{
		element=waitDriver(driver,firstName,15);
		log.info("firstName textfield is displayed");
		element.sendKeys(fname);
		log.info("firstName is filled");
	}
	
	public void lastName(String lname)
	{
		element=waitDriver(driver,lastName,15);
		log.info("lastName textfield is displayed");
		element.sendKeys(lname);
		log.info("lastName is filled");
	}
	
	public void accountNameLookUpInContact()
	{
		element=waitDriverClickable(driver,accountNameLookUpInContact,15);
		log.info("accountNameLookUpInContact is displayed");
		element.click();
		log.info("accountNameLookUpInContact is clicked");
	}
	
	public void chooseAccount()
	{
		element=waitDriverClickable(driver,chooseAccount,15);
		log.info("chooseAccount is displayed");
		element.click();
		log.info("chooseAccount is clicked");
	}
	
	public void eMail(String email)
	{
		element=waitDriver(driver,eMail,15);
		log.info("eMail textfield is displayed");
		element.sendKeys(email);
		log.info("eMail is filled");
	}
	
	public void phone(String phoneNo)
	{
		element=waitDriver(driver,phone,15);
		log.info("phone textfield is displayed");
		element.sendKeys(phoneNo);
		log.info("phone is filled");
	}
	
	public void saveContact()
	{
		element=waitDriverClickable(driver,saveContact,15);
		log.info("saveContact is displayed");
		element.click();
		log.info("saveContact is clicked");
	}
	
	public void chooseContact()
	{
		element=waitDriverClickable(driver,chooseContact,15);
		log.info("chooseContact is displayed");
		element.click();
		log.info("chooseContact is clicked");
	}
	
	public void team(String teamSize)
	{
		element=waitDriver(driver,team,15);
		log.info("team textfield is displayed");
		element.sendKeys(teamSize);
		log.info("team is filled");
	}
	
	public void accountNameLookUpIconInAccount()
	{
		element=waitDriverClickable(driver,accountNameLookUpIconInAccount,15);
		log.info("accountNameLookUpIconInAccount is displayed");
		element.click();
		log.info("accountNameLookUpIconInAccount is clicked");
	}
	
	public void newAccountButton()
	{
		element=waitDriverClickable(driver,newAccountButton,15);
		log.info("newAccountButton is displayed");
		element.click();
		log.info("newAccountButton is clicked");
	}
	
	public void accountName(String acName)
	{
		element=waitDriver(driver,accountName,15);
		log.info("accountName textfield is displayed");
		element.sendKeys(acName);
		element.sendKeys(Keys.TAB);
		log.info("accountName is filled");
	}
	
	public void accountPhone(String acPhone)
	{
		element=waitDriver(driver,accountPhone,15);
		log.info("accountPhone textfield is displayed");
		element.sendKeys(acPhone);
		log.info("accountPhone is filled");
	}
	
	public void accountWebsite(String acWebsite)
	{
		element=waitDriver(driver,accountWebsite,15);
		log.info("accountWebsite textfield is displayed");
		element.sendKeys(acWebsite);
		log.info("accountWebsite is filled");
	}
	
	public void accountSave()
	{
		element=waitDriverClickable(driver,accountSave,15);
		log.info("accountSave is displayed");
		element.click();
		log.info("accountSave is clicked");
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
	
	public void searchProdNameClick1(String prodName1)
	{
			element=waitDriver(driver,searchProdNameClick1,15);
			log.info("searchProdName is displayed");
			element.sendKeys(prodName1);
			log.info("searchProdName is filled");
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
		log.info("quantityEnter is filled");
	}
	
	public void addProductClick()
	{
		element=waitDriverClickable(driver,addProductClick,15);
		log.info("addProductClick is displayed");
		element.click();
		log.info("addProductClick is clicked");
	}
	
	public void searchProdNameClick2(String prodName2)
	{
		element=waitDriver(driver,searchProdNameClick2,15);
		log.info("searchProdName is displayed");
		element.sendKeys(prodName2);
		log.info("searchProdNameClick2 is filled");
	}
	
	public void searchProdNameSelect2()
	{
		element=waitDriverClickable(driver,searchProdNameSelect2,15);
		log.info("searchProdNameSelect is displayed");
		element.click();
		log.info("searchProdNameSelect is clicked");
	}
	
	public void quantityEnter2(String qty2)
	{
		element=waitDriver(driver,quantityEnter2,15);
		log.info("quantityEnter is displayed");
		element.sendKeys(qty2);
		log.info("quantityEnter is filled");
	}
	
	public void addProdButton()
	{
		element=waitDriverClickable(driver,addProdButton,15);
		log.info("addProdButton is displayed");
		element.click();
		log.info("addProdButton is clicked");
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
		element=waitDriver(driver,description,15);
		log.info("description is displayed");
		element.sendKeys(desc);
		log.info("description is filled");
	}
	public void saveQuote()
	{
		element=waitDriverClickable(driver,saveQuote,15);
		log.info("saveQuote is displayed");
		element.click();
		log.info("saveQuote is clicked");
	}
	
	public void quotesButtonOutFrame()
	{
		driver.switchTo().defaultContent();
		log.info("=======================================================================");
		log.info(" Out of frame from Quotes module ");
		log.info("=======================================================================");
		element=waitDriverClickable(driver,quotesButton,30);
		log.info("Quotes link is displayed");
		element.click();
		log.info("Quotes link is clicked");
	}
}
