package com.extraaedge.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.extraaedge.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(id = "ee-floating-control-button-form-3-applyNow") WebElement applyNowBtn;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public RegistrationPage clickApply() {
		applyNowBtn.click();
		return new RegistrationPage();
	}

}
