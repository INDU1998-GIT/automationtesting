package com.valuemomentum.retail.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.valuemomentum.retail.testautomation.utils.WebDriverHelper;

public class ProductDetailsPage  extends BasePage {
	public ProductDetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
  @FindBy(id="add-to-cart-button")
	private WebElement _addtoCart;
	
	
	

	public void ClickButton4() {
		WebDriverHelper.captureScreenshot("Productdetailspage");
		
		_addtoCart.click();
		WebDriverHelper.captureScreenshot("AddToCart");
		
		
	}


}