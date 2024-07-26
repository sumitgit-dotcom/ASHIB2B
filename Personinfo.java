package javaprogram;

import java.util.Scanner;

public class Personinfo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] names = new String [5];
		int[]ages = new int[5];
		String[] phonenumber = new String[5];
		String[] address = new String[5];
		
		for(int i = 0; i<5; i++)
		{
			System.out.print(" enter person info " +(i+1) + ":");
			System.out.print("name: ");
			Scanner scanner = null;
			names [i] = scanner.nextLine();
			System.out.print("age :");
			ages [i] = scanner.nextInt();
			scanner.nextLine();
			System.out.print("phone :");
			phonenumber [i] = scanner.nextLine();
			System.out.print("address :");
			address[i] =scanner.nextLine();
			}
		System.out.println("person info");
		for (int i = 0;i < 5; i++)
		{
			System.out.println("person " + (i+1) + ":");
			System.out.println("name : " +names[i]);
			System.out.println("age : " +ages[i]);
			System.out.println("phone :" +phonenumber[i]);
			System.out.println("address :" + address[i] );
			
			
		}
		
		
		
		

	}



//String str = "this is the first line. \nthis is the second line	";

{
	//System.out.print(str);
	}}
