package com.valuemomentum.retail.testautomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	static WebDriver driver;

	 @BeforeTest
	public void createDriver()
	{
	System.out.println(" Starting Suite");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.in");
	}
	public static WebDriver getDriver() {
	return driver;
	}

	 public static void setDriver(WebDriver driver) {
	WebDriverHelper.driver = driver;
	}
	@AfterTest
	public void test_aftersuite() {
	System.out.println(" Finished Suite");
	driver.close();
	driver.quit();
	}

}
