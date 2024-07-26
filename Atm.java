package javaprogram;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int balance = 100000,withdraw,deposits;
		Scanner sc=new Scanner(System.in);
		
		while(true)
			{
			System.out.println("ATM");
			System.out.println("ENTER 1 TO WITHDRAW MONEY");
			System.out.println("ENTER 2 TO DEPOSIT");
			System.out.println("ENTER 3 TO CHECK BALANCE");
			System.out.println("ENTER 4 FOR EXIT");
			System.out.println("CHOOSE ONE YOU WANT TO ENTER");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			System.out.println("enter the money you want to withdra");
			withdraw = sc.nextInt();
			
			if(balance>=withdraw) {
				balance = balance-withdraw;
				System.out.println("collect your money");
				
			}
			else
			{
				System.out.println("not enough balance");
			}
			System.out.print("");
			break;
			
			
			case 2:
				System.out.print("enter amount you want to deposit");
				deposits = sc.nextInt();
				balance = balance+deposits;
				System.out.print("money has deposited");
				System.out.print("");
				break;
				
			case 3:
				System.out.print(" balance : " + balance);
				System.out.print("");
				break;
				
			case 4:
				System.exit(0);
				
				
				
				
				
			}
			
			
			
			
			
			}
		
		
		

	}

}
