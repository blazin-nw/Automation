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
	
	@FindBy(tagName="title")
	WebElement title;
	
	@FindBy(id="CONTROLGROUPREGISTERVIEW_ButtonSubmit")
	WebElement submitButton;
	
	public String getPageTitle() {
		return getDriver().getTitle();
	}
	
	public void clickSubmit() {
		getWait().until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();
	}

}
