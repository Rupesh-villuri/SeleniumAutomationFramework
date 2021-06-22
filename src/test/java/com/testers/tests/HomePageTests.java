package com.testers.tests;

import org.testng.annotations.Test;

import com.testers.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePageTests extends BaseTests{
	
	private HomePageTests(){
		
	}
	@Test
	public void test3()
	{	
		Driver.initDriver();//this will create another browser instance along with other one from BeforeMethod
		Driver.driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
}
