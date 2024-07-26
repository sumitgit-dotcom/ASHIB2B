package javaprogram;
interface drawable
{
void draw();
}

 class Interface implements drawable  {

	public void draw() {
	System.out.println("draw a  rectangle");
		
	}}
 class Interfaceone implements drawable
 {
	 public void draw() {
		 System.out.print("draw a circle");
		 }}
 class Testinterface
 {
	 
	 public static void main(String args[])
	 {
		 drawable d = new Interface();
		 d.draw();
		 
	 }
 }
