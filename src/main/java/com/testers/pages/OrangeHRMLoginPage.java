package com.testers.pages;

import org.openqa.selenium.By;

import com.testers.enums.WaitStrategy;

public class OrangeHRMLoginPage extends BasePage{

	private final By textboxUsername = By.id("txtUsername");
	private final By textboxPassword = 
			By.xpath("//input[@id='txtPassword' and @type='password']");
	private final By buttonLogin = By.id("btnLogin");

	public OrangeHRMLoginPage enterUserName(String username) {
		sendKeys(textboxUsername, username ,WaitStrategy.CLICKABLE);
		return new OrangeHRMLoginPage();
	}

	public OrangeHRMLoginPage enterPassWord(String password) {
		sendKeys(textboxPassword, password);
		return this;
	}

	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin ,WaitStrategy.PRESENCE);
		return new OrangeHRMHomePage(); 

	}
	
	public String getTitle() {	
		return getPageTitle();
	}
}
