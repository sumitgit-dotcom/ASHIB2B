package javaprogram;

import java.util.*;
public class Perfectsquare{
	static boolean checksquare(double number)
	{
		double sqrt = Math.sqrt(number);
		return((sqrt -  Math.floor(sqrt))==0);
		
	}
	public static void main(String[]args) {
		System.out.print("enter number");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		
		if(checksquare(number))
		{
			System.out.print("number is perfect square");
			
		}
		else
		{
			System.out.print("number is not perfect square");
		}
	}
	
}