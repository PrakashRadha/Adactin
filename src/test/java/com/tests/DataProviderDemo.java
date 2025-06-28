package com.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.ConfigReader;

public class DataProviderDemo {
	
	ConfigReader cr = new ConfigReader();
	
	@Test(dataProvider = "testData")
	public void myDetails(String name, int age, String city) {
		System.out.println("My name: "+name);
		System.out.println("My age: "+age);
		System.out.println("My city: "+city);
	}
	

	@DataProvider(name = "testData")
	public Object[][] getData() throws IOException{
		return new Object[][] {
			{cr.getData("username") , 26, "Chennai"},
			{"Sethu Raman", 28, "Chennai"},
			{"Marutha Perumal", 29, "Coimbatore"},
			{"Vishnu", 24, "Kallakurichi"}
		};
	}
}
