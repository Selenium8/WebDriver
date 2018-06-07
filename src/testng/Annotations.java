package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations
{
	@Test
	public void method()
	{
		System.out.println("Method Executed");
	}
	@Test
	public void method1()
	{
		System.out.println("Method1 Executed");
	}
	@BeforeTest
	public void before()
	{
		System.out.println("Before Test Executed");
	}
	@AfterTest
	public void after()
	{
		System.out.println("After Test Executed");
	}
}
