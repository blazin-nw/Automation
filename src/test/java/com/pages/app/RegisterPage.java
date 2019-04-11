package com.pages.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage {
	
	private WebDriver driver;

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_ButtonSubmit")
	WebElement submitButton;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")
	WebElement firstNameInput;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")
	WebElement lastNameInput;
	
	@FindBy(xpath="//div[@class='flag-container']")
	WebElement flagList;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword")
	WebElement passwordInput;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm")
	WebElement confirmPasswordInput;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBDay")
	WebElement dayDropList;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBMonth")
	WebElement monthDropList;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBYear")
	WebElement yearDropList;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")
	WebElement emailInput;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXPANCARD")
	WebElement cardNumberInput;
	
	@FindBy(id="chkSpiceClubTnC")
	WebElement checkbox;
	

	
	public String getPageTitle() {
		return getDriver().getTitle();
	}
	
	public void clickSubmit() {
		getWait().until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();
	}

}
