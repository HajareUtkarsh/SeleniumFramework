package com.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartObject {
	public WebDriver driver;
	
	private By addToCart = By.xpath("//span[@id='submit.add-to-cart-announce']");
	private By proceed = By.xpath("//input[@name='proceedToRetailCheckout']");
	
	public AddToCartObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement add() {
		return driver.findElement(addToCart);
	}
	public WebElement next() {
		return driver.findElement(proceed);
	}
}
