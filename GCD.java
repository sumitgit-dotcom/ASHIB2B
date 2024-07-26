package javaprogram;

public class GCD {

	public static void main(String[] args) {
		int n1=105, n2=95;
		while(n1!=n2)
		{
			if(n1>n2)
				n1=n1-n2;
			else
				n2=n2-n1;
			}
		System.out.print(" gcd of n1 and n2 is : " +n2);
		
		

	}

}
