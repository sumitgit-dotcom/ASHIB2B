package javaprogram;

public class Testarray {
	public static void main(String args[]) {
	int arr[] = {33,3,5,7};
	System.out.println("printing the original array");
	for(int i : arr)
		System.out.println(i);
	System.out.println("printing the clone of the array");
	int carr[] = arr.clone();
	for(int i : carr) {
		
		
		System.out.println(i);
		System.out.println("are both arrays equal");
		System.out.println(arr = carr);
		
	}
		

	
	
	
	
}}
    