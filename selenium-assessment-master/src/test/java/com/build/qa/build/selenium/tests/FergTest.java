package com.build.qa.build.selenium.tests;

import static org.junit.Assert.assertEquals;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.build.qa.build.selenium.framework.BaseFramework;
import com.build.qa.build.selenium.pageobjects.homepage.CategoryPage;
import com.build.qa.build.selenium.pageobjects.homepage.HomePage;


public class FergTest extends BaseFramework {

	/**
	 * Extremely basic test that outlines some basic functionality and page objects
	 * as well as assertJ
	 * @throws InterruptedException 
	 */
	@Test
	public void navigateToHomePage() throws InterruptedException {
		driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);

		softly.assertThat(homePage.onHomePage()).as("The website should load up with the Build.com desktop theme.")
				.isTrue();
		
		
	}

	/**
	 * Search for the Moen m6702bn from the search bar
	 * 
	 * @throws InterruptedException
	 * @assert: That the product page we land on is what is expected by checking the
	 *          product brand and product id
	 * @difficulty Easy
	 */
	
	  @Test 
	  public void searchForProductLandsOnCorrectProduct() throws InterruptedException 
	   {
	  
	  // TODO: Implement this test 
		driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);
		
		// 1- Click on search bar after launch the application
		// 2-  Search for the "Moen m6702bn"

		homePage.clickOnSearchBar();
		Thread.sleep(2000);
		// 3- Click on search icon


		homePage.searchIcon();
		Thread.sleep(2000);
		
	
		// 4- Verify the brand name and product id of a product

		homePage.verifyBrandName();
		
		//5
		homePage.verifyproductId();
		  
	  }
	 
	/**
	 * Go to the Bathroom Sinks category directly
	 * (https://www.ferguson.com/category/bathroom-plumbing/bathroom-faucets/bathroom-sink-faucets/_/N-zbq4i3)
	 * and add the second product on the search results (Category Drop) page to the
	 * cart.
	 * @throws InterruptedException 
	 * 
	 * @assert: the product that is added to the cart is what is expected
	 * @difficulty Easy-Medium
	 */
	
	  @Test
	  public void addProductToCartFromCategoryDrop() throws InterruptedException   { 
		  // TODO: Implement this test 
		  
		  CategoryPage categoryPage = new CategoryPage(driver, wait);
		  
		  // 1- Navigate to the url directly
		  	categoryPage.geturl();
			// 2- Select second product

			// 3- Choose the product
			categoryPage.ClickOnSecondProduct();
			Thread.sleep(2000);
			
			// 4- Click on Add to cart button
			// 5- Click on cart to view cart
			categoryPage.ClickOnAddToCartButton();
			Thread.sleep(2000);
		

			
			// 6- Verify the product that is added as expected
			categoryPage.verifyaddeditem();
	  }
	 /**
		 * Add two different finishes of a product (such as Moen m6702bn) to cart,
		 * change the quantity of each finish on the cart page
	 * @throws InterruptedException 
		 * 
		 * @assert that the product and cart total update as expected when the quantity
		 *         is changed
		 * @difficulty Medium-Hard
		 */
	
	  @Test 
	  public void addMultipleCartItemsAndChangeQuantity() throws InterruptedException {
		  // TODO:Implement this test 
			/*
			 * 1- add single handle --> proflo to the cart 
			 * 2- change the quantity to 2 
			 * 3-add another product to the cart 
			 * 4- change the quantity to 3
			 * 5- verify that both items are added and also verify the quantity of each items 
			 * 6- verify items quantity is as expected
			 * 
			 */
	  
		  CategoryPage categoryPage = new CategoryPage(driver, wait);
		  
		  // 1- Navigate to the url directly
		  	categoryPage.geturl();
			// 2- Select second product

			// 3- Choose the product
			categoryPage.ClickOnSecondProduct();
			Thread.sleep(2000);
			
			// 4- Click on Add to cart button
			// 5- Click on cart to view cart
			categoryPage.ClickOnAddToCartButton();
			Thread.sleep(2000);
			
			categoryPage.verifyaddToquantityTwotoCart();
			
			categoryPage.verifyaddToquantityThreetoCart();
			
			
			
			
		

	  
	  
	  
	  
	  
	  }
	  
	 /**
		 * Go to a category drop page (such as Bathroom Faucets) and narrow by at least
		 * two filters (facets), e.g: Finish=Chromes and Brand=Brizo
		 * 
		 * @assert that the correct filters are being narrowed, and the result count is
		 *         correct, such that each facet selection is narrowing the product
		 *         count.
		 * @difficulty Hard
		 */
	  @Test 
	  public void facetNarrowBysResultInCorrectProductCounts() { // TODO: Implement this test
		/* 
			 *  1- Go to url again
			 *  2- Select vrand as a Brizo //p[contains(text(),'98')]
			 *  3- select finish as a chrome //p[contains(text(),'Chromes')]
			 *  4- verify the filters on the screen
			 *  5- verify when brizo added then count = to 98
			 *  6- verify when chrome added then result count = to 77
			 *  
			 *  
			 *  	 */
		  
		  
		  
	  }
		
}
