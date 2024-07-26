package javaprogram;
import java.lang.Thread;
import java.io.*;

public class Threadnegative {

	public static void main(String[] args) {
		try {
			
			for(int j = 0; j < 5; j++)
			{
				
				Thread.sleep(5000);
				System.out.println(j);
			}
		}
		catch(Exception expn)
		{
			System.out.print(expn);
		}
		

	}

}
