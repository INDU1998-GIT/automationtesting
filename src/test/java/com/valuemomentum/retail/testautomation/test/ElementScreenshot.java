


package com.valuemomentum.retail.testautomation.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {

	public static void main(String[] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://www.amazon.in");
		  Thread.sleep(1000);
//step 1: Identify elements
		  List<WebElement> menuItem=driver.findElements(By.xpath("//*[@id='nav-xshop']/a "));
		  System.out.println("Size of the elements   "+menuItem.size());
		 
		 
		     File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		       try {
				FileUtils.copyFile(scrFile, new File("./screenshot/image.png"));
			} catch (IOException e) {
			
				e.printStackTrace();
			}  
		  for(WebElement value:menuItem)
		  {
			  String text=value.getText();
			  
			  System.out.println("Menu value  " +value.getText());
			  File elementfile=value.getScreenshotAs(OutputType.FILE);
			    
			  try {
					FileUtils.copyFile(elementfile, new File("./screenshot/image_"+text+".jpeg"));
				} catch (IOException e) {
				
					e.printStackTrace();
				}  
			  
			  
		  }
		  driver.close();
		  driver.quit();

	}

}


