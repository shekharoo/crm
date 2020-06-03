package com.zoho.crm.scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.pages.PriceBooksPage;
import com.zoho.crm.generics.BaseTest;
import com.zoho.crm.generics.IConstant;
import com.zoho.crm.generics.ReadExcel2D;

public class PriceBookScript extends BaseTest{
//	public String[][] getLogin= null;
//	public String[][] priceBooks= null;

	LoginPage lp=null;
	PriceBooksPage pb = null;
	
//	    @BeforeTest
//	    public void setUp1()
//	    {
//	    	openBrowser("chrome");
//	    }
	   // @BeforeClass
	    /*****************Code changes applying Excel Utility*************/
//	    @DataProvider(name = "zohoCrmLoginData")
//	    //@Test(priority = 0 , groups = "Login")
//	    public Object[][] loginData()
//	    {
//	    	try {
//	    		getLogin = ReadExcel2D.getData(IConstant.EXCEL_PATH, IConstant.EXCEL_SHEET);
//			} catch (Exception e) {
//				log.debug("Error while fetching Login Deatils frm Excel..");
//			}
//
//			return getLogin;
//	   }
	   
//	    @BeforeClass
//	    @DataProvider(name = "zohoCrmPriceBooksData")
//	    //@Test(priority = 1 , groups = "priceBooks")
//	    public Object[][] priceBooksData()
//	    {
//			try {
//				
//				priceBooks = ReadExcel2D.getData(IConstant.EXCEL_PATH, "PriceBooks");
//	    }	
//			catch (Exception e) {
//				log.debug("Error while fetching Price Book Deatils frm Excel..");
//		}
//			return priceBooks;
//	   }
	    
	    //@Test(dataProvider = "zohoCrmLoginData",priority = 0,groups = "Login")
	@Test(dataProviderClass=BaseTest.class,dataProvider = "dp",priority = 0,groups = "Login")
	    public void login(String url,String mail,String pswd)
	    {
		System.out.println("Url is: "+ url);
		System.out.println("mail is: "+ mail);
		System.out.println("pswd is: "+ pswd);
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
	    
		//@Test(dataProvider = "zohoCrmPriceBooksData", priority = 1, groups = "priceBooks")
		@Test(dataProviderClass=BaseTest.class,dataProvider = "dp",priority = 1,groups = "Login")
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
	    
//	    @AfterClass
//	    @Test(dependsOnMethods = "createPriceBooks", alwaysRun = true)
//	    public void browserClose()
//	    {
//	    	closeBrowser();
//	    }
}
