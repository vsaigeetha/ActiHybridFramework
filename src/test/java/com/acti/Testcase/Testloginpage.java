package com.acti.Testcase;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.Driverscript;
import com.acti.Pages.Loginpage;

public class Testloginpage extends Driverscript {
	
	 Loginpage loginpage;
	public Testloginpage ()
	{
		super();
	}
 @BeforeMethod
 public void setup()
 {
	 Initbrowser();
	 
	  loginpage = new Loginpage();
	 
 }
/* @Test
 public void testverifytitle()
 {
	 launchappli();
	 String expected = "actiTIME - Login";
	String actual = loginpage.verifyloginpagetitle();
//	System.out.println(actual);
	Assert.assertEquals(expected, actual);
 }
 
 public void testverifylogo()
 {
	 launchappli();
	boolean flag = loginpage.verifyactilogo();
	Assert.assertTrue(flag);
	 
 }
 */
 @Test
 public void testvalidatelogin() throws InterruptedException
 {
	 launchappli();
	 loginpage.validatelogin(prop.getProperty("username"),prop.getProperty("password"));
	 
 Thread.sleep(3000);
     loginpage.logout();
 }
 
 
 
 
 @AfterMethod
 public void teardown()
 {
	 driver.quit();
 }
}
