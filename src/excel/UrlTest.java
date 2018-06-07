package excel;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UrlTest {

	public void urlTest1(String Url)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(Url);
		driver.manage().window().maximize();
	}
}
