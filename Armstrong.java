package javaprogram;
import java.io.*;
import java.math.*;

class gfg {
	
	static void Armstrong(int l , int h)
	
	{
		
		for(int j = l+1; j < h ;++j)
		{
			int y = j;
			int N=0;
			while(y!=0)
			{
				y/=10;
				++N;
			}
			int sum_power = 0;
			y = j;
			while(y!=0)
			{
				int d  = y % 10;
				sum_power += Math.pow(N, d);
				y/= 10;
				
			}
			
			if(sum_power == j)
				
		    System.out.print(j + "  ");
			
		
		}
	}
	public static void main(String args[])
	{
		
		int n1 = 50;
		int n2 = 500;
		Armstrong(n1,n2);
		System.out.println();
		
		
	}
}

