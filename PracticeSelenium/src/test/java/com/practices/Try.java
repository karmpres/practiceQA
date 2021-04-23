package com.practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Try {

	public static WebDriver driver;

	@Test
	public void tryDriver() {
		System.setProperty("webdriver.chrome.driver","/Users/present/eclipse-workspace/PracticeSelenium/PracticeSelenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.quora.com/How-do-I-solve-this-The-driver-executable-does-not-exist-error-in-selenium");
		
		driver.close();
		
	}
	
}
