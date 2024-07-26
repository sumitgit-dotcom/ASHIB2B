package javaprogram;

public class Javaarray {
	public static int getsmallest(int[] a, int total)
	{
		for(int i = 0;i < total; i++)
		{
			
			for(int j = i+1; j< total ; j++)
			{
				
				if(a[i] > a[j])
				{
					total = a[i];
					a[i] = a[j];
					a[j] = total;
					
				}
			}
			
			
		}
		
		
		return total;
		
		
		
	}

	public static void main(String[] args) {
		
		int  a[] = {1,2,8,9,4,7};
		int b[] = {14,27,62,23,74,91};
		System.out.print("get smallest number"  +getsmallest(a,6));
		System.out.print("get smallest number"  +getsmallest(b,7));
		
		

	}

}
