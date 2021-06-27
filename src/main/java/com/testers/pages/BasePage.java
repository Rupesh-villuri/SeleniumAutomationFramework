package com.testers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testers.drivers.DriverManager;
import com.testers.enums.WaitStrategy;
import com.testers.factories.ExplicitWaitFactory;
import com.testers.reports.ExtentLogger;

public class BasePage {

	//we want to make sure user should select only from list of predefined options.
	//we can avoid Run time Exceptions with this.

	protected void click(By by , WaitStrategy waitStrategy , String elementName) {

		ExplicitWaitFactory.performExplicitWait(waitStrategy, by).click();
	    //with this can reduce to single line as we know its returning webelement
		ExtentLogger.pass(elementName+ " is clicked");
	}

	protected void sendKeys(By by , String value ,WaitStrategy waitStrategy , String elementName) {

		WebElement elt =ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		elt.sendKeys(value);
		//written like this just for readability /understanding for manual tester
		ExtentLogger.pass(value+" is entered in  "+elementName);
	}

	protected void click(By by) {
		DriverManager.getDriver().findElement(by).click();
	}

	protected void sendKeys(By by , String value) {
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}

	protected String getPageTitle(){
		return DriverManager.getDriver().getTitle();
	}
}
