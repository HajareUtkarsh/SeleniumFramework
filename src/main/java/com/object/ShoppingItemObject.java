package com.object;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingItemObject {
	
	public WebDriver driver;
	private By products = By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']");
	private By price = By.xpath("//span[@class='a-price']");
	private By bestSeller = By.xpath("//span[@class='a-badge-text']");//this xpath for finding elements containing perticular text //*[contains(text(), \"Best Seller\")]
	public ShoppingItemObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public List<WebElement> getProducts(){
		return driver.findElements(products);
	}
	public List<WebElement> getPrice(){
		return driver.findElements(price);
	}
	public List<WebElement> bestSel() {
		return driver.findElements(bestSeller);
	}
	
	
}
