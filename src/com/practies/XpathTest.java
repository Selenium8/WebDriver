package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("Http://yahoo.com");
	    driver.manage().window().maximize();
	    //gmail
	    driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("Selenium");
	    Thread.sleep(2000);
	    List<WebElement> list=driver.findElements
	    		(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_15')]/span"));

	    System.out.println(list.size());
	    
	    list.get(2).click();
	}

}
