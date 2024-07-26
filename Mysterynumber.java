package javaprogram;

import java.util.Random;
import java.util.Scanner;

public class Mysterynumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int minnumber = 1;
		int maxnumber = 100;
		int mystnumber = rn.nextInt(maxnumber -minnumber +1 ) + minnumber;
		int guess = 0;
		int numguess = 0;
		
		System.out.println(" think of number between " + minnumber + " and " + maxnumber +" guess the number");
		
		while(guess !=mystnumber)
		{
			System.out.print("enter guess number");
			guess = sc.nextInt();
			numguess++;
			
			if(guess < mystnumber)
			{
				
				System.out.print("number is too low");
			}
			else if (guess>mystnumber)
			{
				System.out.print("number is too high");
			}
			
		}
		System.out.print("the number is correct");
		sc.close();
		
	}
	

}
