package com.testers.pages;

import org.openqa.selenium.By;

import com.testers.enums.WaitStrategy;

public class OrangeHRMLoginPage extends BasePage{

	private final By textboxUsername = By.id("txtUsername");
	private final By textboxPassword = 
			By.xpath("//input[@id='txtPassword' and @type='password']");
	private final By buttonLogin = By.id("btnLogin");

	public OrangeHRMLoginPage enterUserName(String username) {
		sendKeys(textboxUsername, username ,WaitStrategy.CLICKABLE , "username");
		return new OrangeHRMLoginPage();
	}

	public OrangeHRMLoginPage enterPassWord(String password) {
		sendKeys(textboxPassword, password ,WaitStrategy.CLICKABLE ,"password ");
		return this;
	}

	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin ,WaitStrategy.PRESENCE ,"Login Button");
		return new OrangeHRMHomePage(); 

	}
	
	public String getTitle() {	
		return getPageTitle();
	}
}
