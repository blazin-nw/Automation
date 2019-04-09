package com.pages.app;

import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
	
	private WebDriver driver;

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getPageTitle() {
		return getDriver().getTitle();		
	}

}
