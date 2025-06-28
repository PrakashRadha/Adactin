package com.tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setUp() {
	
		    driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
