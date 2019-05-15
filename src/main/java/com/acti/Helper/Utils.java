package com.acti.Helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.acti.Base.Driverscript;

public class Utils extends Driverscript {
	
	
	
	public static void highlightElement(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')",ele);
	}

}
