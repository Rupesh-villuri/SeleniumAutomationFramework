package com.testers.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.testers.pages.OrangeHRMLoginPage;
import com.testers.reports.ExtentReport;

public class OrangeHRMTests extends BaseTests {
	
    ExtentReports extent=null;
	@Test(dataProvider="LoginTestDataProvider")
	public void LoginLogoutTest(String uname , String pwd) {

		ExtentReport.createTest("Customtext1");
		String title =new OrangeHRMLoginPage()
				.enterUserName("Admin").enterPassWord("admin123").clickLogin()
				.clickWelcome().clickLogout()
				.getTitle(); 
		
		Assertions.assertThat(title).isEqualTo("OrangeHRM");				
	}
	
	@DataProvider(name = "LoginTestDataProvider", parallel=true)
	public Object[][] getData() {
		
		return new Object[][] {
			{"Admin","admin123"},
			{"Rupesh","rupesh123"},
		};
	}
}
 