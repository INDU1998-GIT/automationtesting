

package com.valuemomentum.retail.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.valuemomentum.retail.testautomation.utils.WebDriverHelper;

public class SearchResultPage extends BasePage {

	public SearchResultPage(WebDriver driver) {
		super(driver);

	}

	// element
	@FindBy(xpath = "//*[text()='New Apple iPhone 12 Pro Max (128GB) - Pacific Blue']")
	private WebElement _lblItem;

	public AmazonProductDetailsPage clickOnItem() {
		_lblItem.click();
		WebDriverHelper.switchToWindow();
		return new AmazonProductDetailsPage(driver);

	}
	public String GetText()
	{
		return _lblItem.getText();
	}

}


