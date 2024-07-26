package javaprogram;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("hello");
		al.add("hello");
		al.add("hello");
		System.out.println("returning element" + al.get(1));
		al.set(1, "dates");
		
		for(String hello:al)
		{
			
			System.out.println(hello);
		}
		
		
		

	}

}
