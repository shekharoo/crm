//package com.zoho.crm.scripts;
//
//import java.util.HashMap;
//import java.util.Map;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.apache.logging.log4j.LogManager;
//import org.testng.Assert;
//import org.testng.Reporter;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.zoho.crm.pages.LoginPage;
//import com.zoho.crm.pages.PriceBooksPage;
//import com.zoho.crm.pages.ProductsPage;
//import com.zoho.crm.pages.PurchaseOrdersPage;
//import com.zoho.crm.pages.QuotesPage;
//import com.zoho.crm.pages.SalesOrdersPage;
//import com.zoho.crm.pages.ZohoCrmHomePage;
//import com.zoho.crm.generics.BaseTest;
//import com.zoho.crm.generics.ReadExcel2D;
//
//
//public class TestLogin3_MapWay extends BaseTest{
//	    int saveAndNewCount = 0;
//	    int saveCount = 0;
//	    int counter = 0;
//	    public boolean found = false;
//	
//	   public static final Logger log =  LogManager.getLogger(TestLogin3_MapWay.class.getName());
//	   //public Logger log1 =  LogManager.getLogger(TestLogin3_MapWay);
//	    Map<Integer,Object[]>  map = new HashMap<>();
//	 public String[][] getLogin= null;
//	    public String[][] getProducts= null;
//	    public String[][] getExceptions= null;
//	    public String[][] getExceptions1= null;
//	    public String[][] getExceptions2= null;
//	    public String[][] getQuotes= null;
//	    public String[][] priceBooks= null;
//	    public String[][] purchaseOrders= null;
//	    public String[][] salesOrders= null;
//	    
//	    //public Object[] getLogin = null;
//	    
//	    LoginPage lp=null;
//	    ZohoCrmHomePage hp = null;
//		ProductsPage pg = null;
//		QuotesPage qp = null;
//		PriceBooksPage pb = null;
//		PurchaseOrdersPage po = null;
//		SalesOrdersPage so = null;
//		
//	    @BeforeTest
//	    public void setUp1()
//	    {
//	    	openBrowser("chrome");
//	    	log.info("Browser opened succesfully");
//	    }
//         
//	    /*****************Code changes applying Excel Utility*************/
//	    @DataProvider(name = "zohoCrmLoginData")
//	    @Test
//	   public Object[][] loginData()
//	    {
////	    	ReadExcelMap2D m = new ReadExcelMap2D();
////	    	//ReadExcelMap m = new ReadExcelMap();
////	    	map = m.getData("./testData/input5.xlsx", "Login2");
////			/********Convert Map into 2D Array*********************/
//	    	getLogin = ReadExcel2D.getData("./testData/input5.xlsx", "Login2");
////	    	 = m.parseMap(map,"Login2");
//
////	    }	
////			catch (Exception e) {
////			e.printStackTrace();
////		}
//			return getLogin;
//	   }
//	    
//	    
////	    @DataProvider(name = "zohoCrmExceptionHomePage")
////	    //@Test
////	    public Object[][] exceptionData()
////	    {
////	    	ReadExcelMap2D m = new ReadExcelMap2D();
////			try {
//////				map = m.getData("./testData/input5.xlsx", "ExceptionsHomePage");
//////				/********Convert Map into 2D Array*********************/
//////				getExceptions = m.parseMap(map,"ExceptionsHomePage");
////				getExceptions = ReadExcel2D.getData("./testData/input5.xlsx", "ExceptionsHomePage");
////	    }	
////			catch (Exception e) {
////			e.printStackTrace();
////		}
////			return getExceptions;
////	   }
//	    
////	    @DataProvider(name = "zohoCrmExceptionProductsPage")
////	    //@Test
////	    public Object[][] exceptionData1()
////	    {
////	    	ReadExcelMap2D m = new ReadExcelMap2D();
////			//data = new ReadExcel();
////			try {
////				map = m.getData("./testData/input5.xlsx", "ExceptionsProdPage",0);
////				/********Convert Map into 2D Array*********************/
////				getExceptions1 = m.parseMap(map,"ExceptionsProdPage");
////	    }	
////			catch (Exception e) {
////			e.printStackTrace();
////		}
////			return getExceptions1;
////	   }
//////	    
//	    @DataProvider(name = "zohoCrmExceptionProductDeatilsPage")
//	    //@Test
//	    public Object[][] exceptionData2()
//	    {
//	    	//ReadExcelMap2D m = new ReadExcelMap2D();
//			//data = new ReadExcel();
//			try {
////				map = m.getData("./testData/input5.xlsx", "ExceptionsProdDetailsPage");
////				/********Convert Map into 2D Array*********************/
////				getExceptions2 = m.parseMap(map,"ExceptionsProdDetailsPage");
//				
//				getExceptions2 = ReadExcel2D.getData("./testData/input5.xlsx", "ExceptionsProdDetailsPage");
//	    }	
//			catch (Exception e) {
//			e.printStackTrace();
//		}
//			return getExceptions2;
//	   }
////	    
//	    @DataProvider(name = "zohoCrmProductsData")
//	    //@Test
//	    public Object[][] productsData()
//	    {
//	    	//ReadExcelMap2D m = new ReadExcelMap2D();
//			//data = new ReadExcel();
//			try {
////				map = m.getData("./testData/input5.xlsx", "ProductDetails");
////				/********Convert Map into 2D Array*********************/
////				getProducts = m.parseMap(map,"ProductDetails");
//				
//				getProducts = ReadExcel2D.getData("./testData/input5.xlsx", "ProductDetails");
//	    }	
//			catch (Exception e) {
//			e.printStackTrace();
//		}
//			return getProducts;
//	   }
//	    
//	    @DataProvider(name = "zohoCrmQuotesData")
//	    public Object[][] quotesData()
//	    {
//	    	//ReadExcelMap2D m = new ReadExcelMap2D();
//			//data = new ReadExcel();
//			try {
////				map = m.getData("./testData/input5.xlsx", "QuotesDetails");
////				/********Convert Map into 2D Array*********************/
////				getQuotes = m.parseMap(map,"QuotesDetails");
//				
//				getQuotes = ReadExcel2D.getData("./testData/input5.xlsx", "QuotesDetails");
//	    }	
//			catch (Exception e) {
//			e.printStackTrace();
//		}
//			return getQuotes;
//	   }
//	    
//	    @DataProvider(name = "zohoCrmPriceBooksData")
//	    public Object[][] priceBooksData()
//	    {
//	    	//ReadExcelMap2D m = new ReadExcelMap2D();
//			//data = new ReadExcel();
//			try {
////				map = m.getData("./testData/input5.xlsx", "QuotesDetails");
////				/********Convert Map into 2D Array*********************/
////				getQuotes = m.parseMap(map,"QuotesDetails");
//				
//				priceBooks = ReadExcel2D.getData("./testData/input5.xlsx", "PriceBooks");
//	    }	
//			catch (Exception e) {
//			e.printStackTrace();
//		}
//			return priceBooks;
//	   }
//	    
//	    @DataProvider(name = "zohoCrmPurchaseOrdersData")
//	    public Object[][] purchaseOrdersData()
//	    {
//			//data = new ReadExcel();
//			try {
//				purchaseOrders = ReadExcel2D.getData("./testData/input5.xlsx","PurchaseOrders");
//	    }	
//			catch (Exception e) {
//			e.printStackTrace();
//		}
//			return purchaseOrders;
//	   }
//	    
//	    @DataProvider(name = "zohoCrmSalesOrdersData")
//	    public Object[][] salesOrdersData()
//	    {
//			//data = new ReadExcel();
//			try {
//				salesOrders = ReadExcel2D.getData("./testData/input5.xlsx","SalesOrders1");
//	    }	
//			catch (Exception e) {
//			e.printStackTrace();
//		}
//			return salesOrders;
//	   }
//	    
//	    /*****************End Code changes applying Excel Utility*************/
//
//	   /*****************************************************************************************/
//	    @Test(dataProvider = "zohoCrmLoginData",priority = 0,groups = "Login")
//	    public void login(String url,String mail,String pswd)
//	    {
//	    	lp  = new LoginPage(driver);
//	    	//System.out.println("2"+getLogin[1][0]);
//	    	openUrl(driver, url);
//			lp.loginClick();
//			lp.eMail(mail);
//			lp.nextBtnClick();
//			lp.password(pswd);
//		    lp.signInClick();
//			try {
//				lp.yesIUnd();
//			}catch (Exception e) {
//				log.info("No Yes I understand is Displayed, but handled");
//			}
//			
//	    }
//	    
////		
////		@Test(dataProvider = "zohoCrmExceptionHomePage", priority = 1,groups = "Login",dependsOnMethods = "login")
////		public void handleException(String excep1)
////		{
////			lp  = new LoginPage(driver);
////			try {
////				lp.yesIUnd();
////			}catch (Exception e) {
////				System.out.println(excep1);
////			}
////			
////			lp.ClickCrm();
////		}
////		
////		@Test(dataProvider = "zohoCrmExceptionProductsPage", priority = 3)
////		public void handleException1(String excep1,String excep2)
////		{
////			pg =new ProductsPage(driver);
////			try {
////				  pg.clickCreateProducts(); 
////				   
////			   }catch (Exception e) {
////				System.out.println(excep1);
////			}
////			   
////			   try {
////				   pg.clickAnotherProducts();
////				   
////			   }catch (Exception e) {
////				System.out.println(excep2);
////			}
////		}
//		
//		@Test( priority = 1, groups = "Products")
//		public void clickProductsLink()
//		{
//            hp  = new ZohoCrmHomePage(driver);
//			
//			//hp.moreClick();
//			//hp.products();
//            hp.productsButton();
//		}
//	    /**
//	     * 
//	     * @param prodName
//	     * @param prodCode
//	     * @param vendName
//	     * @param vendPhone
//	     * @param vendEmail
//	     * @param selManft
//	     * @param salesStrDate
//	     * @param salesEndDate
//	     * @param suppStrDate
//	     * @param suppExpDate
//	     * @param unitPrice
//	     * @param commRate
//	     * @param prodQty
//	     * @param qtyStock
//	     * @param reOrdLevel
//	     * @param qtyDemand
//	     * @param prodDescription
//	     */
//		//@Test(dataProvider = "zohoCrmProductsData", priority = 3,invocationCount = 1)
//		@Test(dataProvider = "zohoCrmProductsData", priority = 3, dependsOnMethods = "clickProductsLink",groups = "Products")
//		public void productsPage(String prodName,String prodCode,String vendName,String vendPhone,
//				String vendEmail,String selManft,String salesStrDate,String salesEndDate,String suppStrDate
//			,String suppExpDate,String unitPrice,String commRate,String prodQty,String qtyStock
//			,String reOrdLevel,String qtyDemand,String prodDescription)
//		{
//			
//			   pg = new ProductsPage(driver);
//                
//			   /*******Changes done to run it twice*******/
//			   try {
//					  pg.clickCreateProducts(); 
//					   
//				   }catch (Exception e) {
//					//System.out.println(excep1);
//					   System.out.println("Click Create Product not visible, but handled-->createNewProduct");
//				}
//				   
//				   try {
//					   pg.clickAnotherProducts();
//					   
//				   }catch (Exception e) {
//					//System.out.println(excep2);
//					   System.out.println("Click Another product not visible, but handled-->createAnotherProduct");
//				}
//			   /*******End Changes done to run it twice*******/
//			   
//			   pg.createProducts(prodName);
//			   pg.createProductsCode(prodCode);
//			   pg.clickVendorLookUp();
//			   pg.createNewVendor();
//			   pg.vendorName(vendName);
//			   pg.vendorPhone(vendPhone);
//			   pg.vendorEmail(vendEmail);
//			   pg.vendorSave();
//			   pg.selVendor();
//			   pg.clickManftr();
//			   pg.selManufacturer(selManft);
//			   
//			   pg.clickprodCategory();
//			   pg.selProdCategory();
//			   pg.selStartDate(salesStrDate);
//			   pg.selEndDate(salesEndDate);
//			   pg.suppStartDate(suppStrDate);
//			   pg.suppExpDate(suppExpDate);
//			   pg.enterUnitPrice(unitPrice);
//			   pg.enterCommRate(commRate);
//			   pg.clickTax();
//			   pg.selTax();
//
//			   /********Stock information********/
////			   pg.selUsage();
////			   pg.selUsageUnit();
//			   pg.qtyOrdered(prodQty);
//			   pg.qtyStock(qtyStock);
//			   pg.reOrdlevel(reOrdLevel);
//			   pg.clickHandler();
//			   pg.setHandler();
//			   pg.qtyDemand(qtyDemand);
//			   pg.prodDescription(prodDescription);
//			   pg.save();
////			   pg.clickOnProducts();
//       		  
////       		   if(saveAndNewCount == 1 && counter == 0)
////       		   {
////       			pg.save();
////       		   }
////       		   try {
////       		   pg.saveAndNew();
////       		   saveAndNewCount++;
////       		   }catch (Exception e) {
////			}finally {
////				System.out.println("I m in finally Block..");
////				pg.productsButtonOutFrame();
////			}
//			   
//			   /*************Product Details page*********/
//		}
//		
//		@Test(dataProvider = "zohoCrmExceptionProductDeatilsPage", priority = 4,groups = "Products")
//		public void handleException2(String excep1,String excep2)
//		{
//			 pg = new ProductsPage(driver);
//			
//			try {
//				   pg.clickOnNewVersion();
//				   }catch (Exception e) {
//					System.out.println(excep1);
//				}
//				   pg.clickOnTimeline();
//				   pg.clickOnOverview();
//				   System.out.println("I m jst before Products click button");
//				   pg.productsButtonOutFrame();
//				   System.out.println(excep2);
//				  // Assert.assertTrue(condition);
//		}
//		
//	/****************Create Quotes*******************************************/
//		@Test(dataProvider = "zohoCrmQuotesData", priority = 5, groups = "Quotes")
//		public void createQuote(String dAmt, String dName, String dClosDate, String dAccount,String subj,
//				String validDate,String fname, String lname, String email, String phoneNo, String teamSize,
//				String acName, String acPhone,  String acWebsite,String billStreet, String billCity,
//				String billState, String billCode, String billCountry,String prodName1, String qty1, 
//				String prodName2, String qty2, String tandCond, String desc)
//		{
//            qp  = new QuotesPage(driver);
//			
//			qp.clickQuotesLink();	
//			
//			try {
//				qp.createNewQuote();
//		} catch (Exception e) {
//			System.out.println("New Create Quote button exception handled");
//		}
//			try {
//			qp.createAnotherQuoteButton();
//		} catch (Exception e) {
//			System.out.println("Create Another Quote Handled");
//		}
//			qp.dealNameLookUpIcon();
////			qp.newDeal();
////			qp.dealAmount(dAmt);
////			qp.dealName(dName);
////			qp.dealClosingDate(dClosDate);
////			qp.dealAccount(dAccount);
////			qp.newAccountExcep();
//			//qp.stageChoose();
//			qp.chooseDeal();
////			qp.dealSave();
//			//qp.dealNameLookUpIcon();
//			//qp.chooseDeal();
//			qp.subjectTF(subj);
//			qp.validUntil(validDate);
//			qp.quoteStageClick();
//			qp.quoteStageSelect();
//			/**************To select Contact***************************/
//			qp.contactNameLookUpIcon();
//			//qp.chooseContact();
//			
//			qp.newContactButton();
//			qp.titleClick();
//			qp.selectMr();
//			qp.firstName(fname);
//			qp.lastName(lname);
//			qp.accountNameLookUpInContact();
//			qp.chooseAccount();
//			qp.eMail(email);
//			qp.phone(phoneNo);
//			qp.saveContact();
//			qp.chooseContact();
//			/***********************End contact*************************/
//			qp.team(teamSize);
//			/*************To select Account****************/
//			qp.accountNameLookUpIconInAccount();
//			qp.newAccountButton();
//			qp.accountName(acName);
//			qp.accountPhone(acPhone);
//			qp.accountWebsite(acWebsite);
//			qp.accountSave();
//			qp.chooseAccount();
//			/*****************End Account*******************/
//			qp.carrierListBoxClick();
//			qp.carrierSelect();
//			qp.billingStreet(billStreet);
//			qp.billingCity(billCity);
//			qp.billingState(billState);
//			qp.billingCode(billCode);
//			qp.billingCountry(billCountry);
//			qp.copyAddressClick();
//			qp.copyAddressSelect();
//			qp.addLineItemsClick();
//			qp.searchProdNameClick1(prodName1);
//			qp.searchProdNameSelect1();
//			qp.quantityEnter1(qty1);
//			qp.addProductClick();
//			qp.searchProdNameClick2(prodName2);
//			qp.searchProdNameSelect2();
//			qp.quantityEnter2(qty2);
//			qp.addProdButton();
//			qp.termsAndConditions(tandCond);
//			qp.description(desc);
//			qp.saveQuote();
//			qp.quotesButtonOutFrame();
//			Reporter.log("Successfully done with Quotes",true);
//
//        }
//	/**************************Create Price Books******************/
//		@Test(dataProvider = "zohoCrmPriceBooksData", priority = 6, groups = "priceBooks")
//		public void createPriceBooks(String search, String pbName, String pbDescription, 
//				String fRange,String tRange,String dsc, String lPrice)
//		{
//			pb  = new PriceBooksPage(driver);
//			pb.moreOptions();
//			pb.searchBox(search);
//			pb.priceBooksClick();
//			try {
//				pb.createNewPriceBooksButton();
//			}catch (Exception e) {
//				Reporter.log("Create New Price Book Handled",true);
//			}
//			try {
//				pb.createAnotherPriceBooksButton();
//			}catch (Exception e) {
//				Reporter.log("Create Another Price Book Handled",true);
//			}
//			//pb.present();
//			//pb.createNewPriceBooksButton();
//			pb.priceBookName(pbName);
//			pb.pricingModelClick();
//			pb.pricingModelSelect();
//			pb.priceBookDescription(pbDescription);
//			pb.fromRange(fRange);
//			pb.toRange(tRange);
//			pb.discount(dsc);
//			pb.saveButton();
//			pb.addProducts();
//			//try {
//			pb.clickCheckBoxAddProducts3();
//			//} catch (Exception e) {
//			//	System.out.println("Handled in catch 1");
//			//}
////			try {
////				pb.clickCheckBoxAddProducts2();
////			} catch (Exception e) {
////				System.out.println("Handled in catch 2");
////			}
////			try {
////				pb.clickCheckBoxAddProducts3();
////			} catch (Exception e) {
////				System.out.println("Handled in catch 3");
////			}
//			//pb.clickCheckBoxAddProducts();
//			pb.listPrice(lPrice);
//			pb.addToProducts();
//			pb.priceBooksButtonOutFrame();
//
//		}
//		/**************************Purchase Orders******************/
//		
//		@Test(dataProvider = "zohoCrmPurchaseOrdersData", priority = 7, groups = "purchaseOrders")
//		public void createPurchaseOrders(String search, String purchNo, String subj, 
//				String vName,String vPhone,String vEmail, String reqNo, String trackNo,String purchaseOrderDate,
//				String purchaseDueDate,String excDuty,String salesComm,String billStreet,String billCity,String billState,
//				String billCode,String billCountry,String prodName1,String qty1,String prodName,String prodCode,
//				String uPrice,String qty,String tandCond,String desc)
//		{
//			po = new PurchaseOrdersPage(driver);
//			
//			po.moreOptions();
//			po.searchBox(search);
//			po.purchaseOrdersClick();
//			
//			try {
//				po.createNewPurchaseOrders();
//			} catch (Exception e) {
//				System.out.println("Create New Purchase Order Handled");
//			}
//			
//			try {
//				po.createAnotherPurchase();
//			} catch (Exception e) {
//				System.out.println("Create Another Purchase Order Handled");
//			}
//			
//			po.poNumber(purchNo);
//			po.subject(subj);
//			po.vendorNameLookUpIcon();
//			po.newVendorClick();
//			po.vendorName(vName);
//			po.vendorPhone(vPhone);
//			po.vendorEmail(vEmail);
//			po.saveVendor();
//			po.vendorSelect();
//			
//			po.requisitionNumber(reqNo);
//			po.trackingNumber(trackNo);
//			po.contactNameLookUpIconInPO();
//			po.chooseContact();
//			
//			po.poDate(purchaseOrderDate);
//			po.poDueDate(purchaseDueDate);
//			
//			po.carrierListBoxClick();
//			po.carrierSelect();
//			
//			po.exciseDuty(excDuty);
//			po.salesCommission(salesComm);
//			po.statusClick();
//			po.statusSelect();
//			
//			po.billingStreet(billStreet);
//			po.billingCity(billCity);
//			po.billingState(billState);
//			po.billingCode(billCode);
//			po.billingCountry(billCountry);
//			
//			po.copyAddressClick();
//			po.copyAddressSelect();
//			
//			po.addLineItemsClick();
//			po.checkboxVendor();
//			po.prodNameSearch(prodName1);
//			po.searchProdNameSelect1();
//			po.quantityEnter1(qty1);
////			
////			try {
////				po.handleAlertAddProducts();
////			} catch (Exception e) {
////				Reporter.log("Alert Handled",true);
////			}
////			po.searchProdNameClick();
////			po.addNewProduct();
////			
////			po.productName(prodName);
////			po.productCode(prodCode);
////			po.vendorNameLookUpIconinNewProduct();
////			po.vendorSelectInAddNewProduct();
////			po.unitPrice(uPrice);
////			po.tax();
////			po.salesTax();
////			po.saveCreateProduct();
//	
//			po.addproductButtonInChooseProducts();
//			
//			po.termsAndConditions(tandCond);
//			po.description(desc);
//			
////			po.vendorNameLookUpIcon();
////			po.vendorSelect();
//			
//			po.savePOButton();
//			po.purchaseOrdersButtonOutFrame();
//	
//		}
//		
///**************************Sales Orders******************/
//		
////		@Test(dataProvider = "zohoCrmSalesOrdersData", priority = 8, groups = "salesOrders")
////		public void createSalesOrders(String search, String dAmount, String dName, 
////				String dClosingDate,String subj,String poNo, String custNo, String dDate,String fName,
////				String lName,String mail,String phn,String pend,
////				String exDuty,String salComm,String billStreet,String billCity,String billState,
////				String billCode,String billCountry,String prodName1,String qty1,String tandCond,String desc)
////		{
////			so = new SalesOrdersPage(driver);
////			
////			so.moreOptions();
////			so.searchBox(search);
////			so.salesOrdersClick();
////			
////			try {
////				so.createNewSalesOrders();
////			} catch (Exception e) {
////				System.out.println("Create New Sales Order Handled");
////			}
////			
////			try {
////				so.createAnotherSalesOrders();
////			} catch (Exception e) {
////				System.out.println("Create Another Sales Order Handled");
////			}
////			
////			so.dealNameLookUpIcon();
////			so.newDeal();
////			so.dealAmount(dAmount);
////			so.dealName(dName);
////			so.dealClosingDate(dClosingDate);
////			so.accountNameLookUpIcon();
////			so.selectAccount();
////			so.stageDropDown();
////			so.stageChoose();
////			so.dealSave();
////			so.chooseDeal();
////			
////			so.subject(subj);
////			so.poNumber(poNo);
////			so.custNumber(custNo);
////			so.DueDate(dDate);
////			so.quoteNameLookUpIcon();
////			so.selectQuote();
////			so.contactNameLookUpIcon();
////			so.showContactClick();
////			so.allContactsSelect();
//////			so.newContactButton();
//////			so.titleClick();
//////			so.selectMr();
//////			so.firstName(fName);
//////			so.lastName(lName);
//////			so.accountNameLookUpInContact();
//////			so.selectAccountInContact();
//////			so.eMail(mail);
//////			so.phone(phn);
//////			so.saveContact();
////			
////			so.selectContact();
////			
////			so.pending(pend);
////			so.exciseDuty(exDuty);
////			
////			so.carrierListBoxClick();
////			so.carrierSelect();
////			
////			so.statusClick();
////			so.statusSelect();
////			
////			so.salesCommission(salComm);
////			
////			so.accountNameLookUp();
////			so.chooseAccount();
////			
////			so.billingStreet(billStreet);
////			so.billingCity(billCity);
////			so.billingState(billState);
////			so.billingCode(billCode);
////			so.billingCountry(billCountry);
////			
////			so.addLineItemsClick();
////			so.prodNameSearch(prodName1);
////			so.searchProdNameSelect1();
////			so.quantityEnter1(qty1);
////			so.addproductButtonInChooseProducts();
////			
////			so.termsAndConditions(tandCond);
////			so.description(desc);
////			
////			so.saveSOButton();
////			so.salesOrdersButtonOutFrame();
////
////		}
//		
///**************************Sales Orders   Revise******************/
//		
//		@Test(dataProvider = "zohoCrmSalesOrdersData", priority = 8, groups = "salesOrders")
//		public void createSalesOrders(String search,String poNo, String custNo, String dDate,String pend,
//				String exDuty,String salComm,String tandCond)
//		{
//			so = new SalesOrdersPage(driver);
//			
//			so.moreOptions();
//			so.searchBox(search);
//			so.salesOrdersClick();
//			
//			try {
//				so.createNewSalesOrders();
//			} catch (Exception e) {
//				System.out.println("Create New Sales Order Handled");
//			}
//			
//			try {
//				so.createAnotherSalesOrders();
//			} catch (Exception e) {
//				System.out.println("Create Another Sales Order Handled");
//			}
//			
//			so.quoteNameLookUpIcon();
//			so.selectQuote();
//			//PageFactory.initElements(driver, so);
//			so.poNumber(poNo);
//			so.custNumber(custNo);
//			so.DueDate(dDate);
//			so.pending(pend);
//			so.exciseDuty(exDuty);
////			so.statusClick();
////			so.statusSelect();
//			so.salesCommission(salComm);
//			so.termsAndConditions(tandCond);
//			
//			
////			so.dealNameLookUpIcon();
////			so.newDeal();
////			so.dealAmount(dAmount);
////			so.dealName(dName);
////			so.dealClosingDate(dClosingDate);
////			so.accountNameLookUpIcon();
////			so.selectAccount();
////			so.stageDropDown();
////			so.stageChoose();
////			so.dealSave();
////			so.chooseDeal();
////			
////			so.subject(subj);
////			so.poNumber(poNo);
////			so.custNumber(custNo);
////			so.DueDate(dDate);
////			so.quoteNameLookUpIcon();
////			so.selectQuote();
////			so.contactNameLookUpIcon();
////			so.showContactClick();
////			so.allContactsSelect();
//////			so.newContactButton();
//////			so.titleClick();
//////			so.selectMr();
//////			so.firstName(fName);
//////			so.lastName(lName);
//////			so.accountNameLookUpInContact();
//////			so.selectAccountInContact();
//////			so.eMail(mail);
//////			so.phone(phn);
//////			so.saveContact();
////			
////			so.selectContact();
////			
////			so.pending(pend);
////			so.exciseDuty(exDuty);
////			
////			so.carrierListBoxClick();
////			so.carrierSelect();
////			
//
////			
////			so.salesCommission(salComm);
////			
////			so.accountNameLookUp();
////			so.chooseAccount();
////			
////			so.billingStreet(billStreet);
////			so.billingCity(billCity);
////			so.billingState(billState);
////			so.billingCode(billCode);
////			so.billingCountry(billCountry);
////			
////			so.addLineItemsClick();
////			so.prodNameSearch(prodName1);
////			so.searchProdNameSelect1();
////			so.quantityEnter1(qty1);
////			so.addproductButtonInChooseProducts();
////			
////			so.termsAndConditions(tandCond);
////			so.description(desc);
////			
//			so.saveSOButton();
//			so.salesOrdersButtonOutFrame();
//			System.out.println("Switch out of frame also exceuted..");
//
//		}
//			
//			
//			
//}
//
