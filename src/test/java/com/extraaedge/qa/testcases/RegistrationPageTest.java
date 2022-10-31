package com.extraaedge.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.extraaedge.qa.base.TestBase;
import com.extraaedge.qa.pages.HomePage;
import com.extraaedge.qa.pages.RegistrationPage;
import com.extraaedge.qa.util.TestUtil;

public class RegistrationPageTest extends TestBase{
	HomePage homePage;
	RegistrationPage registrationPage;
	String sheetname = "registration";
	
	public RegistrationPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		/*homePage = new HomePage();	
		registrationPage = homePage.clickApply();
		*/
		registrationPage = new RegistrationPage();
	}
	@DataProvider
	public Object[][] getRegistrationDetails() throws Throwable{
		Object data[][] = TestUtil.getTestData(sheetname);
		return data;
	}
	@Test(priority = 1)
	public void getTitleTest() {
		Assert.assertEquals(driver.getTitle(),"ExtraaEdge | (Demo) Form Widget","Title not matched");
	}
	
	@Test(priority = 2)
	public void openSignUp() {
		registrationPage.clickApply();		
	}
	
	@Test(priority = 3, dataProvider = "getRegistrationDetails")
	public void enterDetailTest(String FirstName,String Email,String CountryCode,String Mobile,String Entity2,String Entity3, String Comment) {
		registrationPage.clickApply();
		registrationPage.enterDetails(FirstName, Email, CountryCode, Mobile, Entity2, Entity3,  Comment);
	}
	@Test(priority = 4)
	public void continueApplication(String FirstName,String Email,String CountryCode,String Mobile,String Entity2,String Entity3, String Comment) {
		registrationPage.clickApply();
		registrationPage.enterDetails(FirstName, Email, CountryCode, Mobile, Entity2, Entity3,  Comment);
		registrationPage.clickFillApplication();	
	}
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}




