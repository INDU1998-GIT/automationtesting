
package com.valuemomentum.retail.testautomation.test;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Assignment{
	WebDriver driver;
	
	@BeforeTest
	public void test_beforesuite() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void test_aftersuite() {
		driver.close();
		driver.quit();
	}
	
	@DataProvider(name = "credentials")
	public Object[][] dataInput(){
		return new Object[][] {
			{"917036201189","Indu"},
			{"919640184215","Shashi"},
			{"917660047999","Priya"}
			};
	}
	
	@Test(dataProvider = "credentials" )
	public void verifyLogin(String id,String password) throws InterruptedException {
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement loginBtn = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList-nav-line-1")));
		loginBtn.click();

		
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(id);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='a-button-input']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		
	}
	
	@Test  //When enabled is false code doesn't executes
	public void menuMedplus() throws InterruptedException, IOException {
		
		driver.navigate().to("https://www.medplusmart.com");

		Thread.sleep(5000);
		
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
      		  .withTimeout(Duration.ofSeconds(10))
      		  .pollingEvery(Duration.ofMillis(5))
      		  .ignoring(TimeoutException.class,NoSuchElementException.class);

      		WebElement Menu = wait.until(new Function<WebDriver, WebElement>() {
      		  public WebElement apply(WebDriver driver) {
      		    return driver.findElement(By.xpath("//*[contains(@class,'menubar')]"));
      		  }
      		});
      	
		
		
		List<WebElement> list= Menu.findElements(By.tagName("a"));
		
		for(WebElement items:list) {
			File scrFile = items.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("./ScreenShot1/image_"+items.getText()+".png"));
			System.out.println(items.getText());
		}

		Thread.sleep(3000);

	}
}







