package com.object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingDestinationObject {
	public WebDriver driver;
	
	private By all = By.xpath("//i[@class='hm-icon nav-sprite']");
	private By electronics = By.xpath("//a[@data-menu-id='5']");
	private By menuInElectronics = By.xpath("//ul[@data-menu-id='1']/li");
	
	public ShoppingDestinationObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement allMenu() {
		return driver.findElement(all);
	}
	public WebElement entcSection() {
		return driver.findElement(electronics);
	}
	public List<WebElement> phnAccessories() {
		return driver.findElements(menuInElectronics);
	}

}
