package com.tests;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups = "smoke")
	public void sayHi() {
		System.out.println("Hi");
	}

	@Test(groups = "smoke")
	public void sayHello() {
		System.out.println("Hello");
	}

	@Test(groups = "Regression")
	public void sayThanks() {
		System.out.println("Thanks");
	}

	@Test(groups = {"smoke", "Regression"})
	public void sayWelcome() {
		System.out.println("Welcome");
	}

}
