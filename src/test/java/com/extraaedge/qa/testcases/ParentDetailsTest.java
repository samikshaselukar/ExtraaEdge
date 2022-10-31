package com.extraaedge.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.extraaedge.qa.base.TestBase;
import com.extraaedge.qa.pages.HomePage;
import com.extraaedge.qa.pages.OnlineApplicationPage;
import com.extraaedge.qa.pages.RegistrationPage;

public class ParentDetailsTest extends TestBase{

	HomePage homePage;
	RegistrationPage registrationPage;
	OnlineApplicationPage onlineApplicationPage ;
	
	public ParentDetailsTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();		
		registrationPage = new RegistrationPage();
	}
	
	@Test(priority = 1)
	public void getTitleTest() {
		Assert.assertEquals(driver.getTitle(),"ExtraaEdge | (Demo) Form Widget","Title not matched");
	}
	
	@Test(priority = 2)
	public void openSignUp() {
		registrationPage.clickApply();		
	}
		
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
