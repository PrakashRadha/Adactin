package PageActions;

import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LoginPage;
import Utilities.BaseClass;

public class LoginPageActions extends BaseClass {

	private WebDriver driver;
	private LoginPage lp;
	private static LoginPageActions lpa;
	
	private LoginPageActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		lp= LoginPage.getLoginPage(driver);
	}
	
	public static LoginPageActions getLoginPageActions(WebDriver driver) {
		if(lpa == null) {
			lpa = new LoginPageActions(driver);
		}
		return lpa;
	}
	
	public void enterUsername() throws IOException {
		enterText(lp.getUsername(), getData("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Adactin\\src\\test\\resources\\testData.properties", "username"));
	}
	
	public void enterPassword() throws IOException {
		enterText(lp.getPassword(), getData("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Adactin\\src\\test\\resources\\testData.properties", "password"));
	}
	
	public void clickOnLogin() {
		clickOnElement(lp.getLogin());
	}
	

	
		
	
	
}
