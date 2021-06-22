package com.testers.constants;

public final class FrameworkConstants {
		
	private FrameworkConstants(){
		
	}
	private static String CHROMEDRIVERPATH =System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
}
