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
	public void reachSignupPage() throws InterruptedException {
		
		Home home = getHomePage();
		home.accessSignupPage();	
		RegisterPage register = getRegister();
		//Assert.assertEquals(register.getPageTitle(), "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		System.out.println(register.getPageTitle());
	}

}
