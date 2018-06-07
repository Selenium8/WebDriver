package testng;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmpTest extends OHRM
{
@Test
public void empAdd() throws Exception
{
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
