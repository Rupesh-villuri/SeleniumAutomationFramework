package com.testers.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testers.drivers.Driver;

public class BaseTests {

	protected BaseTests(){
		
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
