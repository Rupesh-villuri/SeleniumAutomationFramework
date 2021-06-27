package com.testers.tests;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.testers.drivers.Driver;
import com.testers.reports.ExtentReport;

public class BaseTests {

	protected BaseTests(){
		
	}
	
	@BeforeSuite
	public void beforeSuite() {	
		
	}
	
	@AfterSuite
	public void flushReports() throws IOException {
		
	}
	
	//if no choice then only provide public access
	@BeforeMethod
	protected void setUp() throws IOException {
		Driver.initDriver();
	}
	
	@AfterMethod
	protected void tearDown(){
	
		Driver.quitDriver();
	}
}
