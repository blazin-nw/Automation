package com.automation.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automation.driver.MyDriver;
import com.pages.app.Home;
import com.pages.app.RegisterPage;

import junit.framework.Assert;

public class SignupTests extends BaseTest {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void reachSignupPage() {
		
		Home home = new Home(myDriver.getDriver());
		home.accessSignupPage();
		RegisterPage register = new RegisterPage(myDriver.getDriver());	
		Assert.assertEquals(register.getPageTitle(),"Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines");
 		System.out.print(register.getPageTitle());
 		
	}
	
	@Test
	
	public void validateRequiredFields() {
		RegisterPage register = new RegisterPage(myDriver.getDriver());
		register.clickSubmit();
		System.out.println("\n" + myDriver.getDriver().switchTo().alert().getText());
		myDriver.getDriver().switchTo().alert().accept();
	}
}
