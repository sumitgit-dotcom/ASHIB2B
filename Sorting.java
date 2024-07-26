package javaprogram;
import java.util.*;
class Main
{
	static void sel_sort(int numArray[])
	{
		int n = numArray.length;
		
		for(int i = 0; i < n-1 ; i++)
		{
			int min_idx = i;
			for(int j = i+1; j < n; j++)
			if(numArray[j] < numArray[min_idx ])
				min_idx = j;
			int temp = numArray[min_idx];
			numArray[min_idx] = numArray[i];
			numArray[i] = temp;
			}
	}
	public static void main(String args[])
	{
		int numArray[] = {7,5,2,20,42,15,23,34,10};
		System.out.print("original array : " +Arrays.toString(numArray));
		sel_sort(numArray);
		
		System.out.print("sorted array :" + Arrays.toString(numArray));
	}
	
}