package com.testers.tests;

import org.testng.annotations.Test;

import com.testers.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPageTests extends BaseTests{
	
	private LoginPageTests(){
		
	}
	@Test
	public void test1()
	{	
	    Driver.driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
	@Test
	public void test2()
	{	
	   Driver.driver.findElement(By.name("q")).sendKeys("Rupesh",Keys.ENTER);
	}
}