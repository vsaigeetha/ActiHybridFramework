package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.Driverscript;
import com.acti.Helper.Utils;

 /*Tester:Geetha
  * date created:4/22/2019
  * date modified:
  * code reviewer:Srilatha
  */
public class Loginpage extends Driverscript {
	
//	*********************************page elements*****************************************
	@FindBy(id="logoContainer") WebElement actitimelogo;
	@FindBy(name="username") WebElement usernameTB;
	@FindBy(name="pwd") WebElement pwdTB;
	@FindBy(id="loginButton") WebElement loginBTN;
	@FindBy(id="logoutLink") WebElement logoutBTN;
	
//	********************page initialisation**************
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyloginpagetitle()
	{
		return driver.getTitle();
	}
	public boolean verifyactilogo()
	{
		return actitimelogo.isDisplayed();
	}
	public void validatelogin(String username,String password)
	{
		Utils.highlightElement(usernameTB);
		usernameTB.sendKeys(username);
		Utils.highlightElement(pwdTB);
		pwdTB.sendKeys(password);
		Utils.highlightElement(loginBTN);
		loginBTN.click();
	}
	
   public void logout()
   {
	   Utils.highlightElement(logoutBTN);
	   logoutBTN.click();
   }
}
