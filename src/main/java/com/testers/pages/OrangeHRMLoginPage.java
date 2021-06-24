package com.testers.pages;

import org.openqa.selenium.By;

public class OrangeHRMLoginPage extends BasePage{

	private final By textboxUsername = By.id("txtUsername");
	private final By textboxPassword = 
			By.xpath("//input[@id='txtPassword' and @type='password']");
	private final By buttonLogin = By.id("btnLogin");

	public OrangeHRMLoginPage enterUserName(String username) {
		sendKeys(textboxUsername, username);
		return new OrangeHRMLoginPage();
	}

	public OrangeHRMLoginPage enterPassWord(String password) {
		sendKeys(textboxPassword, password);
		return this;
	}

	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin);
		return new OrangeHRMHomePage(); 

	}
	
	public String getTitle() {	
		return getPageTitle();
	}
}
