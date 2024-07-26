package javaprogram;

 class Superkeyword {
	 String color = "white";
	 
}
 
 class Abc extends Superkeyword
 {
	String color = "black" ;
	void printColor()
	{
		
		System.out.println( " print " +color);
		System.out.println(super.color);	
		
		}}
 class Load
 {
	 
	 public static void main (String args[])
	 
	 {
		 
		Abc x = new Abc();
		x.printColor();
	 }
 }
