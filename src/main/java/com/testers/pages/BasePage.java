package com.testers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testers.drivers.DriverManager;
import com.testers.enums.WaitStrategy;
import com.testers.factories.ExplicitWaitFactory;

public class BasePage {

	//we want to make sure user should select only from list of predefined options.
	//we can avoid Run time Exceptions with this.

	protected void click(By by , WaitStrategy waitStrategy) {

		ExplicitWaitFactory.performExplicitWait(waitStrategy, by).click();
	 //with this can reduce to single line as we know its returning webelement
	}

	protected void sendKeys(By by , String value ,WaitStrategy waitStrategy) {

		WebElement elt =ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		elt.sendKeys(value);
		//written like this just for readability /understanding for manual tester
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
