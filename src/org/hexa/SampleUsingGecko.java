package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleUsingGecko {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse Revision\\Selenium_Day1\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://gmail.com/");
		driver.get("http://www.flipkart.com/");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.quit();

	}

}
