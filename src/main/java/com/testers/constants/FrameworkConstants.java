package com.testers.constants;

public final class FrameworkConstants {
		
	private FrameworkConstants(){
		
	}
	
	public static final String RESOURCESPATH =System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCESPATH +"/executables/chromedriver.exe";
	public static final String CONGIGFILEPATH = RESOURCESPATH+"/config/config.properties";
	private static final int EXPLICITWAIT = 10;

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigFilePath() {
		return CONGIGFILEPATH;
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}
}
