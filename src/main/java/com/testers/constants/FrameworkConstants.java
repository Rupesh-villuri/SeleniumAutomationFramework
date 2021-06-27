package com.testers.constants;

import com.testers.enums.ConfigProperties;
import com.testers.utils.PropertyUtils;

public final class FrameworkConstants {
		
	private FrameworkConstants(){
		
	}
	
	public static final String RESOURCESPATH =System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCESPATH +"/executables/chromedriver.exe";
	public static final String CONGIGFILEPATH = RESOURCESPATH+"/config/config.properties";
	private static final int EXPLICITWAIT = 10;
	private static final String EXTENTREPORTFOLDERPATH =System.getProperty("user.dir")+"/extent-test-ouput/";
	private static String extentreportFilepath ="";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigFilePath() {
		return CONGIGFILEPATH;
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getExtentReportFilePath() {
		
		if(extentreportFilepath.isEmpty()) {
			extentreportFilepath=createReportPath();
		}
		return extentreportFilepath;
	}
	private static String createReportPath() {
	
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
			return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"-index.html";
		}
		else
		{
			return EXTENTREPORTFOLDERPATH+"index.html";
		}
	}
}
