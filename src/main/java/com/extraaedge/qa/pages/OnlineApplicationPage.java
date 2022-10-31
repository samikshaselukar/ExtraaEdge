package com.extraaedge.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.extraaedge.qa.base.TestBase;

public class OnlineApplicationPage extends TestBase{
	
	@FindBy(id="btncontinue") WebElement proceedBtn;
	
	public OnlineApplicationPage() {
		PageFactory.initElements(driver,this);
	}
	
	public PersonalDetailsPage clickProceed() {
		proceedBtn.click();
		return new PersonalDetailsPage();
	}

}
