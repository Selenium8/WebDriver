package com.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableTesting
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.linkText("PIM")).click();
	    driver.findElement(By.linkText("Employee List")).click();
	    //rows count
List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
System.out.println(rows.size());

for (int i = 0; i < rows.size(); i++)
{
//column
	List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
	//for (int j = 0; j < col.size(); j++) 
	//{
		System.out.println(col.get(2).getText());
	//}
}
	
	}

}
