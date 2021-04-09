

package com.valuemomentum.retail.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage {

	public AmazonHomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement _txtSearchBox;

	@FindBy(id = "nav-search-submit-button")
	private WebElement _btnSearch;

	public void enterSearchText(String text) {
		_txtSearchBox.sendKeys(text);

	}

	public SearchResultPage clickOnSearchButton() {
		_btnSearch.click();
		return new SearchResultPage(driver);

	}

}


