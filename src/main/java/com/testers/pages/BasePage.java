package com.testers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testers.drivers.DriverManager;

public class BasePage {
	
	protected void click(By by) {
		DriverManager.getDriver().findElement(by).click();
	}
	
	protected void sendKeys(By by , String value) {
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	
	protected String getPageTitle(){
		return DriverManager.getDriver().getTitle();
	}
	
	private void ExplicitlyWaitForElementToBeClickable(By by) {
		new WebDriverWait(DriverManager.getDriver(),10)
		.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private void ExplicitlyWaitForElementToBePresent(By by) {
		new WebDriverWait(DriverManager.getDriver(),10)
		.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
