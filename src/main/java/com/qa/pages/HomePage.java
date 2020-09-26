package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.BaseTest;

public class HomePage extends BaseTest{

	@FindBy(id = "search-input")
	private WebElement searchField;
	
	@FindBy(css = "input[aria-label='Caja de búsqueda']")
	private WebElement sendInfo;
	
	@FindBy(css = "button[class*='search-button']")
	private WebElement searchIcon;
	
	@FindBy (xpath = "//ul[@class='ebx-facet__filters']/li[1]")
	private WebElement waitText;

	public HomePage sendProductName() {
		click(searchField);
		sendKeys(sendInfo, "Pizza");
		return this;
	}
	
	public ResultPage clickSearchIcon() {
		waitForVisibility(waitText);
		click(searchIcon);
		return new ResultPage();
	}

}
