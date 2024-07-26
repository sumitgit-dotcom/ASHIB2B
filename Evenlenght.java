package javaprogram;

public class Evenlenght {

	public static void print(String s) {
		for(String word : s.split(" "))
			if(word.length()%2 == 0)
				System.out.println(word);
		

	}
	public static void main(String args[])
	{
		
		String s = "Ultimately, creating a diamond ring is a professional and exact technique that calls for knowledge and close attention to every aspect";
		print(s);
	}
	

}
