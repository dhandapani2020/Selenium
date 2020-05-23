package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SampleUsingIE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "D:\\Eclipse Revision\\Selenium_Day1\\Driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(10000);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.quit();

	}

}
