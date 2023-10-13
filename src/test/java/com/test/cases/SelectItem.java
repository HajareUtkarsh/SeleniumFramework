package com.test.cases;


import org.testng.annotations.Test;
import com.object.ShoppingItemObject;
import com.resources.BaseClass;

public class SelectItem extends BaseClass{
	
	@Test(priority = 3)
	public void toSelectItem() throws InterruptedException {
		ShoppingItemObject obj = new ShoppingItemObject(driver);
		for(int i=0; i<obj.getProducts().size(); i++) {
			obj.getProducts().get(3).click();
		}
		Thread.sleep(5000);
	}
}
