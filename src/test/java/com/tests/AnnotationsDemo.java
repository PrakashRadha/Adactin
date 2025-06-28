package com.tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	@Test(priority = 0, expectedExceptions = ArithmeticException.class)
	public void openApplication() {
		System.out.println("Launching the application");
		System.out.println(10/0);
	}
	
	@Test(priority =1, dependsOnMethods = "openApplication", groups = "smoke")
	public void login() {
		System.out.println("Logged in the application");
	}
	
	@Test(priority = 2)
	public void closeApp() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Closing the application");
	}
	
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("Before Suite");
//	}
//	
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("Before Test");
//	}
//	
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("Before Class");
//	}
//	
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("Before Method");
//	}
//	
//	@Test
//	public void testOne() {
//		System.out.println("First Test");
//	}
//	
//	@Test
//	public void testTwo() {
//		System.out.println("Second Test");
//	}
//	
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("After Suite");
//	}
//	
//	@AfterTest
//	public void afterTest() {
//		System.out.println("After Test");
//	}
//	
//	@AfterClass
//	public void afterClas() {
//		System.out.println("After Class");
//	}
//	
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("After Method");
//	}
	
	
	
	
	
	
}
