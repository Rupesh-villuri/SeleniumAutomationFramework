package com.testers.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Uninterruptibles;
import com.testers.drivers.DriverManager;

public class OrangeHRMHomePage extends BasePage{
	 
	private final By linkWelcome = By.id("welcome");
	private final By linkLogout = By.xpath("//a[text()='Logout']");
	 
	public OrangeHRMLoginPage clickLogout(){
		
		//Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(linkLogout));//old fashioned
		//wait.until(d->d.findElement(linkLogout)).isEnabled() ;//java 8 way
		
		click(linkLogout);
		return new OrangeHRMLoginPage();
	}
	
	public OrangeHRMHomePage clickWelcome() {
		click(linkWelcome);
		return this;
	}
}
  