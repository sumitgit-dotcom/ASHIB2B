package javaprogram;

public class Rightrotate {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
		int n = 3;
		System.out.print(" original array :");
		for(int i =0;i < arr.length;i++);
		{
			System.out.print(arr[n] + " ");
			}
		
		for(int i = 0;i<n; i++);
		{
			int j,last;
			last = arr[arr.length-1];
			for(j = arr.length-1;j > 0;j--);
			{
				
				arr[j] = arr[j-1];
				arr[0] = last;
				
			}
			System.out.println();
			System.out.println("array after right rotation");
			for(int i =0;i < arr.length; i++);
			
			{
				System.out.print(arr[n] + " ");
				
			}
			
		}
			

	}

}
