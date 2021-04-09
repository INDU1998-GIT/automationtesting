 package com.valuemomentum.retail.testautomation.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Kotak {

//public static void main(String[] args) throws Exception {
	

	
	
		
			@Test
			public void verifyLogin() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\indushashig\\Downloads\\chromedriver_win32\\chromedriver.exe");

				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://netbanking.kotak.com/knb2/");

				WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
						.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
				firstResult.sendKeys("12123");

				//                 ImplicitlyWait
				// No condition what ever it will wait for 2sec
				// it will check at 0sec if it is not seen it will check again at 2 sec if
				// visiblity is there are not
				// driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

				/* //           Explicit wait
				 * // if button is not enable then it will wait for 5sec to enable (like
				 * condition) // every 500millisec it will check condition default we cannot
				 * change polling WebElement e1 = new WebDriverWait(driver,
				 * Duration.ofSeconds(10))
				 * .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']"
				 * ))); e1.click();
				 */

				//                    FluentWait
				// Fluent Wait if button is not enable then it will wait for 5sec to enable
				// (like condition)
				// every 5millisec it will check condition and we can change polling
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
						.pollingEvery(Duration.ofMillis(5)).ignoring(TimeoutException.class, NoSuchElementException.class);

				WebElement s1 = wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return driver.findElement(By.xpath("//*[@type='submit']"));
					}
				});
				s1.click();

				Thread.sleep(5000);
				driver.close();
				driver.quit();

			}

		}
