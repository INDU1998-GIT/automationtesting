package com.valuemomentum.retail.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
static WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		PageFactory.initElements(driver, this);
		this.driver=driver;
	
	}

}
