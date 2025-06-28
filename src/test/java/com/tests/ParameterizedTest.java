package com.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Parameters({"name","age", "city"})
	@Test
	public void myDetails(String name, int age, String city) {
		System.out.println("My name: "+name);
		System.out.println("My age: "+age);
		System.out.println("My city: "+city);
	}
	
	@Parameters("city")
	@Test
	public void myCity(String city) {
		System.out.println("My city: "+city);
	}

}
