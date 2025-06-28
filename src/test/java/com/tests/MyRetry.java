package com.tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{
	
	int retry = 0;  // initial value
	
	static int count=3; // how many times to retry
	
	@Override
	public boolean retry(ITestResult result) { // allow the TC to retry
				//when it returns true
		if(retry<count) { //3<3
			retry++;
			return true;
		}
		
		return false;
	}

}
