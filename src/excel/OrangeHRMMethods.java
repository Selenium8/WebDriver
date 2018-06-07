package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMMethods 
{
	String res;
	FirefoxDriver driver;
	public String appLaunch()
	{
	 driver=new FirefoxDriver();
	driver.get("Http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	if (driver.findElement(By.id("btnLogin")).isDisplayed())
	
	{
		res="Pass";
	}else
	{
		res="Fail";
	}
	return res;
		
	}
	
}
