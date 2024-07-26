package javaprogram;
import java.io.File;
//import java.io.InterruptedIOException;

import zmq.ZError.IOException;

public class Filecreate {

	public static void main(String[] args) throws java.io.IOException {
		File f = new File("C:\\Users\\Sumitrawat\\eclipse-workspace.txt");
		boolean result;
		try
		{
			result = f.createNewFile();
			if(result)
			{
				System.out.println("file created :"  + f.getCanonicalPath());
				
			}
			else
			{
				
				System.out.print(" file already existed: " +f.getCanonicalPath());
			}}
			
			catch(IOException a)
			{
				
				a.printStackTrace();
			}
		
		
		

	
			
		}}
