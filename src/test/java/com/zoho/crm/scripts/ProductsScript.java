package com.zoho.crm.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.pages.ProductsPage;
import com.zoho.crm.pages.PurchaseOrdersPage;
import com.zoho.crm.generics.BaseTest;
import com.zoho.crm.generics.FUtils;
import com.zoho.crm.generics.IConstant;
import com.zoho.crm.generics.ReadExcel2D;

public class ProductsScript extends BaseTest{
	public String[][] getLogin= null;
	public String[][] getProducts= null;

	LoginPage lp=null;
	ProductsPage pg = null;
	public static final Logger log =  LogManager.getLogger(ProductsScript.class.getName());
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
	    	log.info("Login Details Fetch successful");
			return getLogin;
	   }
	   
	    @BeforeClass
	    @DataProvider(name = "zohoCrmProductsData")
	    //@Test(priority = 1 , groups = "Products")
	    public Object[][] productsData()
	    {
			try {
				
				getProducts = ReadExcel2D.getData(IConstant.EXCEL_PATH,"ProductDetails");
	    }	
			catch (Exception e) {
			e.printStackTrace();
		}
			log.info("Products details Fetch successful");
			return getProducts;
	   }
	    
	    @Test(dataProvider = "zohoCrmLoginData",priority = 0,groups = "Login")
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
	    
		@Test(dataProvider = "zohoCrmProductsData", priority = 1,groups = "Products")
		public void productsPage(String search,String prodName,String prodCode,String vendName,String vendPhone,
				String vendEmail,String selManft,String salesStrDate,String salesEndDate,String suppStrDate
			,String suppExpDate,String unitPrice,String commRate,String prodQty,String qtyStock
			,String reOrdLevel,String qtyDemand,String prodDescription)
		{
			
			   pg = new ProductsPage(driver);
               pg.moreOptions();
               pg.searchBox(search);
               pg.productOrdersClick();
			   
			   try {
					  pg.clickCreateProducts(); 
					  log.info("Clicked on create Products link");
					   
				   }catch (Exception e) {
					   log.debug("Click Create Product not visible, but handled-->createNewProduct");
				}
				   
			   try {
					   pg.clickAnotherProducts();
					   log.info("Clicked on create Another Products link");
					   
				   }catch (Exception e) {
					   log.debug("Click Another product not visible, but handled-->createAnotherProduct");
				}
			   
			   pg.createProducts(prodName);
			   pg.createProductsCode(prodCode);
			   pg.clickVendorLookUp();
			   pg.createNewVendor();
			   pg.vendorName(vendName);
			   pg.vendorPhone(vendPhone);
			   pg.vendorEmail(vendEmail);
			   pg.vendorSave();
			   pg.selVendor();
			   pg.clickManftr();
			   pg.selManufacturer(selManft);
			   
			   pg.clickprodCategory();
			   pg.selProdCategory();
			   pg.selStartDate(salesStrDate);
			   pg.selEndDate(salesEndDate);
			   pg.suppStartDate(suppStrDate);
			   pg.suppExpDate(suppExpDate);
			   pg.enterUnitPrice(unitPrice);
			   pg.enterCommRate(commRate);
			   pg.clickTax();
			   pg.selTax();

			   /********Stock information********/
			   pg.selUsage();
			   pg.selUsageUnit();
			   pg.qtyOrdered(prodQty);
			   pg.qtyStock(qtyStock);
			   pg.reOrdlevel(reOrdLevel);
			   pg.clickHandler();
			   pg.setHandler();
			   pg.qtyDemand(qtyDemand);
			   pg.prodDescription(prodDescription);
			   pg.save();
			   pg.clickOnNewVersion();
			   pg.productsButtonOutFrame();
			   lp.logOutClick();
			   lp.logOut();
	
		}
	    
//	    @AfterClass
//	    @Test(dependsOnMethods = "productsPage", alwaysRun = true)
//	    public void browserClose()
//	    {
//	    	closeBrowser();
//	    }
}
