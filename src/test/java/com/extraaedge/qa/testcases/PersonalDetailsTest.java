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
import com.extraaedge.qa.pages.PersonalDetailsPage;
import com.extraaedge.qa.pages.RegistrationPage;
import com.extraaedge.qa.util.TestUtil;

public class PersonalDetailsTest extends TestBase {

	HomePage homePage;
	RegistrationPage registrationPage;
	OnlineApplicationPage onlineApplicationPage ;
	PersonalDetailsPage personalDetailsPage;
	String sheetname = "personalDetails";
	public PersonalDetailsTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();		
		registrationPage = new RegistrationPage();
		registrationPage.clickApply();
		
		
		
	}
	
	@DataProvider
	public Object[][] getPersonalDetails() throws Throwable{
		Object data[][] = TestUtil.getTestData(sheetname);
		return data;
	}
	
	
	@Test(priority = 1, dataProvider = "getRegistrationDetails",dataProviderClass=RegistrationPageTest.class)
	public void openPersonalDetails(String FirstName,String Email,String CountryCode,String Mobile,String Entity2,String Entity3, String Comment) {
		registrationPage.enterDetails(FirstName, Email, CountryCode, Mobile, Entity2, Entity3,  Comment);
		onlineApplicationPage = registrationPage.clickFillApplication();
		TestUtil.switchWindow();
		personalDetailsPage = onlineApplicationPage.clickProceed();
	}
	@Test(priority = 2, dataProvider ="getPersonalDetails")
	public void fillPersonalDetails(String Stream,String Course,String CampusPreference,String PreferenceDate,String DateOfBirth,String BloodGroup,String Gender,String Category,String Religion,String Nationality,String AltMobile,String AltEmail,String PassportNo,String Domicile,String Citizenship,String Caste,String PhysicallyChallenged,String Country,String State,String District,String AddressLine1,String AddressLine2,String Pincode,String CorrespondenceSame,String CountryP,String StateP,String DistrictP,String CityP,String AddressLine1P,String AddressLine2P,String PincodeP,String MedicalConcern,String MedicalConcerns,String MedicalRequire,String Allery) throws InterruptedException {
		personalDetailsPage.test(Stream,Course,CampusPreference,PreferenceDate,DateOfBirth,BloodGroup,Gender,Category,Religion,Nationality,AltMobile,AltEmail,PassportNo,Domicile,Citizenship,Caste,PhysicallyChallenged,Country,State,District,AddressLine1,AddressLine2,Pincode,CorrespondenceSame,CountryP,StateP,DistrictP,CityP,AddressLine1P,AddressLine2P,PincodeP,MedicalConcern,MedicalConcerns,MedicalRequire,Allery);
	}
		
		
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}

}
