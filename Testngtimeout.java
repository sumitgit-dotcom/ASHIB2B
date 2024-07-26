package javaprogram;
import org.testng.annotations.Test;


public class Testngtimeout {
	@Test(timeOut = 300)
	public void testcase1() throws InterruptedException
	{
	Thread.sleep(500);	
	System.out.println("test case 1");
	}
	@Test()
	public void testcase2()
	{
		
		System.out.println("test case 2");
	}
	@Test()
	public void testcase3()
	{
		System.out.println("test case 3");
		
		
	}
	}


