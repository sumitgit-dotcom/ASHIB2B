package javaprogram;


public class Swapstring {
	public static String swapstring(int i, int j, String a)
	{
		char b[] = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
		
	}

	public static void main(String[] args) {
		String str = "XYZ";
		int len = str.length();
		System.out.println("all characters of string:");
		generatepermutation(str,0,len);
	}
		

	
	public static void generatepermutation(String str, int start,int end)
	{
		if(start == end-1)
		{
			
			System.out.println(str);}
			else
			{
				for(int i = start; i < end; i++)
				{
					str = swapstring(i,start , str);
					generatepermutation(str,start+1,i);
					str = swapstring(i,start,str);
					
					
				}
			}
		
	
		
}
	}
