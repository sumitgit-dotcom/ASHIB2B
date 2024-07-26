package javaprogram;
import java.util.*;


public class Javacollection {

	public static void main(String[] args) {
PriorityQueue <String> queue = new PriorityQueue<String>();
queue.add("abc");
queue.add("xyz");
queue.add("qrs");
queue.add("klm");
queue.add("efg");
queue.add("tuv");
System.out.println("head" + queue.element());
System.out.println("head" + queue.peek());
System.out.println("iterrating the queue");
Iterator itr = queue.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	
	}
queue.remove();
queue.poll();
System.out.println("after removing two elements");
Iterator <String> itr2 = queue.iterator();
while(itr2.hasNext())
{
	System.out.println(itr2.next());
}

	}

}
