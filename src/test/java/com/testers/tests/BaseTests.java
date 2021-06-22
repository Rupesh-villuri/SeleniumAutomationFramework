package com.testers.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testers.drivers.Driver;

public class BaseTests {

	protected BaseTests(){
		
	}
	
	@BeforeMethod
	protected void setUp() {
		Driver.initDriver();
	}
	
	@AfterMethod
	protected void tearDown(){
		Driver.quitDriver();
	}
}
