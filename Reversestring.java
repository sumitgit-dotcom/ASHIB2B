package javaprogram;
import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		String str;
		System.out.print("enter the string");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		sc.close();
		String reversed = reverseString(str);
		System.out.print("the reversed string is :" +reversed);
		}
	public static String reverseString(String s)
	
	{
		if(s.isEmpty())
			return s;
		return reverseString(s.substring(1))+s.charAt(0);
		
	}
	

}
