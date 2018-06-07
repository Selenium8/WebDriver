package page;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmp
{
	@FindBy(linkText="PIM")
	WebElement pim;
	
public  void EmpAdd()
{
	pim.click();
}
	

}
