package com.zoho.crm.scripts.CommonDP;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.zoho.crm.generics.BaseTest;
import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.pages.PurchaseOrdersPage;

public class PurchaseOrdersScript_New extends BaseTest{
	public String[][] getLogin= null;
	public String[][] purchaseOrders= null;

	LoginPage lp=null;
	PurchaseOrdersPage po = null;
	
	public static final Logger log =  LogManager.getLogger(PurchaseOrdersScript_New.class.getName());
	    
	@Test(dataProviderClass=BaseTest.class,dataProvider = "dp",priority = 0,groups = "Login")
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
	    
	    @Test(dataProviderClass=BaseTest.class,dataProvider = "dp",priority = 1,groups = "purchaseOrders")
		public void createPurchaseOrders(String search, String purchNo, String subj, 
				String vName,String vPhone,String vEmail, String reqNo, String trackNo,String purchaseOrderDate,
				String purchaseDueDate,String excDuty,String salesComm,String billStreet,String billCity,String billState,
				String billCode,String billCountry,String prodName1,String qty1,String prodName,String prodCode,
				String uPrice,String qty,String tandCond,String desc)
		{
			po = new PurchaseOrdersPage(driver);
			
			po.homePage();
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
			
			po.savePOButton();
			po.purchaseOrdersButtonOutFrame();
	

			lp.logOutClick();
			lp.logOut();
        }
}
