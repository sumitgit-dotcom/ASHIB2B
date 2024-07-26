package javaprogram;

import java.util.Scanner;

public class Positivenegative {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :");
		num = sc.nextInt();
		
		if(num>0)
		{
			System.out.print("the number is positive");
			
			
		}
		else if (num < 0)
		{
			System.out.print("the number is negative");
			
		}
		else
		{
			System.out.print("the number is zero");
		}
		sc.close();

	}
	

}
