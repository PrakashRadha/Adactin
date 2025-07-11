package com.tests;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageActions.LoginPageActions;

public class LoginTest extends TestBase{
	
	@Test
	public void login() throws IOException {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		LoginPageActions lpa = LoginPageActions.getLoginPageActions(driver);
		lpa.enterUsername();
		lpa.enterPassword();
		lpa.clickOnLogin();
	
	}
}
