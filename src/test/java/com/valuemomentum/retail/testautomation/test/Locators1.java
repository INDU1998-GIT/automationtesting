package com.valuemomentum.retail.testautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://www.amazon.in");
    WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
    System.out.println("Text from image" +logo.getText());
    
    Rectangle rect=driver.findElement(By.xpath("//div/a[text()='Mobiles']")).getRect();
    System.out.println("Height value of:" +rect.getHeight());
    System.out.println("Width value of:" +rect.getWidth());

    System.out.println("x value of:" +rect.getX());
    System.out.println("y value of:" +rect.getY());
    System.out.println("Dimensions value of:" +rect.getDimension());
    System.out.println("point value of:" +rect.getPoint());
    
   
    WebElement btnnext=driver.findElement(By.xpath("//div/a[text()='Customer Service'] "));
    
    System.out.println(" Before Entering Value-Button status displayed "+btnnext.isDisplayed());
    System.out.println(" Before Entering Value-Button status enabled "+btnnext.isEnabled());
    System.out.println(" Before Entering Value-Button status selected "+btnnext.isSelected());
   
    
    
  

    
		  WebElement menumobiles=driver.findElement(By.xpath("//div/a[text()='Mobiles']"));
		  System.out.println("Text of the element "+menumobiles.getText());
		  System.out.println("Aria role of the element "+menumobiles.getAriaRole());
		System.out.println("Accessible name of the element "+menumobiles.getAccessibleName());
			 
		  System.out.println("Attribute  of the element "+menumobiles.getAttribute("data-csa-c-id"));
		  System.out.println("value of the element "+menumobiles.getAttribute("value"));
		  System.out.println("css-color value of the element "+menumobiles.getCssValue("color"));
		  System.out.println("css-font family of the element "+menumobiles.getCssValue("font-family"));
			 System.out.println("css-font size value of the element "+menumobiles.getCssValue("font-size"));
	System.out.println("DOM attribute value of the element "+menumobiles.getDomAttribute("data-csa-c-id"));
		 System.out.println("Dom property value of the element "+menumobiles.getDomProperty("data-csa-c-id"));
				System.out.println("Tag of the element " +menumobiles.getTagName());
				System.out.println("Hash Code:" +menumobiles.hashCode());
			 
		  

	}

}
