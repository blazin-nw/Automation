package com.automation.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.automation.driver.MyDriver;
import com.pages.app.Home;
import com.pages.app.RegisterPage;

public abstract class BaseTest {
	
	MyDriver myDriver;
	
	private Home home;
	private RegisterPage register; 
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"browser"})
	public void beforeSuite(String browser) {
		myDriver = new MyDriver(browser);
		home = new Home(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun=true) 
		public void afterSuite() {
			home.dispose();
		}

	public Home getHomePage() {
		return home;
	}
	
	public RegisterPage getRegister() {
		return register;
	}
	
	
}
