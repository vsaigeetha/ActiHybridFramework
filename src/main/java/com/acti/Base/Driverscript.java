package com.acti.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Driverscript {
	public static WebDriver driver;
	public  static Properties prop;
	public static  FileInputStream fis;
	public Driverscript()
	{
		try
		{
			 prop = new Properties();
			 fis = new FileInputStream("./acti_config/Config.properties");
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("file not found"+e.getMessage());
		}
	}
  
	public static void Initbrowser()
	{
		String browser = prop.getProperty("Browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Acti-Browsers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Acti-Browsers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","./Acti-Browsers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	public static void launchappli()
	{
		String url = prop.getProperty("QAURL");
		driver.get(url);
	}
	
}

