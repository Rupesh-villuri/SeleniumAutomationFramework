package com.testers.pages;

import org.openqa.selenium.By;

import com.testers.enums.WaitStrategy;

public class OrangeHRMHomePage extends BasePage{
	 
	private final By linkWelcome = By.id("welcome");
	private final By linkLogout = By.xpath("//a[text()='Logout']");
	 
	public OrangeHRMLoginPage clickLogout(){
		
		click(linkLogout, WaitStrategy.CLICKABLE);
		return new OrangeHRMLoginPage();
	}
	
	public OrangeHRMHomePage clickWelcome() {
		
		click(linkWelcome);
		return this;
	}
}
   