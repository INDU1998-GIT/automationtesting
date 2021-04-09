package com.valuemomentum.retail.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.valuemomentum.retail.testautomation.utils.WebDriverHelper;

public class MobileSearchResultPage  extends BasePage {
	//constructor
	
	public MobileSearchResultPage(WebDriver driver)
	{
         super(driver);
	}
	
	
	
	
	//element
	
	@FindBy(linkText = "Cloudtail India")
	private WebElement _ClickOpt2;

	public FiltersResultPage ClickButton2() {
		_ClickOpt2.click();
		WebDriverHelper.captureScreenshot("Filterresultpage");
		
		return new FiltersResultPage(driver);

	}

	
	/*public FiltersResultPage checkBox() throws InterruptedException
	{
		
		_checkItem.click();
		Thread.sleep(3000);
		WebDriverHelper.captureScreenshot("CheckBox");
		//return new  ProductSelectPage(getDriver());
		return new FiltersResultPage(getDriver());
		
	}*/

}