package javaprogram;
import java.io.*;

class Threadnaming extends Thread {
	Threadnaming(String threadName)
	{
		
		super(threadName);
	}
	public void run()
	{
		System.out.println("thread is executing");
		
	}
	public class ThreadNamingex
	{
		
		
		
	

	public void main(String[] argvs) {
		Threadnaming th1 = new Threadnaming("java one");
		Threadnaming th2 = new Threadnaming("java two");
		
		System.out.println("thread 1" +th1.getName());
		System.out.println("thread 1" +th2.getName());
		
		th1.start();
		th2.start();
		

	}

}
}