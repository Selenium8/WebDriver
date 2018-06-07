package com.practies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FileUploadTest 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.linkText("PIM")).click();
	    driver.findElement(By.linkText("Add Employee")).click();
	    driver.findElement(By.id("firstName")).sendKeys("Vasudeva12354");
	    driver.findElement(By.id("lastName")).sendKeys("Qedge12334");
	   // driver.findElement(By.id("photofile")).sendKeys("D:\\sai.png");
	    driver.findElement(By.id("photofile")).click();
	    
	    Runtime.getRuntime().exec("C:\\Users\\qedge\\Desktop\\fp.exe");
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.id("btnSave")).click();
	    
	    
	    
	    
	}

}
