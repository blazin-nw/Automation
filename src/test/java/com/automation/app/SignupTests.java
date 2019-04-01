package com.automation.app;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.pages.app.Home;

public class SignupTests extends TestBase {
	
	@Test
	
	public void reachSignupPage() throws InterruptedException {
		
		Home home = getHomePage();
		//home.getWait().until(ExpectedConditions.elementToBeClickable(home.getLoginLocator()));
		home.accessSignupPage();
		Thread.sleep(6000);
		
		
	}

}
