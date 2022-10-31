package com.extraaedge.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.extraaedge.qa.base.TestBase;

public class RegistrationPage extends TestBase{
	@FindBy(id = "ee-floating-control-button-form-3-applyNow") WebElement applyNowBtn;
	@FindBy(id = "ee-form-3-form-3-firstName") WebElement firstName;
	@FindBy(name = "ee-form-3-form-3-email") WebElement email;
	@FindBy(name = "ee-form-3-form-3-mobile") WebElement mobile;
	@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[1]") WebElement entity2DrpDown;
	@FindBy(xpath ="//li[@class='select2-results__option']") List <WebElement> entity2;
	@FindBy(xpath="(//span[@class='select2-selection select2-selection--single'])[2]") WebElement entity3DrpDown;
	@FindBy(xpath ="//li[@class='select2-results__option']") List <WebElement> entity3;
	@FindBy(id = "ee-form-3-form-3-comments") WebElement commentTxtBox;
	@FindBy(id = "ee-form-3-form-3-iAgree") WebElement iAgreeChkBox ;
	@FindBy(id = "ee-form-3-form-3-submit") WebElement submitBtn ;
	@FindBy(xpath="//button[contains(text(),'CLICK HERE TO FILL THE APPLICATION')]") WebElement fillApllicationBtn;
	public RegistrationPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickApply() {
		applyNowBtn.click();		
	}
	
	
	public void enterDetails(String FirstName,String Email,String CountryCode,String Mobile,String Entity2,String Entity3, String Comment) {
		firstName.sendKeys(FirstName);
		email.sendKeys(Email);
		mobile.sendKeys(Mobile);
		entity2DrpDown.click();
		selectEntity2(Entity2).click();
		/*WebElement entity3 = selectEntity3(Entity3);
		if( entity3!= null) {
			entity3.click();
		}*/
		commentTxtBox.sendKeys(Comment);
		iAgreeChkBox.click();
		submitBtn.click();
	}
	public OnlineApplicationPage clickFillApplication() {
		fillApllicationBtn.click();	
		return new OnlineApplicationPage();
	}
	
	public WebElement selectEntity2(String entity2Value) {
		for (WebElement entityElement : entity2) {
			String myText = entityElement.getText();
			if (myText.equals(entity2Value) ) {
				return entityElement;
			}			
		}		
		return null;		
	}
	
	public WebElement selectEntity3(String entity3Value) {
		for (WebElement entityElement : entity2) {
			String entity3Text = entityElement.getText();
			if (entity3Text.equals(entity3Value) ) {
				return entityElement;
			}			
		}		
		return null;		
	}

}
