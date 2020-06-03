package com.zoho.crm.scripts.CommonDP;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.pages.ProductsPage;
import com.zoho.crm.generics.BaseTest;

public class ProductsScript extends BaseTest{
	public String[][] getLogin= null;
	public String[][] getProducts= null;

	LoginPage lp=null;
	ProductsPage pg = null;
	public static final Logger log =  LogManager.getLogger(ProductsScript.class.getName());

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
	    @Test(dataProviderClass=BaseTest.class,dataProvider = "dp",priority = 1,groups = "Products")
		public void createProductsOrder(String search,String prodName,String prodCode,String vendName,String vendPhone,
				String vendEmail,String selManft,String salesStrDate,String salesEndDate,String suppStrDate
			,String suppExpDate,String unitPrice,String commRate,String prodQty,String qtyStock
			,String reOrdLevel,String qtyDemand,String prodDescription) throws InterruptedException
		{
			
			   pg = new ProductsPage(driver);
               pg.moreOptions();
               pg.searchBox(search);
               pg.productOrdersClick();
               
               /*******To find the no of records***********************/
             
            //WebElement listSearch = driver.findElement(By.xpath("//div[@id='listviewtablescroll']/table/tbody"));
     
               /*******End To find the no of records*******************/
			   try {
					  pg.clickCreateProducts(); 
					  log.info("Clicked on create Products link");
					   
				   }catch (Exception e) {
					   log.debug("Click Create Product not visible, but handled-->createNewProduct");
				}
				
			   Thread.sleep(10000);
				List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='listviewtablescroll']/table/tbody/tr"));
		        System.out.println("Total no of records is: "+ list1.size());
			   
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
			   pg.clickOnTimeline();
			   try {
				   pg.clickOnNewVersion();
			} catch (Exception e) {
				log.info("Switch to New Version  button not visible");
			}
			   pg.clickOnTimeline();
			   pg.clickOnOverview();
			   pg.productsButtonOutFrame();
			   lp.logOutClick();
			   lp.logOut();
	
		}
}
