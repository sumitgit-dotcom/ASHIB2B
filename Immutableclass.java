package javaprogram;

public final class Immutableclass {
	String pancardNumber = "";
	public Immutableclass(String pancardNumber ) {
		
		this.pancardNumber = pancardNumber;
		
		
	}
	public String getpancardNumber() {
		return pancardNumber;
		}
	}
public class Employee{
	
	public static void main(String args[]){
		Immutableclass i = new Immutableclass("ABCDE");
		String s = i.getpancardNumber();
		System.out.println(" pancard number is " +s);
		
		
		
	}
}
