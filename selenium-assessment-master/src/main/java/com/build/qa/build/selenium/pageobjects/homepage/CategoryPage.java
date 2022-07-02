package com.build.qa.build.selenium.pageobjects.homepage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class CategoryPage extends BasePage{
	
	By singlehandle= By.xpath("//a[contains(text(),'Single Handle')]");
	
	By proflo=By.xpath("//p[contains(text(),'PROFLO® Single Handle Centerset Bathroom Sink Faucet in Brushed Nickel with 50/50 Pop-Up')]");
	
	By addcartbtn = By.xpath("//input[@class='btn__primary js-add-to-cart ']");
	
	By cart = By.xpath("//li[@class='cart i-cart']");
	
	By addeditem=By.xpath("//p[contains(text(),'PROFLO® Single Handle Centerset Bathroom Sink Faucet in Brushed Nickel with 50/50 Pop-Up')]");

	By addquantitytoCart=By.xpath("//div[@class='quantity__up quantity__button jq-qty-up']");
	
	By updateQuantitytocart=By.xpath("//input[@name='updateQuantity']");
	
			
	public CategoryPage(WebDriver driver, Wait<WebDriver> wait) {
		
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	public void geturl()
	{
		driver.get("https://www.ferguson.com/category/bathroom-plumbing/bathroom-faucets/bathroom-sink-faucets/_/N-zbq4i3");
	}
	
	public void ClickOnSecondProduct() throws InterruptedException
	{
		driver.findElement(singlehandle).click();
		Thread.sleep(2000);
		driver.findElement(proflo).click();
		Thread.sleep(2000);
	
	}
	public void ClickOnAddToCartButton() throws InterruptedException
	{
		driver.findElement(addcartbtn).click();
		Thread.sleep(2000);
		driver.findElement(cart).click();
		Thread.sleep(2000);

		
		
		
	}
	public void verifyaddeditem()
	{
		String addeditems=driver.findElement(addeditem).getText();
		assertEquals(addeditems, "PROFLO® Single Handle Centerset Bathroom Sink Faucet in Brushed Nickel with 50/50 Pop-Up"); 

	}
	
	public void verifyaddToquantityTwotoCart() throws InterruptedException
	{
		driver.findElement(addquantitytoCart).click();
		Thread.sleep(2000);
		String updatedQuantity=driver.findElement(updateQuantitytocart).getText();
		assertEquals(updatedQuantity, 2);
		Thread.sleep(2000);


	}
	
	public void verifyaddToquantityThreetoCart() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(addquantitytoCart).click();
		Thread.sleep(2000);
		String updatedQuantity=driver.findElement(updateQuantitytocart).getText();
		assertEquals(updatedQuantity, 3);
		Thread.sleep(2000);


	}

}




