package com.pages.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	private WebDriver driver;
	
	public BasePage(WebDriver pdriver) {
		PageFactory.initElements(pdriver, this);
		driver = pdriver ;
	}
	
	protected WebDriver getDriver() {
		return driver;
	}
	
	public void dispose() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
