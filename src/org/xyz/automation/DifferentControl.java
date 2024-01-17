package org.xyz.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentControl 
{
	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver=new ChromeDriver();   //launch the chrome browser
		
		
		
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300)); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("fld_username")).sendKeys("selenium");
		driver.findElement(By.name("fld_username")).clear();
		
		driver.findElement(By.name("fld_username")).sendKeys("Java");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		driver.findElement(By.name("terms")).click();
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		
		//driver.findElement(By.className("displayPopup")).click();
		
		//WebElement s = driver.findElement(By.name("sex"));
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		//gen.selectByVisibleText("Female");
		
		//gen.deselectAll();
		//gen.deselectByIndex(2);
		//gen.deselectByVisibleText("Female");
		
		//WebElement s = driver.findElement(By.name("sex"));
		
	//	String a = "test";
		
		//Boolean off = driver.findElement(By.cssSelector("[value='office']")).isSelected();
		//System.out.println(off);
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("India");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Goa"));
		
		
		st.selectByVisibleText("Telangana");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		ct.selectByVisibleText("Hyderabad");
				
	}
}
