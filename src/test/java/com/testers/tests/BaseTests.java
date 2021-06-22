package com.testers.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testers.drivers.Driver;

public class BaseTests {

	protected BaseTests(){
		
	}
	
	@BeforeMethod
	public void setUp() {
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quitDriver();
	}
}
