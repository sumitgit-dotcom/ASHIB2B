package javaprogram;

public class Permutestring {
	public static String swapstring(String a,int i,int j)
	{
		char b [] = a.toCharArray();
		char ch;
		ch= b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
		}
	

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		System.out.print("all permutations of string are :");
		generatePermutation(str, 0, len);
	}
	public static void generatePermutation(String str , int start , int end)
	{
		if(start == end-1)
			System.out.println(str);
		else
		{
			for(int i = start; i < end ;i++)
				
			{
				str = swapstring(str, start , i);
				generatePermutation(str, start+1,end);
				str = swapstring(str, start , i);
				
				
			}
		}
		
	}

}
