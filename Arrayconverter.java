package javaprogram;

public class Arrayconverter {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int r = 3;
		int c = 3;
		int [][] multiarr = new int[r][c];
		int index = 0;
		for(int i = 0 ; i < r; i++)
			
		{
			
			for(int j = 0; j< c; j++)
			{
				
				multiarr[i][j] = arr[index];
				index++;
				
			}
		}
		for(int i = 0; i < r; i++)
		{
			
			for(int j = 0; j < c;j++)
			{
				
				System.out.print(multiarr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
