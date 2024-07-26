package javaprogram;
import org.testng.annotations.Test;

public class Testng {
	@Test
	public void webstudentlogin()
	{
		System.out.println("student login from web");
	}
	@Test(enabled = false)
	public void mobilelogin()
	{
		
		System.out.println("student login from mobile");
	}
	@Test
	public void APIStudentlogin()
	{
		System.out.println("student login through API");
		
	}
	
		

	
		
		

	}


