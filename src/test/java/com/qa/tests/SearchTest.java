package com.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.ResultPage;

public class SearchTest extends BaseTest{
	
	HomePage homePage;
	ResultPage resultPage;
	
	
	  @BeforeMethod
	  public void beforeMethod() {
		  homePage = new HomePage();
		  resultPage = new ResultPage();
	  }
	  
	  @Test
	  public void searchPizza() {
		  homePage.sendProductName();
		  homePage.clickSearchIcon();
	  }

}
