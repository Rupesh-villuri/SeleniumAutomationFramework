package com.testers.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.testers.pages.OrangeHRMLoginPage;

public class OrangeHRMTests extends BaseTests {
	
    ExtentReports extent=null;
	@Test(dataProvider="LoginTestDataProvider")
	public void LoginLogoutTest(String uname , String pwd) {

		//ExtentReport.createTest("Customtext1");
		String title =new OrangeHRMLoginPage()
				.enterUserName(uname).enterPassWord(pwd).clickLogin()
				.clickWelcome().clickLogout()
				.getTitle(); 
		
		Assertions.assertThat(title).isEqualTo("OrangeHRM");				
	}
	
	@DataProvider(name = "LoginTestDataProvider", parallel=false)
	public Object[][] getData() {
		
		return new Object[][] {
			{"Admin","admin123"},
			{"masn","nskna"}
		};
	}
}
 