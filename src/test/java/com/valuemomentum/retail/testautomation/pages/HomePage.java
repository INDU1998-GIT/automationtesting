package com.valuemomentum.retail.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.valuemomentum.retail.testautomation.utils.WebDriverHelper;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(linkText = "Mobiles")
	private WebElement _ClickOpt;
	
	
	
	
	public MobileSearchResultPage ClickButton() {
		WebDriverHelper.captureScreenshot("Homepage");
		
		_ClickOpt.click();
		WebDriverHelper.captureScreenshot("Mobilesearchresultpage");
		
		return new MobileSearchResultPage(driver) ;

	}	

	
	
	



}
