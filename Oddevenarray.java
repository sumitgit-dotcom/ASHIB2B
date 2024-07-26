package javaprogram;

public class Oddevenarray {

	public static void main(String[] args) {
		int a[]= {15,17,19,26,32,37};
		System.out.println("odd elements");
		for(int i= 0;i<a.length;i++ )
		{
			if(a[i]%2!= 0)
			{ 
				System.out.println(a[i]);
			}
			
		}
		System.out.println("even elements");
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
