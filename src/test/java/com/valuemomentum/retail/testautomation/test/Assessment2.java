
package com.valuemomentum.retail.testautomation.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.findElement(By.xpath("//*[text()='Mobiles'][1]")).click();;
		Thread.sleep(5000);
		driver.findElement(By.linkText("Cloudtail India")).click();;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='E-Cosmos Stylist Little Adapter Micro USB OTG to USB 2.0 Adapter for Smartphones and Tablets - Set of 3']")).click();
		Thread.sleep(5000);
		//*[@class='a-size-base-plus a-color-base a-text-normal'])[2]
		 		
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
		
		driver.findElement(By.xpath("//*[@title='Add to Shopping Cart']")).click();
		Thread.sleep(5000);
		//driver.navigate().refresh();
		driver.close();
		driver.quit();
		

	

	}

}
