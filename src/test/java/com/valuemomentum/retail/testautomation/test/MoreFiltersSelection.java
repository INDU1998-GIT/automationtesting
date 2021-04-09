
package com.valuemomentum.retail.testautomation.test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreFiltersSelection {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://www.amazon.in");
    driver.findElement(By.linkText("Electronics")).click();
    driver.findElement(By.linkText("Mobiles & Accessories")).click();
    driver.findElement(By.linkText("Mobiles & Accessories")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Eligible for Pay On Delivery")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Boat")).click();
    driver.findElement(By.xpath("//*[@id=\"p_36/1318504031\"]/span/a/span")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.linkText("boAt Airdopes 171 Bluetooth Truly Wireless Earbuds with Mic(Active Black)")).click();
    
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
	
    

	}

}
