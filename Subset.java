package javaprogram;

public class Subset {

	public static void main(String[] args) {
		String str = "RUN";
		int len = str.length();
		int temp = 0;
		String arr[] = new String[len*(len+1)/2];
		
		for(int i =0; i<len; i++)
		{
			for(int j=i;j<len; j++)
			{
				arr[temp] = str.substring(i,j+1);
				temp++;
			}
		}
		System.out.println("all subsets:");
		for(int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
