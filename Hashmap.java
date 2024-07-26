package javaprogram;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("a", 25);
		map.put("b", 30);
		map.put("c", 35);
		
		int age = map.get("b");
		System.out.println(" age of b is " + age);
		
		boolean exists = map.containsKey("d");
		System.out.print(" d exists " + exists) ;
		
		for(String name : map.keySet())
		{
			int value = map.get(name);
			System.out.println( name +	"is" + value +"year old");
			
		}
		map.remove("c");
		System.out.print("c is removed");
		
		map.clear();
		System.out.print("map is clear");
		
		
		
		

	}

}
