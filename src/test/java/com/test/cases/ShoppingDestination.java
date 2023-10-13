package com.test.cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.object.ShoppingDestinationObject;
import com.resources.BaseClass;

public class ShoppingDestination extends BaseClass{
	
	@Test(priority = 1)
	public void shpProcess() throws IOException, InterruptedException {
		driverInitialize();
		driver.get("https://amazon.com");
		
		ShoppingDestinationObject obj = new ShoppingDestinationObject(driver);
		obj.allMenu().click();
		Thread.sleep(2000);
		obj.entcSection().click();
		Thread.sleep(1000);
		for(int i=0; i<obj.phnAccessories().size(); i++) {
			String phn = obj.phnAccessories().get(i).getText();
			if(phn.equalsIgnoreCase("Cell Phones & Accessories")) {
				String phn2 = obj.phnAccessories().get(i).getAttribute("herf");
				System.out.println(phn2);
				break;
			}
		}
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[6]/a"))).build().perform();
		Thread.sleep(2000);
	}
	
}
