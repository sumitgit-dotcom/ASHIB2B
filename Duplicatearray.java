package javaprogram;

public class Duplicatearray {

	public static void main(String[] args) {
		int[] ar1 = new int[] {1,2,3,4,5};
		int [] ar2 = new int[ar1.length];
		for(int i = 0; i < ar1.length; i++)
		{
			ar2[i] = ar1[i];
			System.out.println("elements of original array :");
			for (int i1 = 0; i1 < ar1.length; i1++)	
			{
				System.out.println(ar1[i1] + " ");
			}
			System.out.println();
			System.out.println("elements of new array : ");
			for(int i1  = 0; i1 < ar2.length; i1++)
				System.out.print(ar2[i1] + " ");
			

	}}}


