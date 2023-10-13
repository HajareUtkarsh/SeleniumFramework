package com.object;

import org.openqa.selenium.WebDriver;

public class SelectItemObject {

	public WebDriver driver;
	public SelectItemObject(WebDriver driver1) {
		this.driver=driver1;
	}

	public void toSelectItem() {
		ShoppingItemObject obj = new ShoppingItemObject(driver);
		for(int i=0; i<obj.getProducts().size(); i++) {
			obj.getProducts().get(3).click();
		}
	}
}
