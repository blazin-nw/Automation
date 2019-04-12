package com.automation.app;

import java.util.List;

import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pages.app.Home;

public class SearchFlightsTests extends BaseTest {
	
	@Test
	public void searchFlight() throws InterruptedException {
		
		Home home = new Home(myDriver.getDriver());
		home.departureCity().sendKeys("Ban");
		home.getWait().until(ExpectedConditions.elementToBeClickable(home.suggestedBangkok()));
		if(home.suggestedBangkok().isDisplayed()) {
			home.suggestedBangkok().click();
		}
		home.suggestedBangkok().click();
		home.arrivalCity().sendKeys("Dub");
		home.getWait().until(ExpectedConditions.elementToBeClickable(home.suggestedDubai()));
		home.suggestedDubai().click();
		Thread.sleep(4000);
		List<WebElement> calendar = myDriver.getDriver().findElements(By.id("ctl00_mainContent_view_date1"));
		int calendarSize = calendar.size();
		for(int i=0;i<calendarSize;i++) {
			String date = myDriver.getDriver().findElements(By.id("ctl00_mainContent_view_date1")).get(i).getText();
			if(date.equalsIgnoreCase("20")) {
				myDriver.getDriver().findElements(By.id("ctl00_mainContent_view_date1")).get(i).click();
			}
			
		}
	}

}
