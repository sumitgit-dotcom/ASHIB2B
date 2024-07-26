	package javaprogram;
import java.lang.Thread;
import java.io.*;


 public class Threadsleep  {
	//public void run()
	 {
		 
		// for(int i = 0; i < 5;i++)
			// try {Thread.sleep(500);
			          }
		 //catch(InterruptedException e)
		 {
		//	 System.out.print(e);
		// System.out.print(i);
			 
	 }		 
			 
	 

	public static void main(String[] args) {
		
	//	Threadsleep t1 = new Threadsleep();
		//Threadsleep t2 = new Threadsleep();
		
	//	t1.start();
	//	t2.start();
		try {
			
			for(int j = 0;j < 6; j++)
			{
				Thread.sleep(500);
				System.out.println(j);
			}
		}
		catch(Exception expn)
		{
			System.out.println(expn);
		}
		
		
	
	}

}
