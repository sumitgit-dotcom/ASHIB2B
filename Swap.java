package javaprogram;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		a = sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		System.out.println("before swapping");
		System.out.println("a = " +a +", b = " +b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("after swapping");
		System.out.println("a = " +a +", b = " +b);
		
		
		
		

	}

}
