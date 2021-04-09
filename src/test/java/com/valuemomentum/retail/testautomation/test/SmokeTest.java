


package com.valuemomentum.retail.testautomation.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.valuemomentum.retail.testautomation.pages.AmazonHomePage;
import com.valuemomentum.retail.testautomation.pages.AmazonProductDetailsPage;
import com.valuemomentum.retail.testautomation.pages.SearchResultPage;
import com.valuemomentum.retail.testautomation.utils.BaseTest;


public class SmokeTest extends BaseTest{
	WebDriver driver;
	AmazonHomePage homePage;
	AmazonProductDetailsPage productDetailsPage;
	SearchResultPage searchResultPage;
	
	@BeforeClass
	public void setup() {
		this.driver = getDriver();
		homePage=new AmazonHomePage(driver);
	}

	@Test
	public void verifyMobilePurchaseAssertions() throws InterruptedException {
		System.out.println("Thread id" +Thread.currentThread().getId());
		//homePage.enterSearchText("Play Station");
		
		homePage.enterSearchText("iphone");
		Thread.sleep(2000);
		searchResultPage=homePage.clickOnSearchButton();
		String extractedText=searchResultPage.GetText();
		Thread.sleep(2000);
		Assert.assertEquals(extractedText, "New Apple iPhone 12 Pro Max (128GB) - Pacific Blue");
				
		productDetailsPage=searchResultPage.clickOnItem();
		Thread.sleep(2000);
		productDetailsPage.clickOnAddToCart();
		Thread.sleep(5000);
	}
}



