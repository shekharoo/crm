package com.zoho.crm.scripts.CommonDP;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.generics.BaseTest;

public class LoginScript extends BaseTest{
	public String[][] getLogin= null;
	LoginPage lp=null;
	public static final Logger log =  LogManager.getLogger(LoginScript.class.getName());
	    
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
			lp.logOutClick();
			lp.logOut();
			
	    }
}
