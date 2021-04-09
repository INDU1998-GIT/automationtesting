
package com.valuemomentum.retail.testautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/html/html_iframe.asp");
		Thread.sleep(1000);
		int iframeSize=driver.findElements(By.tagName("iframe")).size();
		System.out.println("total iframes in web page " +iframeSize);
		
		//Dimensions of window
		Dimension size=driver.manage().window().getSize();
		int width1=size.getWidth();
		int height1=size.getHeight();
		System.out.println("width of screen " +width1);
		System.out.println("Height of screen "+height1);
		
	
		
		

		
		driver.switchTo().frame(0);
		driver.findElement(By.id("topnavbtn_tutorials")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("topnavbtn_references")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("topnavbtn_tutorials")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("topnavbtn_references")).click();
		
		driver.manage().window().setSize(new Dimension(1024,768));
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(900,900));
		Thread.sleep(5000);
		
		
				Point position = driver.manage().window().getPosition(); //x and y are position of the window
				int x1 = position.getX(); 
				int y1 = position.getY();
                    System.out.println("position of x:" +x1);
                    System.out.println("position of y:" +y1);
                    
                    
              
                    		driver.manage().window().setPosition(new Point(0, 0));
                    		Point position1 = driver.manage().window().getPosition(); //x and y are position of the window
            				
                    		int x2 = position1.getX(); 
            				int y2 = position1.getY();
                                System.out.println("position of x:" +x2);
                                System.out.println("position of y:" +y2);
                            
                    
                    
                    
                    
                     

		
		
		
		
		
		
		
		
		

		
		

	}

}
