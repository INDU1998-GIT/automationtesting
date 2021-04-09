
package com.valuemomentum.retail.testautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
				//e.sendKeys("iphone"+Keys.TAB+Keys.ENTER);
		e.sendKeys("iphone"+Keys.UP);
		Thread.sleep(1000);
		e.sendKeys(Keys.BACK_SPACE);
		e.clear();
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		
		

	}

}
