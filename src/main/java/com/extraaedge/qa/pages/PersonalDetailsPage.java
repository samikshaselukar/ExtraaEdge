package com.extraaedge.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.extraaedge.qa.base.TestBase;
import com.extraaedge.qa.util.TestUtil;

public class PersonalDetailsPage extends TestBase{
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	@FindBy(id="react-select-3-input") WebElement entity3;
	@FindBy(id="react-select-3-option-0") WebElement entity3value;
	@FindBy(id="react-select-4-input") WebElement entity4;
	@FindBy(xpath="//div[@class=' css-1n7v3ny-option']") WebElement entity4value;
	
	
	@FindBy(id="react-select-5-input") WebElement preferredCity;
	@FindBy(xpath="//div[@class=' css-1n7v3ny-option']") WebElement selectValue;
	
	@FindBy(id="preferredDate") WebElement preferredDate;
	@FindBy(id="dateOfBirth") WebElement dateOfBirth;
	@FindBy(id="react-select-7-input") WebElement bloodGroup;
	
	@FindBy(id="react-select-8-input") WebElement gender;
	
	@FindBy(id="react-select-9-input") WebElement categoryId;
	
	@FindBy(id="react-select-10-input") WebElement religion;
	
	@FindBy(id="react-select-11-input") WebElement nationality;
	
	@FindBy(id="alternateMobileNumber") WebElement alternateMobileNumber;
	@FindBy(id="alternateEmailAddress") WebElement alternateEmailAddress;
	@FindBy(id="passportNumber") WebElement passportNumber;
	@FindBy(id="react-select-12-input") WebElement domicile;
	@FindBy(id="react-select-13-input") WebElement citizenShipId;
	@FindBy(id="react-select-14-input") WebElement caste;
	@FindBy(id="isPhysicallychallengedyes") WebElement isPhysicallychallengedyes;
	@FindBy(id="isPhysicallychallengedno") WebElement isPhysicallychallengedno;
	@FindBy(id="react-select-15-input") WebElement permenentCountry;
	@FindBy(id="react-select-16-input") WebElement permenentState;
	@FindBy(id="react-select-17-input") WebElement permenentCity;
	@FindBy(id="permenentAddressLine1") WebElement permenentAddressLine1;
	@FindBy(id="permenentAddressLineTwo") WebElement permenentAddressLineTwo;
	@FindBy(id="permenentPincode") WebElement permenentPincode;
	@FindBy(xpath="//label[@for='isSamePresentAddress']") WebElement isSamePresentAddress;
	@FindBy(id="react-select-18-input") WebElement presentCountry;
	@FindBy(id="react-select-19-input") WebElement presentState;
	@FindBy(id="react-select-20-input") WebElement presentCity;
	@FindBy(id="react-select-21-input") WebElement presentDistrict;
	@FindBy(id="presentAddressLine") WebElement presentAddressLine;
	@FindBy(id="presentAddressLineTwo") WebElement presentAddressLineTwo;
	@FindBy(id="presentPincode") WebElement presentPincode;
	@FindBy(id="medicalConcernsyes") WebElement medicalConcernsyes;
	@FindBy(id="medicalConcernsno") WebElement medicalConcernsno;
	@FindBy(id="pleaseSpecifyconcerns") WebElement pleaseSpecifyconcerns;
	@FindBy(id="medicalrequirementyes") WebElement medicalrequirementyes;
	@FindBy(id="medicalrequirementno") WebElement medicalrequirementno;
	@FindBy(id="allergiesyes") WebElement allergiesyes;
	@FindBy(id="allergiesno") WebElement allergiesno;
	@FindBy(id="submit") WebElement submit;
	@FindBy(id="savePartial") WebElement savePartial;
	@FindBy(id="savePartial1") WebElement savePartial1;
	
	
	@FindBy(xpath="//div[@class='css-yt9ioa-option']") List<WebElement> entity3LstBox;
	public PersonalDetailsPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void test(String Stream,String Course,String CampusPreference,String PreferenceDate,String DateOfBirth,String BloodGroup,String Gender,String Category,String Religion,String Nationality,String AltMobile,String AltEmail,String PassportNo,String Domicile,String Citizenship,String Caste,String PhysicallyChallenged,String Country,String State,String District,String AddressLine1,String AddressLine2,String Pincode,String CorrespondenceSame,String CountryP,String StateP,String DistrictP,String CityP,String AddressLine1P,String AddressLine2P,String PincodeP,String MedicalConcern,String MedicalConcerns,String MedicalRequire,String Allery) throws InterruptedException {
		entity3.sendKeys(Stream);
		TestUtil.clickHiddenElement(entity4value);
		//entity3value.click();
		
		entity4.clear();
		entity4.sendKeys(Course);		
		TestUtil.clickHiddenElement(entity4value);
		
		preferredCity.sendKeys(CampusPreference);
		TestUtil.clickHiddenElement(selectValue);
		
		preferredDate.sendKeys(PreferenceDate);
		//dateOfBirth.click();
		//dateOfBirth.sendKeys(DateOfBirth);
		//bloodGroup.click();
		bloodGroup.sendKeys(BloodGroup);
		TestUtil.clickHiddenElement(selectValue);
		gender.sendKeys(Gender);
		TestUtil.clickHiddenElement(selectValue);
		categoryId.sendKeys(Category);
		TestUtil.clickHiddenElement(selectValue);
		religion.sendKeys(Religion);
		TestUtil.clickHiddenElement(selectValue);
		nationality.sendKeys(Nationality);
		TestUtil.clickHiddenElement(selectValue);
		alternateMobileNumber.sendKeys(AltMobile);
		alternateEmailAddress.sendKeys(AltEmail);
		passportNumber.sendKeys(PassportNo);
		domicile.sendKeys(Domicile);
		TestUtil.clickHiddenElement(selectValue);
		citizenShipId.sendKeys(Citizenship);
		TestUtil.clickHiddenElement(selectValue);
		caste.sendKeys(Caste);
		TestUtil.clickHiddenElement(selectValue);
		
		if(PhysicallyChallenged == "Yes") {
			isPhysicallychallengedyes.isSelected();
		}
		else {isPhysicallychallengedno.isSelected();}
		
		
		permenentCountry.sendKeys(Country);
		TestUtil.clickHiddenElement(selectValue);
		
		permenentState.sendKeys(State);
		TestUtil.clickHiddenElement(selectValue);
		
		permenentCity.sendKeys(District);
		TestUtil.clickHiddenElement(selectValue);
		
		permenentAddressLine1.sendKeys(AddressLine1);
		permenentAddressLineTwo.sendKeys(AddressLine2);		
		permenentPincode.sendKeys(Pincode);
		
		
		if(CorrespondenceSame.equals("Yes")) {
			isSamePresentAddress.click();
		}
		else
		{
		presentCountry.sendKeys(CountryP);
		TestUtil.clickHiddenElement(selectValue);
		presentState.sendKeys(StateP);
		TestUtil.clickHiddenElement(selectValue);
		
		presentCity.sendKeys(CityP);
		TestUtil.clickHiddenElement(selectValue);
		presentDistrict.sendKeys(DistrictP);
		//TestUtil.clickHiddenElement(selectValue);
		presentAddressLine.sendKeys(AddressLine1P);
		presentAddressLineTwo.sendKeys(AddressLine2P);
		presentPincode.sendKeys(PincodeP);
		}
		
	
	}

}
