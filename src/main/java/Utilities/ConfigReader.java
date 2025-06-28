package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static String getData(String key) throws IOException {
		File f = new File("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Adactin\\src\\test\\resources\\testData.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
	
		
		return value;	
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		// creating a file reference
		File f = new File("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Adactin\\src\\test\\resources\\testData.properties");

		//pass the file reference in FileInputStream
		FileInputStream fis = new FileInputStream(f);
		
		//create object for properties
		Properties p = new Properties();
		
		//load the file using .load method
		p.load(fis);
		
		//get the data properties file
		String value = p.getProperty("password");
		
		System.out.println(value);
		
		p.setProperty("phoneNumber", "7865427892");
	
		FileOutputStream fos = new FileOutputStream(f);
		p.store(fos, "Updated by June 13 through automation");
	
		fos.close();
	}
}
