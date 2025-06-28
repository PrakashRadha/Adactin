package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
	
	@Test()
	public void myTest() {
		System.out.println("Hello");
		
		/*
		 * Hard assertions: no need to create object,
		 * if the assertion fails the execution will stop
		 */
//		Assert.assertNotEquals("String", "string");
//		Assert.assertFalse(false);
//		Assert.fail();
		
		/*
		 * Soft Assertions - create an object
		 * Even if the assertion fails it will allow the test case to execute
		 * assertAll() method is mandatory
		 */
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(false, true);
			
	System.out.println("Test Case validated");
			sa.assertAll();
	}

}
