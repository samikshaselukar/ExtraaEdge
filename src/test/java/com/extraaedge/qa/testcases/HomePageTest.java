package com.extraaedge.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.extraaedge.qa.base.TestBase;
import com.extraaedge.qa.pages.HomePage;


public class HomePageTest extends TestBase {
	HomePage homePage;
	//LoginPage loginPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();		
	}
	
	@Test
	public void popupTest() {
		homePage.clickApply();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

