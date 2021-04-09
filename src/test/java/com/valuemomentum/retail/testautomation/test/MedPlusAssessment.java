package com.valuemomentum.retail.testautomation.test;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class MedPlusAssessment {
	
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
		
		@Test(priority=1)
		public void MedPlusMethod() throws Exception {
			
			// Opening MedPlusMart Website
		driver.navigate().to("https://www.medplusmart.com");           
			Thread.sleep(5000);
			/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)              
	                 .withTimeout(Duration.ofSeconds(10))
	                 .pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
	         WebElement HealthStore = wait.until(new Function<WebDriver, WebElement>() {
	             public WebElement apply(WebDriver driver) {
	                 return driver.findElement(By.xpath("(//*[@title='Health Store'])[2]"));
	             }
	         });*/
			
			//Hover on Health-Store
			WebElement HealthStore = new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@title='Health Store'])[2]")));  
			
			
		    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		          FileUtils.copyFile(scr, new File("./ScreenShot/homepage.png"));

			File scrFile = HealthStore.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("./ScreenShot/image_"+HealthStore.getText()+".png"));
			System.out.println("\nTitle : " + driver.getTitle() + "\nItem Selected : " + HealthStore.getText());
            Actions act = new Actions(driver);
			act.moveToElement(HealthStore).perform();
			//Thread.sleep(4000);
			
			// Clicking on PersonalCare
			//using explicit wait
			WebElement PersonalCare = new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='cate-main'])[2]")));
			 File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(s, new File("./ScreenShot/personalcarepage.png"));

			
			File scrFile1 = PersonalCare.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("./ScreenShot/image_"+PersonalCare.getText()+".png"));
			System.out.println("\nItem Selected : " +PersonalCare.getText() + "\n");
			PersonalCare.click();
			
			
			// Clicking on OralCare
			WebElement menuOralCare = new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@title='Oral Care'])[2]")));
			 
			
			File scrFile2 = menuOralCare.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("./ScreenShot/image_"+menuOralCare.getText()+".png"));
			System.out.println("Title : " + driver.getTitle() + "\nItem Selected : " + menuOralCare.getText() + "\n");
			menuOralCare.click();
			//Thread.sleep(2000);         *********
			
			
			// Clicking on Tooth Paste & Powder
			WebElement menuToothPaste = new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.id("leftNav_MART_30046")));
			 File r = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(r, new File("./ScreenShot/personalcarepage.png"));

			File scrFile3 = menuToothPaste.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("./ScreenShot/image_"+menuToothPaste.getText()+".png"));
			System.out.println("Title : " + driver.getTitle() + "\nItem Selected : " + menuToothPaste.getText() + "\n");
			menuToothPaste.click();
			//Thread.sleep(2000);
			
			// Set Price Filter to 100
			WebElement slider = new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@class='slider-track']"))));
			act.dragAndDropBy(slider, -35, 0);
			act.build().perform();
			File scrFile4 = slider.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("./ScreenShot/image_"+slider.getText()+".png"));
			//Thread.sleep(5000);  ****
			

			// Selecting Dropdown Menu of 1st Product
			WebElement dropdown=new  WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable((By.xpath("(//*[@id='PEPS0011_dropdownMenu'])[2]"))));
			dropdown.click();
			//Thread.sleep(4000);
			
			
			// Selecting (70 grams - Rs 55.00) from Dropdown Menu
			WebElement gramsSelector1 =new  WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.linkText("70 grams - Rs 55.00")));
			File scrFile5 = gramsSelector1.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile5, new File("./ScreenShot/image_"+gramsSelector1.getText()+".png"));
			System.out.println("Title : " + driver.getTitle() + "\nItem Selected : " + gramsSelector1.getText()+"\n");
			gramsSelector1.click();
			//Thread.sleep(1000);
			
			
			// Adding to Cart
			WebElement addToCart1 = new  WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Add to Cart'])[2]")));
			File scrFile6 = addToCart1.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile6, new File("./ScreenShot/image_"+addToCart1.getText()+".png"));
			System.out.println("Item Selected : " + addToCart1.getText() + "\n");
			addToCart1.click();
			//Thread.sleep(3000);
			
			
			// Copying 1st Product Description 
			  WebElement pN1= new  WebDriverWait(driver, Duration.ofSeconds(10))
		                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text( )=\"PEPSODENT EXPERT PROTECTION GUMCARE TOOTHPASTE 70GM\"])")));
	          String productNo1 = pN1.getText();
			
	       
           // Selecting Dropdown Menu of 2nd Product
			WebElement d2=new  WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='PEPS0017_dropdownMenu'])[2]")));
	                		d2.click();
			//Thread.sleep(4000);
			
			
			// Selecting (80 grams - Rs 50.00) from Dropdown Menu
			WebElement gramSelector2 =new  WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.linkText("80 grams - Rs 50.00")));
			File c= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(c, new File("./ScreenShot/secondproductpage.png"));

			File scrFile7 = gramSelector2.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile7, new File("./ScreenShot/image_"+gramSelector2.getText()+".png"));
			System.out.println("Title : " + driver.getTitle() + "\nItem Selected : " + gramSelector2.getText());
			gramSelector2.click();
			//Thread.sleep(1000);
			
			
			// 2nd product is Adding to Cart
			WebElement  addToCart2= new  WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Add to Cart'])[6]")));
			System.out.println("\tItem Selected : " + addToCart2.getText());
			addToCart2.click();
			Thread.sleep(4000);
			 // Copying 2nd Product Description
			 WebElement pN2 = new  WebDriverWait(driver, Duration.ofSeconds(10))
		                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text( )=\"PEPSODENT GERMICHECK 2IN1 TOOTHPASTE 80GM\"])")));
		     String productNo2 = pN2.getText();
			// Thread.sleep(5000);  *****
			 
			 
			// Clicking on Cart
			WebElement cart=new  WebDriverWait(driver, Duration.ofSeconds(30))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Shopping Cart']")));
			cart.click();
			//Thread.sleep(3000);
			
			
			// Copying product Description in Cart
			WebElement cP1 = new  WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='col-sm-6 col-md-6'])[1]")));
			File scrFile8 = cP1.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile8, new File("./ScreenShot/image_"+cP1.getText()+".png"));
			String cartProduct1 = cP1.getText();
			
			
            WebElement cP2 = new  WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='col-sm-6 col-md-6'])[2]")));
			File scrFile9 = cP2.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile9, new File("./ScreenShot/image_"+cP2.getText()+".png"));
			String cartProduct2 = cP2.getText();
			
			
			// Clicking On view Shopping Cart
			WebElement viewCart = new  WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn btnRed-drkhvr btn-block']")));
			File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(f, new File("./ScreenShot/addtocartpage.png"));

			
			File scrFile10 = viewCart.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile10, new File("./ScreenShot/image_"+viewCart.getText()+".png"));
			System.out.println("\nItem Selected : " + viewCart.getText() + "\n");
			viewCart.click();
			File g= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(g, new File("./ScreenShot/signinpage.png"));

			
			// Displaying the Product Details in Cart
			System.out.println("The Items in Cart are : \n" + productNo1 + "\n" + productNo2 + "\n");
			
			// Verifying whether Selected Product are in cart
			if (productNo1.contentEquals(cartProduct1) && productNo2.contentEquals(cartProduct2)) {
				System.out.println("True\n");
			} else {
				System.out.println("False");
			}
			Thread.sleep(1000);

		}
		
		//Locators
		
		@Test(priority=3,enabled=true)  //When enabled is false code doesn't executes
		public void MedplusLocators() throws InterruptedException, IOException {
			
			driver.navigate().to("https://www.medplusmart.com");

			Thread.sleep(5000);
			
			
			Rectangle rect=driver.findElement(By.xpath("(//*[text()='Pharmacy'])[1]")).getRect();
		    System.out.println("Height value of:" +rect.getHeight());
		    System.out.println("Width value of:" +rect.getWidth());
            System.out.println("x value of:" +rect.getX());
		    System.out.println("y value of:" +rect.getY());
		    System.out.println("Dimensions value of:" +rect.getDimension());
		    System.out.println("point value of:" +rect.getPoint());
		    
		   
		    WebElement btnnext=driver.findElement(By.xpath("(//*[text()='Pharmacy'])[1] "));
		    
		    System.out.println(" Before Entering Value-Button status displayed : "+btnnext.isDisplayed());
		    System.out.println(" Before Entering Value-Button status enabled : "+btnnext.isEnabled());
		    System.out.println(" Before Entering Value-Button status selected : "+btnnext.isSelected());
		   
		    
		    WebElement menu=driver.findElement(By.xpath("(//*[text()='Pharmacy'])[1]"));
			  
				  System.out.println("Text of the element : "+menu.getText());
				  System.out.println("value of the element : "+menu.getAttribute("value"));
				  System.out.println("css-color value of the element : "+menu.getCssValue("color"));
				  System.out.println("css-font family of the element : "+menu.getCssValue("font-family"));
				  System.out.println("css-font size value of the element : "+menu.getCssValue("font-size"));
				   System.out.println("Tag of the element :  " +menu.getTagName());
				   System.out.println("Hash Code : " +menu.hashCode());
		}
					 
		
		
		//Signing into Medplussmart.com
		 		  
		         	@DataProvider(name = "signin")
		        	public Object[][] dataInput(){
		        		return new Object[][] {
		        			{"7036201189","Indu123"},
		        			{"9640184215","Shashi123"},
		        			{"7660047999","Priya123"}
		        			};
		        	}
		        	
		        	@Test(dataProvider = "signin",priority=2)
		        	public void verifyLogin(String username,String password) throws InterruptedException {
		        		
		        		driver.navigate().to("https://www.medplusmart.com");
		     		  //Thread.sleep(3000);
		     		   
		     		   //using fluent wait
		        		
		     		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		     	      		  .withTimeout(Duration.ofSeconds(10))
		     	      		  .pollingEvery(Duration.ofMillis(5))
		     	      		  .ignoring(TimeoutException.class,NoSuchElementException.class);

		     	      		WebElement signinBtn = wait.until(new Function<WebDriver, WebElement>() {
		     	      		  public WebElement apply(WebDriver driver) {
		     	      		    return driver.findElement(By.xpath("//*[@id='signInLink']"));
		     	      		  }
		     	      		});
		     	      		signinBtn.click();
		     	      		Thread.sleep(1000);
		     	      	 Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			     	      		  .withTimeout(Duration.ofSeconds(10))
			     	      		  .pollingEvery(Duration.ofMillis(5))
			     	      		  .ignoring(TimeoutException.class,NoSuchElementException.class);

			     	      		WebElement username1 = wait.until(new Function<WebDriver, WebElement>() {
			     	      		  public WebElement apply(WebDriver driver) {
			     	      		    return driver.findElement(By.xpath("//*[@id='username']"));
			     	      		  }
			     	      		});
			     	      		username1.sendKeys(username);

						//driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
						//Thread.sleep(2000);
			     	      							
						//driver.findElement(By.xpath("(//*[@id='password'])")).sendKeys(password);
						//Thread.sleep(2000);
						 Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
			     	      		  .withTimeout(Duration.ofSeconds(10))
			     	      		  .pollingEvery(Duration.ofMillis(5))
			     	      		  .ignoring(TimeoutException.class,NoSuchElementException.class);

			     	      		WebElement password1 = wait.until(new Function<WebDriver, WebElement>() {
			     	      		  public WebElement apply(WebDriver driver) {
			     	      		    return driver.findElement(By.xpath("(//*[@id='password'])"));
			     	      		  }
			     	      		});
			     	      		password1.sendKeys(password);
			     	      	 Wait<WebDriver> wait4 = new FluentWait<WebDriver>(driver)
				     	      		  .withTimeout(Duration.ofSeconds(10))
				     	      		  .pollingEvery(Duration.ofMillis(5))
				     	      		  .ignoring(TimeoutException.class,NoSuchElementException.class);

				     	      		WebElement loginbtn = wait.until(new Function<WebDriver, WebElement>() {
				     	      		  public WebElement apply(WebDriver driver) {
				     	      		    return driver.findElement(By.xpath("(//*[@id='popupLoginButton'])"));
				     	      		  }
				     	      		});
				     	      		loginbtn.click();
				     	      		

						
						//driver.findElement(By.xpath("(//*[@id='popupLoginButton'])")).click();
						//Thread.sleep(2000);

		     
		        	}
}
			

		  



	


	

	



