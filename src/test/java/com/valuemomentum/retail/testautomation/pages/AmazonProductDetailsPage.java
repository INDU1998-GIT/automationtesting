

package com.valuemomentum.retail.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonProductDetailsPage extends BasePage {

	public AmazonProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "add-to-cart-button")
	private WebElement _btnAddToCart;

	public void clickOnAddToCart() {
		_btnAddToCart.click();
	}
	
	

}



