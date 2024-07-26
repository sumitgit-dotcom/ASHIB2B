package javaprogram;

 class Customexception extends Exception
 {
	public Customexception(String str)
	{
		super(str);
		
	}}
 public class Test
 {
	static void validate(int age) throws Customexception
	{
		
		if(age < 18)
		{
			
			throw new Customexception("age is invalid");
		}
		else
		{
			
			System.out.print("you can vote");
					
	}
	 
 }
	public static void main(String[] args) {
		
		try
		{
			
			validate(13);
		}
		catch(Customexception ce)
		{
			
			System.out.print("exception");
			System.out.print("exception occured" +ce);
			
		}
		System.out.print("remaining code");
		

	}

}
