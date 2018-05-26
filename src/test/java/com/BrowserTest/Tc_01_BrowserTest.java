package com.BrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc_01_BrowserTest {
	
	
	
	
	@Test
	public static void launchBrowser()
	{
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		
		
	}
	

}
