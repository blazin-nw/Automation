package com.pages.app;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.driver.MyDriver;

public class Home extends BasePage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public Home(WebDriver driver) {
		super(driver);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	
	@FindBy(id="ctl00_HyperLinkLogin")
	private WebElement hyperlinkLogin;

	@FindBy(xpath="//a[contains(text(),'SpiceClub Members')]")
	private WebElement spiceclubmembersLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	private WebElement signupLink;
	
	@FindBy(id="highlight-addons")
	private WebElement addonsLink;
	
	@FindBy(xpath="//a[@href='https://book.spicejet.com/Login.aspx']")
	private WebElement memberLogin;
	
	
	public WebDriverWait getWait() {
		return wait;	
	}
	
	public void accessSignupPage() {	
		Actions a = new Actions(getDriver());
		a.moveToElement(hyperlinkLogin).pause(Duration.ofSeconds(3)).moveToElement(spiceclubmembersLink).pause(Duration.ofSeconds(3)).moveToElement(memberLogin).build().perform();
		//WebDriverWait wait = new WebDriverWait(getDriver(),10);
		//wait.until(ExpectedConditions.elementToBeClickable(spiceclubmembersLink));
		//a.moveToElement(memberLogin).build().perform();
//		signupLink.click();
	}
	
	public WebElement getLoginLocator() {
		return hyperlinkLogin;
	}

}
