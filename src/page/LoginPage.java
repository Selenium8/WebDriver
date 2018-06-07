package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	
	@FindBy(id="txtUsername")
	WebElement userName;
	@FindBy(id="txtPassword")
	WebElement passWord;
	@FindBy(id="btnLogin")
	WebElement login;
	
	public void login(String uid,String pwd)
	{
		userName.sendKeys(uid);
		passWord.sendKeys(pwd);
		login.click();
		
	}
}
