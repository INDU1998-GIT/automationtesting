package com.valuemomentum.retail.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.valuemomentum.retail.testautomation.utils.WebDriverHelper;

public class FiltersResultPage extends BasePage {
	
	public FiltersResultPage(WebDriver driver)
	{
		super(driver);
	}
	
   // element
	
	@FindBy(xpath = "//*[text()='E-Cosmos Stylist Little Adapter Micro USB OTG to USB 2.0 Adapter for Smartphones and Tablets - Set of 3']")
	private static WebElement _ClickOpt3;
	
	
	public static ProductDetailsPage ClickButton3() {
		_ClickOpt3.click();
		WebDriverHelper.switchToWindow();
		return new ProductDetailsPage(driver);
	
	}
	
	public static String GetItemText()
	{
		return _ClickOpt3.getText();
	}

	

}
