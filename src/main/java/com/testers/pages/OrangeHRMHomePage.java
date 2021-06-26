package com.testers.pages;
import org.openqa.selenium.By;

import com.testers.enums.WaitStrategy;
import com.testers.reports.ExtentManager;

public class OrangeHRMHomePage extends BasePage{

	private final By linkWelcome = By.id("welcome");
	private final By linkLogout = By.xpath("//a[text()='Logout']");

	public OrangeHRMHomePage clickWelcome() {

		click(linkWelcome,WaitStrategy.PRESENCE);
		ExtentManager.getExtentTest().pass("Welcome Clicked");
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout(){
		
		click(linkLogout, WaitStrategy.CLICKABLE);
		ExtentManager.getExtentTest().pass("Logout Clicked");
		return new OrangeHRMLoginPage();
	}
}
 