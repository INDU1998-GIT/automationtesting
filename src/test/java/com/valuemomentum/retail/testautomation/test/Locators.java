
package com.valuemomentum.retail.testautomation.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://www.amazon.in");
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Fashion")).click();
		  Thread.sleep(2000);
		// driver.findElement(By.partialLinkText("Women's western wear")).click();
		driver.findElement(By.xpath("(//*[contains(@class, 'a-link-normal' ) and contains(text( ), 'Shop now' )])[3] ")).click(); 
			
		 
	}

}
