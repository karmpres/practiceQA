package PracticeSelenium.PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "/Users/present/eclipse-workspace/PracticeSelenium/PracticeSelenium/src/test/java/drivers/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	
    	
    	driver.get("http://www.google.com");
    	System.out.println(driver.getTitle());
    	
    }
}
