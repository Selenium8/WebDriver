package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertTest
{
@Test
public void soft()
{
	SoftAssert soft=new SoftAssert();
	System.out.println("Staring soft assert");
	soft.assertEquals(12, 13);
	System.out.println("end soft assert");
	soft.assertAll();
}
@Test
public void hard1()
{
	System.out.println("Staring hard1 assert");
	Assert.assertEquals(13, 13);
	System.out.println("end hard1 assert");
}
}
