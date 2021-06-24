package com.testers.tests;

import org.testng.annotations.Test;

import com.testers.drivers.Driver;
import com.testers.drivers.DriverManager;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePageTests extends BaseTests{
	
	private HomePageTests(){
		
	}
	@Test
	public void test3()
	{	
		Driver.initDriver();
		//this will create another browser instance along with other one from BeforeMethod
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
		
		String title =DriverManager.getDriver().getTitle();
		
		List<WebElement> elt = DriverManager.getDriver().findElements(By.xpath("//h3/div"));
		
		Assertions.assertThat(title)
				.contains("Automation")
				.as("Title not contains Automation").containsIgnoringCase("automation")
				.as("Object is null").isNotNull()
				.containsPattern("\\w.*"+"automation")
				.hasSizeBetween(4, 9);
	
		Assertions.assertThat(elt)
				.hasSize(3)
				.isEmpty();
			
			
	}
}
