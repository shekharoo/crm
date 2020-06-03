package com.zoho.crm.scripts.CommonDP;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.pages.PriceBooksPage;
import com.zoho.crm.generics.BaseTest;

public class PriceBookScript extends BaseTest{

	    LoginPage lp=null;
	    PriceBooksPage pb = null;
	    public static final Logger log =  LogManager.getLogger(PriceBookScript.class.getName());
	    
	    /**
	     * 
	     * @param url
	     * @param mail
	     * @param pswd
	     */
	    @Test(dataProviderClass=BaseTest.class,dataProvider = "dp",priority = 0,groups = "Login")
	    public void login(String url,String mail,String pswd)
	    {
		    System.out.println("Url is: "+ url);
		    System.out.println("mail is: "+ mail);
		    System.out.println("pswd is: "+ pswd);
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
	    
		@Test(dataProviderClass=BaseTest.class,dataProvider = "dp",priority = 1,groups = "PriceBooks")
		public void createPriceBooks(String search, String pbName, String pbDescription, 
				String fRange,String tRange,String dsc, String lPrice)
		{
			pb  = new PriceBooksPage(driver);
			pb.moreOptions();
			pb.searchBox(search);
			pb.priceBooksClick();
			try {
				pb.createNewPriceBooksButton();
			}catch (Exception e) {
				Reporter.log("Create New Price Book Handled",true);
			}
			try {
				pb.createAnotherPriceBooksButton();
			}catch (Exception e) {
				Reporter.log("Create Another Price Book Handled",true);
			}

			pb.priceBookName(pbName);
			pb.pricingModelClick();
			pb.pricingModelSelect();
			pb.priceBookDescription(pbDescription);
			pb.fromRange(fRange);
			pb.toRange(tRange);
			pb.discount(dsc);
			pb.saveButton();
			pb.addProducts();
			pb.clickCheckBoxAddProducts3();

			pb.listPrice(lPrice);
			pb.addToProducts();
			pb.priceBooksButtonOutFrame();
			lp.logOutClick();
			lp.logOut();

		}
}
