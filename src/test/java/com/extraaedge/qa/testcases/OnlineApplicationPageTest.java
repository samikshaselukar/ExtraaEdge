package com.extraaedge.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.extraaedge.qa.base.TestBase;
import com.extraaedge.qa.pages.HomePage;
import com.extraaedge.qa.pages.OnlineApplicationPage;
import com.extraaedge.qa.pages.RegistrationPage;
import com.extraaedge.qa.util.TestUtil;

public class OnlineApplicationPageTest extends TestBase{
	HomePage homePage;
	RegistrationPage registrationPage;
	OnlineApplicationPage onlineApplicationPage ;
	String sheetname1 = "registration";
	public OnlineApplicationPageTest() {
		super();
	}
	@DataProvider
	public Object[][] getPersonalDetails() throws Throwable{
		Object data[][] = TestUtil.getTestData(sheetname1);
		return data;
	}
	@BeforeClass
	public void setUp() {
		initialization();		
		registrationPage = new RegistrationPage();
		registrationPage.clickApply();
		
	}
	
	@Test(priority = 1, dataProvider = "getRegistrationDetails",dataProviderClass=RegistrationPageTest.class)
	public void getTitleTest(String FirstName,String Email,String CountryCode,String Mobile,String Entity2,String Entity3, String Comment) {
		registrationPage.enterDetails(FirstName, Email, CountryCode, Mobile, Entity2, Entity3,  Comment);
		onlineApplicationPage = registrationPage.clickFillApplication();
		TestUtil.switchWindow();
		
		Assert.assertEquals(driver.getTitle(),"The ExtraaEdge Staging | Application Form Management System","Title not matched");
	}
	
	
	@Test(priority = 2)
	public void openPersonalDetails() {
		
		onlineApplicationPage.clickProceed();		
	}
		
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}