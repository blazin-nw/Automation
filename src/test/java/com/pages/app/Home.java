package com.pages.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.driver.MyDriver;

public class Home extends BasePage {
	
	public Home(WebDriver driver) {
		super(driver);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(id="ctl00_HyperLinkLogin")
	private WebElement hyperlinkLogin;

	@FindBy(xpath="//a[contains(text(),'SpiceClub Members')]")
	private WebElement spiceclubmembersLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	private WebElement signupLink;
	
	@FindBy(id="highlight-addons")
	private WebElement addonsLink;
	
	
	public WebDriverWait getWait() {
		return wait;
		
	}
	
	public void accessSignupPage() {
		addonsLink.click();
//		Actions a = new Actions(getDriver());
//		a.moveToElement(hyperlinkLogin).build().perform();
//		a.moveToElement(spiceclubmembersLink).build().perform();
//		signupLink.click();
	}
	
	public WebElement getLoginLocator() {
		return hyperlinkLogin;
	}
	
}
