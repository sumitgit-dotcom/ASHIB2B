package javaprogram;

public class Nestedtryblock {

	public static void main(String[] args) {
		try
		{
			try
			{
				
				System.out.println("devide by zero");
				int b = 50/0;
			}
			catch(ArithmeticException e)
			
			{
				System.out.print(e);
			}
			try {
				int a[] = 	new int [5];
				a [5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.print(e);
				
			}
			System.out.println("other statement");
			}
		
		catch(Exception e)
		{
			
			System.out.println("handle the exception");
		}
		System.out.println("normal flow");
		
		
		
		}
	

	}


