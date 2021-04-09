package com.valuemomentum.retail.testautomation.pages;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.valuemomentum.retail.testautomation.utils.BaseTest;
import com.valuemomentum.retail.testautomation.utils.WebDriverHelper;

public class SmokeTest extends BaseTest{
	private static	final Logger logger=LogManager.getLogger(SmokeTest.class);
	WebDriver driver;
	HomePage  homepage;
	MobileSearchResultPage mobilepage;
	FiltersResultPage filterresultpage;
	ProductDetailsPage ProductDetailsPage;
  
	@BeforeClass
	public void setup()
	{
		logger.info("setup method called");
		homepage=new HomePage(getDriver());
	}
	
	@Test(priority=1,enabled=true)
	public void verifyProductPurchase() throws InterruptedException
	{
		final Logger loggerr=LogManager.getLogger(SmokeTest.class);
		System.out.println("Thread id" +Thread.currentThread().getId());
		
		loggerr.info("clicked on mobiles in homepage");
		mobilepage=homepage.ClickButton();
		//Thread.sleep(2000);
		loggerr.info("selected filter in Mobile search Page ");
		filterresultpage=mobilepage.ClickButton2();
		//Thread.sleep(2000);
		String extractedText=FiltersResultPage.GetItemText();
		Assert.assertEquals(extractedText, "E-Cosmos Stylist Little Adapter Micro USB OTG to USB 2.0 Adapter for Smartphones and Tablets - Set of 3");
		
		loggerr.info("selected Item in Filters Result Page");
		ProductDetailsPage=FiltersResultPage.ClickButton3();
		
		//Thread.sleep(2000);
		loggerr.info("Item added to cart in Product Details Page" );
		ProductDetailsPage.ClickButton4();
		
		Thread.sleep(5000);
		
		loggerr.info("Test completed");
	}
		
	}

