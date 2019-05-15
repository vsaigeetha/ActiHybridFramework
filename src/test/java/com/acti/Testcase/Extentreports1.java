package com.acti.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreports1 {
    public  static  WebDriver driver;
	public static void main(String[] args) {
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extent .html");
	 ExtentReports extent = new ExtentReports();
	   extent.attachReporter(htmlreporter);
	   ExtentTest test1 = extent.createTest("Google search test1", "This is a test to validate google search functionality ");
	   
		System.setProperty("webdriver.chrome.driver", "./Acti-Browsers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 test1.log(Status.INFO,"starting test case" );
		 driver.get("https://www.google.com/");
		 test1.pass("Navigated to google.com");
		 driver.findElement(By.name("q")).sendKeys("Automation");
		 test1.pass("Entered text in search box");
		 driver.findElement(By.name("btnK")).click();
		 test1.pass("pressed keyboard enter key");
		 driver.close();
		 test1.pass("closed the browser");
		 test1.info("testcase is done");
		 
		 
		 
		 
		 ExtentTest test2 = extent.createTest("Google search test2", "This is a test to validate google search functionality ");
			System.setProperty("webdriver.chrome.driver", "./Acti-Browsers/chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 test2.log(Status.INFO,"starting test case" );
			 driver.get("https://www.google.com/");
			 test2.pass("Navigated to google.com");
			 driver.findElement(By.name("q")).sendKeys("Automation");
			 test2.pass("Entered text in search box");
			 driver.findElement(By.name("btnK")).click();
			 test2.fail("pressed keyboard enter key");
			 driver.close();
			 test2.pass("closed the browser");
			 test2.info("testcase is done");
		 extent.flush();

		
		
		
		
		
		
		

	}

}

