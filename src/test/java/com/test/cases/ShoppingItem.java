package com.test.cases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import com.object.ShoppingItemObject;
import com.resources.BaseClass;

public class ShoppingItem extends BaseClass{
	
	@Test(priority = 2)
	public void writeItemName() throws IOException {
		ShoppingItemObject obj = new ShoppingItemObject(driver);
		try {
			File f = new File("E:\\Stability\\Workspace\\AmazonSeleniumFramework\\src\\main\\BestSeller.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(); 
			XSSFSheet sh= wb.createSheet("Test2");
			XSSFRow headerRow = sh.createRow(0);
			headerRow.createCell(0).setCellValue("Product Name");
			headerRow.createCell(1).setCellValue("Price");
			headerRow.createCell(2).setCellValue("Best Seller or Not");
			
			for(int i=0; i<obj.getProducts().size(); i++) {
				String phn = obj.getProducts().get(i).getText();
				System.out.print(phn+"/t");
				String phn1 = obj.getPrice().get(i).getText();
				System.out.println(phn1);
				sh.createRow(i+1);
				sh.getRow(i+1).createCell(0).setCellValue(phn);
				sh.getRow(i+1).createCell(1).setCellValue(phn1);
				} 
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			}catch(Throwable e) {
				e.printStackTrace();
			}
		
	}
}
