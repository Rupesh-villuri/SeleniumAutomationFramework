package com.testers.drivers;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.testers.constants.FrameworkConstants;

public class Driver {

	public static WebDriver driver; //when declared it will have null value

	public static void initDriver() {

		if (Objects.isNull(driver)) {
			System.setProperty("webdriver.chrome.driver", 
					FrameworkConstants.getChromeDriverPath());
			driver= new ChromeDriver();
			driver.get("https://www.google.co.in/");
		}
	}

	public static void quitDriver() {
		
		if(Objects.nonNull(driver)) {
			driver.quit();
			driver=null;
		}
		
	}

}
