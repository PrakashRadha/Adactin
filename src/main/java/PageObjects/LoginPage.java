package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	/*conditions for singleton design pattern
	 * private instance of the class
	 * private constructor
	 * 
	 * 
	 */
	private WebDriver driver;
	
	private static LoginPage lp;
	
	private LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static LoginPage getLoginPage(WebDriver driver) {
		if(lp == null) {
	
		lp = new LoginPage(driver);
		}
		return lp;
	}
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

	
	
}
