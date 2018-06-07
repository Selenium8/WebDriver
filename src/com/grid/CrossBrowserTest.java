package com.grid;

import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest
{
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void dropdownTest(String b) 
	{
		
		if(b.equals("firefox"))
		{
			System.out.println(b);
			driver=new FirefoxDriver();
			driver.get("http://Gmail.com");
			driver.manage().window().maximize();
				}
		else if(b.equals("chrome"))
		{
			System.out.println(b);
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://Gmail.com");
			driver.manage().window().maximize();
		}
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}
}
