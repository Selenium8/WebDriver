package testng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class ValidationTest
{
	@Test
public void verify()
{
	String data="vasu Selenium";
	String data1="vasu";
	Assert.assertEquals(data,data1);
}
}
