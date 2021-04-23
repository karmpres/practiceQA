package com.practiceselenium.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_practice001 {

	public String baseURL = "http://demo.guru99.com/test/newtours/";
	public String expectedTitle = "Welcome: Mercury Tours";
	public static WebDriver driver;
	public String actualTitle = "";

	public void simpleCheck() {
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
	}

	public void tearDown() {
		driver.close();
	}

	public void setup() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/present/eclipse-workspace/PracticeSelenium/PracticeSelenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(baseURL);

		// actualTitle = driver.getTitle();

	}

	public void switchFrame() {
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		driver.close();

	}

	public void exampleElements() {
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("Number of elements:" + elements.size());

		for (int i = 0; i < elements.size(); i++) {
			System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
		}

	}

	public void getFacebookImg() {
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();

		// verify that we are now back on Facebook's homepage
		if (driver.getTitle().equals("Facebook - log in or sign up")) {
			System.out.println("We are back at Facebook's homepage");
		} else {
			System.out.println("We are NOT in Facebook's homepage");
		}
		driver.close();

	}

}
