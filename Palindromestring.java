package javaprogram;
import java.util.*;

public class Palindromestring {

	public static void main(String[] args) {
		String str = "";
        boolean flag = true;    
		str = str.toUpperCase();
		
		for(int i = 0; i < str.length()/2; i++)
		{
			
			if(str.charAt(i)!= str.charAt(str.length()-i-1))
			{
				
				flag = false;
				break;
			}}
		
		if(flag)
		{
			System.out.print("string is palindrome");
			}
			
			else 
				
				System.out.print("string is  not palindrome");
		
		
}}
