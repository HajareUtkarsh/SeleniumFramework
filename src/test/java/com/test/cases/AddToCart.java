package com.test.cases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.object.AddToCartObject;
import com.resources.BaseClass;

public class AddToCart extends BaseClass{
	
	@Test(priority = 4)
	public void toProceedShopping() throws Throwable {
		AddToCartObject obj = new AddToCartObject(driver);
		
		Actions a = new Actions(driver);
		try {
		a.click(obj.add()).build().perform();
		a.click(obj.next()).build().perform();
		} catch(Throwable e) {
			System.out.println("This item is not available for delivery to your address!");
		}
	}
}
