package com.valuemomentum.retail.testautomation.test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
	
	


	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	@Test(priority=1,enabled=true)
public void verifyMobilePurchase() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		//Thread.sleep(10000);
		System.out.println("current url :"+driver.getCurrentUrl());
		System.out.println("Title:"+driver.getTitle());

		System.out.println("window details" +driver.getWindowHandle());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//opens a new tab and switches to new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		//opens a new tab and switches to new window
				//driver.switchTo().newWindow(WindowType.WINDOW);
				
		
		//driver.close();
		//driver.close();
		driver.findElement(By.xpath("//*[text( )='New Apple iPhone 11 (128GB) - Purple'][1]")).click();
		System.out.println("Title:"+driver.getTitle());

	String currentWindow=driver.getWindowHandle();
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> ite=windows.iterator();
		while(ite.hasNext()) {
			String newWindow =ite.next();
			if(!currentWindow.equals(newWindow))
			{
				driver.switchTo().window(newWindow);
			}
			}
		driver.findElement(By.id("add-to-cart-button")).click();
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		

		//Thread.sleep(4000);
		driver.navigate().refresh();
		driver.close();
		driver.quit();
			

			
			
			
			}


	}


