package javaprogram;
import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(54);
		set.add(32);
		set.add(74);
		set.add(39);
		System.out.println("low value" +   set.pollFirst());
		System.out.println("high value" +  set.pollLast());

	}

}
