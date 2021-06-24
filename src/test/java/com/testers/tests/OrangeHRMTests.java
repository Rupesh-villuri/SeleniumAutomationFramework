package com.testers.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import com.testers.pages.OrangeHRMLoginPage;

public class OrangeHRMTests extends BaseTests {

	@Test
	public void LoginLogoutTest() {

		String title =new OrangeHRMLoginPage()
				.enterUserName("Admin").enterPassWord("admin123").clickLogin()
				.clickWelcome().clickLogout()
				.getTitle(); 
		
		Assertions.assertThat(title).isEqualTo("OrangeHRM");
				
	}
}
