package com.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyReport implements ITestListener{

	public ExtentSparkReporter sparkReporter; // to setup the UI of the report
	public ExtentReports extent; // to populate the common information
	public ExtentTest test; // to fetch the test related data
	
	
	@Override
	public void onStart(ITestContext context) {
		//create object for spark reporter
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/automationreport.html");
		sparkReporter.config().setDocumentTitle("TestNG Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		//create object for report to fetch the common data
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester", "Rama");
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Onstart : "+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test Case Passed : "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL,"Test Case Failed : "+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP,"Test Case Skipped : "+result.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	

}
