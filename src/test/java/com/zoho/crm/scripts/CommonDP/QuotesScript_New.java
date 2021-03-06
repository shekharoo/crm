package com.zoho.crm.scripts.CommonDP;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.zoho.crm.generics.BaseTest;
import com.zoho.crm.pages.LoginPage;
import com.zoho.crm.pages.QuotesPage;

public class QuotesScript_New extends BaseTest{
	public String[][] getLogin= null;
	public String[][] getQuotes= null;

	LoginPage lp=null;
	QuotesPage qp = null;
	public static final Logger log =  LogManager.getLogger(QuotesScript_New.class.getName());
  
	@Test(dataProviderClass=BaseTest.class,dataProvider = "dp",priority = 0,groups = "Login")
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
	    
	    @Test(dataProviderClass=BaseTest.class,dataProvider = "dp",priority = 1,groups = "Quotes")
		public void createQuote(String dAmt, String dName, String dClosDate, String dAccount,String subj,
				String validDate,String fname, String lname, String email, String phoneNo, String teamSize,
				String acName, String acPhone,  String acWebsite,String billStreet, String billCity,
				String billState, String billCode, String billCountry,String prodName1, String qty1, 
				String prodName2, String qty2, String tandCond, String desc)
		{
            qp  = new QuotesPage(driver);
			
            qp.homePage();
			qp.clickQuotesLink();	
			
		try {
			qp.createNewQuote();
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		try {
			qp.createAnotherQuoteButton();
		} catch (Exception e) {
			// TODO: handle exception
		}
				qp.dealNameLookUpIcon();
		

		
				qp.newDeal();
		
			
				qp.dealAmount(dAmt);
		
	
				qp.dealName(dName);
		
				qp.dealClosingDate(dClosDate);
		
			qp.dealAccountLookUp();
			
				qp.chooseAccount();
			    qp.stageDropDown();
				qp.stageChoose();
				qp.dealSave();
				qp.chooseDeal();

			qp.subjectTF(subj);
			qp.validUntil(validDate);
			qp.quoteStageClick();
			qp.quoteStageSelect();
			/**************To select Contact***************************/
			qp.contactNameLookUpIcon();
//			qp.newAccountButton();
//			//qp.chooseContact();
//			
			qp.newContactButton();
			qp.titleClick();
			qp.selectMr();
			qp.firstName(fname);
			qp.lastName(lname);
			qp.accountNameLookUpInContact();
			qp.chooseAccount();
			qp.eMail(email);
			qp.phone(phoneNo);
			qp.saveContact();
			qp.chooseContact();
			/***********************End contact*************************/
			qp.team(teamSize);
			/*************To select Account****************/
			try {
				qp.accountNameLookUpIconInAccount();
				qp.newAccountButton();
				qp.accountName(acName);
				qp.accountPhone(acPhone);
				qp.accountWebsite(acWebsite);
				qp.accountSave();
				qp.chooseAccount();
			} catch (Exception e) {
				log.debug("Select Account handled..");
			}

			/*****************End Account*******************/
			qp.carrierListBoxClick();
			qp.carrierSelect();
			qp.billingStreet(billStreet);
			qp.billingCity(billCity);
			qp.billingState(billState);
			qp.billingCode(billCode);
			qp.billingCountry(billCountry);
			qp.copyAddressClick();
			qp.copyAddressSelect();
			qp.addLineItemsClick();
			qp.searchProdNameClick1(prodName1);
			qp.searchProdNameSelect1();
			qp.quantityEnter1(qty1);
			qp.addProductClick();
//			qp.searchProdNameClick2(prodName2);
//			qp.searchProdNameSelect2();
//			qp.quantityEnter2(qty2);
			qp.addProdButton();
			qp.termsAndConditions(tandCond);
			qp.description(desc);
			qp.saveQuote();
			qp.quotesButtonOutFrame();

			lp.logOutClick();
			lp.logOut();
        }
}
