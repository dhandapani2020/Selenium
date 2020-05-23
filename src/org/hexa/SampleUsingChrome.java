package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleUsingChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Revision\\Selenium_Day1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.quit();
		}

}
