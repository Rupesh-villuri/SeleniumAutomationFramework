package com.testers.drivers;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import com.testers.constants.FrameworkConstants;

public final class Driver {
	
	private Driver() {
		
	}

	public static void initDriver() {
		
		System.out.println(Thread.currentThread().getId() + " : "+DriverManager.getDriver());

		if (Objects.isNull(DriverManager.getDriver())) 
		{
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(FrameworkConstants.getURL());
		}
	}

	public static void quitDriver() {

		if(Objects.nonNull(DriverManager.getDriver())) 
		{
			DriverManager.getDriver().quit();
			DriverManager.setDriver(null);
			DriverManager.unload();
		}
	}
}
