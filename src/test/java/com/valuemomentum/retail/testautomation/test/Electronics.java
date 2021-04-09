
package com.valuemomentum.retail.testautomation.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Electronics {
	
	@Test
	//public static void main(String[] args) throws InterruptedException {
		public void VerifyLogin() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			
		driver.navigate().to("https://www.amazon.in/");
		 
		//Thread.sleep(10000);
		System.out.println("current url :"+driver.getCurrentUrl());
		System.out.println("Title:"+driver.getTitle());

		System.out.println("window details" +driver.getWindowHandle());
		//Thread.sleep(4000);
		
		
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
	driver.findElement(By.linkText("Noise")).click();
	  driver.findElement(By.linkText("Noise Colorfit Pro 2 Full Touch Control Smart Watch (Teal Green)")).click();
	 // driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
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
		//Thread.sleep(4000);
		driver.close();
		driver.quit();
	 

		
	
	}

}
