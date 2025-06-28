package com.tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class MyTestListener implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Tset Case Execution Started : "+ result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test Case : "+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed Test Case : "+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped Test Case : "+result.getName());
	}
}
