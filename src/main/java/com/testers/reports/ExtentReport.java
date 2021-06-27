package com.testers.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.testers.constants.FrameworkConstants;

public final class ExtentReport {

	private ExtentReport() {}
	private static ExtentReports extent;

	public static void initReports()
	{
		if(Objects.isNull(extent)) {

			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());
			extent.attachReporter(spark);

			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Automation spark Report");
			spark.config().setReportName("Regression report");
		}
	}
	public static void flushReports() throws IOException {
		
		if (Objects.nonNull(extent)) {
			extent.flush();
		}	
		Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
	}
	public static void createTest(String testcasename) {
		
	    ExtentManager.setExtentTest(extent.createTest(testcasename));		
	}
}
