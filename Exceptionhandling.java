package javaprogram;

public class Exceptionhandling {

	public static void main(String[] args) {
		//int i = 50;
	//	int j = 0;
	//	int data ;
		try
		{
			int data = 25;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			
		System.out.print(e);
		}
		finally 
		{
			
			System.out.println("the block is executed");
		}
		System.out.print("code is executed");
		

	}

}
