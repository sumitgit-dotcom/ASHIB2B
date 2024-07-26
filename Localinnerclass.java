package javaprogram;

 class Localinnerclass {
	 private int data = 30;
	 void display() {
		 
		 int value = 30;
		 class local
		 {
			 
			 void msg()
			 {
				 System.out.print(value);
			 }
			 local l = new local();
			 l.msg();
			 
		 }
	 }

	public static void main(String[] args) {
		Localinnerclass obj = new Localinnerclass();
		obj.display();
		
		
}}