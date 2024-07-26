package javaprogram;

public class Largestarray {
	public static int getlargest(int a[], int total)
	{
		int temp;
		for(int i = 0; i < total; i++)
		{
			for(int j = i; j < total; j++)
			{
				if(a[i] > a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];
	}

	public static void main(String[] args) {
		int a[] = {1,2,5,6,3,2};
		int b[] = {44,66,99,77,33,22,55};
		System.out.print(" largest " +getlargest(a,6));
		System.out.print(" largest " +getlargest(b,9));
		
		

	}

}
