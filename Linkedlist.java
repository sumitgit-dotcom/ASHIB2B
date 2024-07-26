package javaprogram;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		String first = list.get(0);
		System.out.print(" the first element is " + first);
		
		for(String name : list)
		{
			System.out.print(name);
		}
		

	}

}
