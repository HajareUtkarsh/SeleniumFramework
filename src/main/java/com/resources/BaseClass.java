package com.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {
	public static WebDriver driver;
	
	public void driverInitialize() throws IOException {
		FileInputStream fis = new FileInputStream("E:\\Stability\\Workspace\\AmazonSeleniumFramework\\src\\main\\java\\com\\resources\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome incognito")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			DesiredCapabilities des = new DesiredCapabilities();
			des.setCapability(ChromeOptions.CAPABILITY, option);
			option.merge(des);
			driver = new ChromeDriver(option);
		}
		else 
			System.out.println("please check again browser name!");
		
	}
}
