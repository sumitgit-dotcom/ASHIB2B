package javaprogram;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Testcases {
	@Test
	public void testofpass()
	{
		
		Assert.assertTrue(true);
	}
	@Test
	public void testoffail()
	{
		
		Assert.assertFalse(false);
	}

}
