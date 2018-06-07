package com.practies;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogion 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
	    driver.manage().window().maximize();
	   FluentWait mywait=new FluentWait(driver)
			   .withTimeout(20, TimeUnit.SECONDS)
			   .pollingEvery(5, TimeUnit.SECONDS)
			   .ignoring(NoSuchElementException.class);
	
	    driver.findElement(By.id("identifierId")).sendKeys("vasu.vypu");
	    driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	   mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"))); 
	   
	   driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("asdfsadfg");
	}

}
