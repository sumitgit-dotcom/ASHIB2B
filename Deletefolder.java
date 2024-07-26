package javaprogram;

import java.io.File;

public class Deletefolder {

	public static void main(String[] args) {
		File myObj = new File("C:\\Users\\Sumitrawat");
		if(myObj.delete())
		{
			
			System.out.print("deleted the folder :" +myObj.getName());
		}
		else
			
		{
			
			System.out.print("file not deleted");
		}
		
		

	}

}
