
package com.valuemomentum.retail.testautomation.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSample3 {
	@Test

	//public static void main(String[] args) throws InterruptedException {
			public void Verify() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

					
						WebDriver driver=new ChromeDriver();
					
						driver.navigate().to("https://www.amazon.in");
						  //Thread.sleep(1000);
						  driver.manage().window().maximize();
						  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Home and Kitchen");
				            driver.findElement(By.id("nav-search-submit-button")).click();    //will click on search button
				            driver.findElement(By.xpath("//*[@id=\"n/976442031\"]/span/a/span")).click();    //click on homes and kithchen on page
				            driver.findElement(By.xpath("//*[@id=\"n/5925789031\"]/span/a/span")).click();   //click on kitchen & dining
				            driver.findElement(By.xpath("//*[@id=\"n/1380015031\"]/span/a/span")).click();  // click on cookware
				            driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/h2/a/span")).click(); //select any cookware 
				       
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
				    		
				         
				           //Thread.sleep(100);
				            
				            driver.close();
				            driver.quit();

				          

	}

}
