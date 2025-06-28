package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	private static WebDriver driver;
	
	public static WebDriver browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	public static void launchApplication(String url) {
		driver.get(url);
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void minimizeWindow() {
		driver.manage().window().minimize();
	}
	
	public static void moveBackward() {
		driver.navigate().back();
	}
	
	public static void moveForward() {
		driver.navigate().forward();
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void clearText(WebElement element) {
		element.clear();
	}
	
	public static void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static boolean isElementEnabled(WebElement element) {
		return element.isEnabled();
	}
	
	public static boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public static boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}
	
	public static void handleAlert(String action, String value) {
		Alert a = driver.switchTo().alert();
		if(action.equalsIgnoreCase("accept")) {
			a.accept();
		}else if (action.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}else if (action.equalsIgnoreCase("sendKeys")) {
			a.sendKeys(value);
		}
	}
	
	public static String getTextFromAlert() {
		Alert a = driver.switchTo().alert();
		return a.getText();
	}
	
	public static String getData(String file,String key) throws IOException {
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		fis.close();
		
		return value;	
	}
	
	
	
	/*
	 * select
	 * actions
	 * robotclass
	 * webtables
	 * datepicker
	 * randomstring
	 * wait
	 * encodingdecoding
	 */
	 
	
	
	
	
	
	
}
