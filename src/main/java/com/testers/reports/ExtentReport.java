package com.testers.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {

	private ExtentReport() {}
	private static ExtentReports extent;
	public static ExtentTest test; 

	public static void initReports()
	{
		if(Objects.isNull(extent)) {

			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("target/index.html");
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
		Desktop.getDesktop().browse(new File("target/index.html").toURI());
	}
	public static void createTest(String testcasename) {

		test = extent.createTest(testcasename);
		ExtentManager.setExtentTest(test);
		
		/* can use in both ways	
	    	ExtentManager.setExtentTest(extent.createTest(testcasename));
		*/
	}
}
