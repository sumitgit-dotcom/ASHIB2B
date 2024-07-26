package javaprogram;
import java.util.*;

public class Traversehashmap {

	public static void main(String[] args) {
		
	HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
	hm.put("right for left", 24);
	hm.put("integration constant", 45);
	hm.put("decent value", 68);
	
	System.out.println("created hashmap is "+ hm);
	System.out.println("hashmap created as a bonus for adding");
	
	for(Map.Entry<String, Integer> mapElement : hm.entrySet())
	{
		
		
		String key = mapElement.getKey();
		int value = (mapElement.getValue()+10);
		System.out.println(key + " : " + value);
	}
		

	}

}
