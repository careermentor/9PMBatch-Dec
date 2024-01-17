package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRunTime 
{
	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver=new ChromeDriver();   //launch the chrome browser
		driver.manage().window().maximize();
		
		String ExpURL = "https://www.facebook.com";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL);  //fail
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL); 
		
		System.out.println("this test case going to be fail");
		
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String expUsername = "Email address or phone number";
		
		String Actusername = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(Actusername);
		
		
		sa.assertEquals(Actusername, expUsername);
		
		String user = driver.findElement(By.name("login")).getText();
		System.out.println(user);
		
		sa.assertEquals(user, "Log in");
		
		Point actLoc = driver.findElement(By.name("login")).getLocation();
		System.out.println(actLoc);
		
		System.out.println(driver.getPageSource());
		
		//hard assertion
		//soft assertion
		
		
		sa.assertAll();
		
		
		
		
	}
	
}
