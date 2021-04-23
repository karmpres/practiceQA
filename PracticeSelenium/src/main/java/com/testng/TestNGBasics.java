package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {
	
	@BeforeSuite//1
	public void setup() {
		System.out.println("intstall chrome");
	}
	
	@BeforeClass//3
	public void launchBrowser() {
		System.out.println("launch browser"); 
	}
	
	@BeforeMethod//4
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	@BeforeTest//2
	public void login()
	{
		System.out.println("ogin method");
	}
	
	
}
