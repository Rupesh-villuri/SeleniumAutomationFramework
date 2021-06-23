package com.testers.constants;

public final class FrameworkConstants {
		
	private FrameworkConstants(){
		
	}
	private static final String CHROMEDRIVERPATH =System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
	private static final String URL ="https://www.google.co.in/";


	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}


	public static String getURL() {
		return URL;
	}
	
	
}
