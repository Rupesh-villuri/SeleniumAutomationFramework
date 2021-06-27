package com.testers.reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.testers.drivers.DriverManager;
import com.testers.enums.ConfigProperties;
import com.testers.utils.PropertyUtils;

public final class ExtentLogger {

	private ExtentLogger() {

	}

	public static void pass(String message) {

		if(PropertyUtils.get(ConfigProperties.PASSEDSTEPSCREENSHOT).equalsIgnoreCase("yes") ){

			ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
		}
		else {
			ExtentManager.getExtentTest().pass(message);
		}
	}

	public static void fail(String message) {

		if(PropertyUtils.get(ConfigProperties.PASSEDSTEPSCREENSHOT).equalsIgnoreCase("yes")){

			ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
		}else {
			ExtentManager.getExtentTest().fail(message);
		}
	}

	public static void skip(String message) {
		
		if(PropertyUtils.get(ConfigProperties.SKIPPEDTESTSCREENSHOT).equalsIgnoreCase("yes") ){

			ExtentManager.getExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
		}else {
			ExtentManager.getExtentTest().skip(message);
		}
		
	}
	
	public static String getBase64Image() {

		return	((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
		//it will take screenshot in the form of base64
		
	}
}

