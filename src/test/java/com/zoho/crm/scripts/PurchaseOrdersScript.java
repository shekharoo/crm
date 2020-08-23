package com.zoho.crm.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.pages.PurchaseOrdersPage;
import com.zoho.crm.generics.BaseTest;
import com.zoho.crm.generics.ReadExcel2D;

public class PurchaseOrdersScript extends BaseTest{
	public String[][] getLogin= null;
	public String[][] purchaseOrders= null;

	LoginPage lp=null;
	PurchaseOrdersPage po = null;
	
	public static final Logger log =  LogManager.getLogger(PurchaseOrdersScript.class.getName());
	
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
	    		getLogin = ReadExcel2D.getData("./testData/input5.xlsx", "Login5");
			} catch (Exception e) {
				log.debug("Error while fetching Login Deatils frm Excel..");
			}

			return getLogin;
	   }
	   
        @BeforeClass
	    @DataProvider(name = "zohoCrmPurchaseOrdersData")
	   // @Test(priority = 1 , groups = "purchaseOrders")
	    public Object[][] purchaseOrdersData()
	    {
			try {
				purchaseOrders = ReadExcel2D.getData("./testData/input5.xlsx","PurchaseOrders");
	    }	
			catch (Exception e) {
			e.printStackTrace();
		}
			return purchaseOrders;
	   }
	    
	    @Test(dataProvider = "zohoCrmLoginData",priority = 0,groups = "purchaseOrders")
	    public void login(String url,String mail,String pswd)
	    {
	    	lp  = new LoginPage(driver);
	    	//System.out.println("2"+getLogin[1][0]);
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
	    
		@Test(dataProvider = "zohoCrmPurchaseOrdersData", priority = 1, groups = "purchaseOrders")
		public void createPurchaseOrders(String search, String purchNo, String subj, 
				String vName,String vPhone,String vEmail, String reqNo, String trackNo,String purchaseOrderDate,
				String purchaseDueDate,String excDuty,String salesComm,String billStreet,String billCity,String billState,
				String billCode,String billCountry,String prodName1,String qty1,String prodName,String prodCode,
				String uPrice,String qty,String tandCond,String desc)
		{
			po = new PurchaseOrdersPage(driver);
			
			po.moreOptions();
			po.searchBox(search);
			po.purchaseOrdersClick();
			
			try {
				po.createNewPurchaseOrders();
			} catch (Exception e) {
				log.error("Create New Purchase Order Handled");
			}
			
			try {
				po.createAnotherPurchase();
			} catch (Exception e) {
				log.error("Create Another Purchase Order Handled");
			}
			
			po.poNumber(purchNo);
			po.subject(subj);
			po.vendorNameLookUpIcon();
			po.newVendorClick();
			po.vendorName(vName);
			po.vendorPhone(vPhone);
			po.vendorEmail(vEmail);
			po.saveVendor();
			po.vendorSelect();
			
			po.requisitionNumber(reqNo);
			po.trackingNumber(trackNo);
			po.contactNameLookUpIconInPO();
			po.chooseContact();
			
			po.poDate(purchaseOrderDate);
			po.poDueDate(purchaseDueDate);
			
			po.carrierListBoxClick();
			po.carrierSelect();
			
			po.exciseDuty(excDuty);
			po.salesCommission(salesComm);
			po.statusClick();
			po.statusSelect();
			
			po.billingStreet(billStreet);
			po.billingCity(billCity);
			po.billingState(billState);
			po.billingCode(billCode);
			po.billingCountry(billCountry);
			
			po.copyAddressClick();
			po.copyAddressSelect();
			
			po.addLineItemsClick();
			po.checkboxVendor();
			po.searchProdNameClick();
			po.prodNameSearch(prodName1);
			po.searchProdNameSelect1();
			po.quantityEnter1(qty1);
			
			try {
				po.handleAlertAddProducts();
			} catch (Exception e) {
				log.debug("Alert Handled",true);
			}
			//
//			po.addNewProduct();
//			
//			po.productName(prodName);
//			po.productCode(prodCode);
//			po.vendorNameLookUpIconinNewProduct();
//			po.vendorSelectInAddNewProduct();
//			po.unitPrice(uPrice);
//			po.tax();
//			po.salesTax();
//			po.saveCreateProduct();
	
			po.addproductButtonInChooseProducts();
			
			po.termsAndConditions(tandCond);
			po.description(desc);
			
//			po.vendorNameLookUpIcon();
//			po.vendorSelect();
			
			po.savePOButton();
			po.purchaseOrdersButtonOutFrame();
	

			lp.logOutClick();
			lp.logOut();
        }
	    
//	    @AfterClass
//	    @Test(dependsOnMethods = "createPurchaseOrders", alwaysRun = true)
//	    public void browserClose()
//	    {
//	    	closeBrowser();
//	    }
}
