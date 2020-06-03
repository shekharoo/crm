package com.zoho.crm.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.pages.SalesOrdersPage;
import com.zoho.crm.generics.BaseTest;
import com.zoho.crm.generics.IConstant;
import com.zoho.crm.generics.ReadExcel2D;

public class SalesOrdersScript extends BaseTest{
	public String[][] getLogin= null;
	public String[][] salesOrders= null;

	LoginPage lp=null;
	SalesOrdersPage so = null;
	
	public static final Logger log =  LogManager.getLogger(SalesOrdersScript.class.getName());
	
//	    @BeforeTest
//	    public void setUp1()
//	    {
//	    	openBrowser("chrome");
//	    }
      
	    @BeforeClass
	    /*****************Code changes applying Excel Utility*************/
	    @DataProvider(name = "zohoCrmLoginData")
	    //@Test(priority = 0 , groups = "Login")
	    public Object[][] loginData()
	    {
	    	try {
	    		getLogin = ReadExcel2D.getData(IConstant.EXCEL_PATH, IConstant.EXCEL_SHEET);
			} catch (Exception e) {
				log.debug("Error while fetching Login Deatils frm Excel..");
			}

			return getLogin;
	   }
	   
	    @BeforeClass
	    @DataProvider(name = "zohoCrmSalesOrdersData")
	    //@Test(priority = 1 , groups = "salesOrders")
	    public Object[][] salesOrdersData()
	    {
			try {
				salesOrders = ReadExcel2D.getData("./testData/input5.xlsx","SalesOrders1");
	    }	
			catch (Exception e) {
			e.printStackTrace();
		}
			return salesOrders;
	   }
	    
	    @Test(dataProvider = "zohoCrmLoginData",priority = 0,groups = "salesOrders")
	    public void login(String url,String mail,String pswd)
	    {
	    	lp  = new LoginPage(driver);
	    	openUrl(driver, url);
			lp.loginClick();
			lp.eMail(mail);
			lp.nextBtnClick();
			lp.password(pswd);
		    lp.signInClick();
			try {
				lp.yesIUnd();
			}catch (Exception e) {
				log.info("(Yes I understand) is not Displayed, but handled");
			}
			
	    }
	    
	    @Test(dataProvider = "zohoCrmSalesOrdersData", priority = 1, groups = "salesOrders")
		public void createSalesOrders(String search,String poNo, String custNo, String dDate,String pend,
				String exDuty,String salComm,String tandCond,String desc)
		{
			so = new SalesOrdersPage(driver);
			
			so.moreOptions();
			so.searchBox(search);
			so.salesOrdersClick();
			
			try {
				so.createNewSalesOrders();
			} catch (Exception e) {
				log.error("Create New Sales Order Handled");
			}
			
			try {
				so.createAnotherSalesOrders();
			} catch (Exception e) {
				log.error("Create Another Sales Order Handled");
				
			}
			
			so.quoteNameLookUpIcon();
			so.selectQuote();
			//PageFactory.initElements(driver, so);
			so.poNumber(poNo);
			so.custNumber(custNo);
			so.DueDate(dDate);
			so.pending(pend);
			so.exciseDuty(exDuty);
			so.statusClick();
			so.statusSelect();
			so.salesCommission(salComm);
			so.termsAndConditions(tandCond);
			so.description(desc);
			
			
//			so.dealNameLookUpIcon();
//			so.newDeal();
//			so.dealAmount(dAmount);
//			so.dealName(dName);
//			so.dealClosingDate(dClosingDate);
//			so.accountNameLookUpIcon();
//			so.selectAccount();
//			so.stageDropDown();
//			so.stageChoose();
//			so.dealSave();
//			so.chooseDeal();
//			
//			so.subject(subj);
//			so.poNumber(poNo);
//			so.custNumber(custNo);
//			so.DueDate(dDate);
//			so.quoteNameLookUpIcon();
//			so.selectQuote();
//			so.contactNameLookUpIcon();
//			so.showContactClick();
//			so.allContactsSelect();
////			so.newContactButton();
////			so.titleClick();
////			so.selectMr();
////			so.firstName(fName);
////			so.lastName(lName);
////			so.accountNameLookUpInContact();
////			so.selectAccountInContact();
////			so.eMail(mail);
////			so.phone(phn);
////			so.saveContact();
//			
//			so.selectContact();
//			
//			so.pending(pend);
//			so.exciseDuty(exDuty);
//			
//			so.carrierListBoxClick();
//			so.carrierSelect();
//			

//			
//			so.salesCommission(salComm);
//			
//			so.accountNameLookUp();
//			so.chooseAccount();
//			
//			so.billingStreet(billStreet);
//			so.billingCity(billCity);
//			so.billingState(billState);
//			so.billingCode(billCode);
//			so.billingCountry(billCountry);
//			
//			so.addLineItemsClick();
//			so.prodNameSearch(prodName1);
//			so.searchProdNameSelect1();
//			so.quantityEnter1(qty1);
//			so.addproductButtonInChooseProducts();
//			
//			so.termsAndConditions(tandCond);
//			so.description(desc);
//			
			so.saveSOButton();
			so.salesOrdersButtonOutFrame();

			lp.logOutClick();
			lp.logOut();
        }
	    
//	    @AfterClass
//	    @Test(dependsOnMethods = "createSalesOrders",alwaysRun = true)
//	    public void browserClose()
//	    {
//	    	closeBrowser();
//	    }
}
