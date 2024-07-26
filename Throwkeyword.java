package javaprogram;

public class Throwkeyword {
	public static void validate(int age)
	{
		
		if(age < 18)
		{
			
			throw new ArithmeticException("person cannot vote"); 
			
		}
		else
		{
			
			System.out.print("person can vote");
		}
	}

	public static void main(String[] args) {
		validate(13);
		System.out.print("rest of the code");
		

	}

}
