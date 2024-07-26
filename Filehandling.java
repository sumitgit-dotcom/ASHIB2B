package javaprogram;
import java.io.File;
import java.io.IOException;
//import java.io.InterruptedIOException;

public class Filehandling {

	public static void main(String[] args) {
		
		try
		{
			File myObj = new File("filename.txt");
			if(myObj.createNewFile())
			{
				
				System.out.println(" file created : " +myObj.getName());
			}
			else
			{
				
				System.out.println("file already exists");
				
			}
			
		}
		catch(IOException a) {
			
			System.out.println("error occured");
			a.printStackTrace();
		}
		
		

	}

}
