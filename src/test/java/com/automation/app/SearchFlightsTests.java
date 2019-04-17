package com.automation.app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pages.app.Home;

public class SearchFlightsTests extends BaseTest {
	
	
	@Test
	public void searchFlight() throws InterruptedException {
		
		Home home = new Home(myDriver.getDriver());
		
		home.flightsButton().click();
		home.flyingFromInput().click();
		home.flyingFromInput().sendKeys("Buenos Aires");
		home.flyingFromInput().sendKeys(Keys.DOWN);
		home.flyingFromInput().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		home.flyingToInput().click();
		home.flyingToInput().sendKeys("Sicili");
		Thread.sleep(2000);
		home.flyingToInput().sendKeys(Keys.DOWN);
		home.flyingToInput().sendKeys(Keys.ENTER);
		home.departingDateSelector().click();
		home.nextButtonCalendar().click();
		home.departing().click();
		Thread.sleep(3000);
		home.returningSelector().click();
		home.returning().click();
		Select a = new Select(home.adultsSelector());
		a.selectByValue("3");
		Select c = new Select(home.childrenSelector());
		c.selectByValue("2");
		Select c1 = new Select(home.childOne());
		c1.selectByValue("5");
		Select c2 = new Select(home.childTwo());
		c2.selectByValue("17");
		home.submitButton().click();
		Thread.sleep(8000);
		}
		
		
		
}

