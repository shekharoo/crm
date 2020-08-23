package com.zoho.crm.scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.generics.BaseTest;
import com.zoho.crm.generics.IConstant;
import com.zoho.crm.generics.ReadExcel2D;

public class LoginScript extends BaseTest{
	public String[][] getLogin= null;
	LoginPage lp=null;
	
	   // @BeforeTest
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
	    
	    
	    @Test(dataProvider = "zohoCrmLoginData",groups = "Login")
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
			//lp.ClickCrm();
			lp.logOutClick();
			lp.logOut();
			
	    }
	    
//	    @AfterMethod
//	    @Test(dependsOnMethods = "login", alwaysRun = true)
//	    public void browserClose()
//	    {
//	    	closeBrowser();
//	    }
}
