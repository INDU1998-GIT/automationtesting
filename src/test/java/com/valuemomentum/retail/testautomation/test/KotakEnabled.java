
package com.valuemomentum.retail.testautomation.test;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KotakEnabled {

	public static void main(String[] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://netbanking.kotak.com/knb2/ ");
    	Thread.sleep(10000);
    	
    	System.out.println("Active Element is: " +driver.switchTo().activeElement().getTagName());
    	System.out.println("Active Element is: " +driver.switchTo().activeElement().getCssValue("color"));
   
    	
   
   
    	    	




    	
    WebElement btnnext=driver.findElement(By.xpath(" //*[@type='submit']"));
    System.out.println(" Before Entering Value-Button status displayed "+btnnext.isDisplayed());
    System.out.println(" Before Entering Value-Button status enabled "+btnnext.isEnabled());
    System.out.println(" Before Entering Value-Button status selected "+btnnext.isSelected());
    
    driver.findElement(By.id("userName")).sendKeys("InduShashi");
    System.out.println(" After Entering Value-Button status displayed "+btnnext.isDisplayed());
    System.out.println(" After Entering Value-Button status enabled "+btnnext.isEnabled());
    System.out.println(" After Entering Value-Button status selected "+btnnext.isSelected());
    
    
    
    


	}

}
