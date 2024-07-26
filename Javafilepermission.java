package javaprogram;

import java.io.File;

public class Javafilepermission {

	public static void main(String[] args) {
     String filePath = "C:\\Users\\Sumitrawat\\Downloads";
     File f = new File(filePath);
     if(f.exists()) {
    	 
    	 
    	 boolean canRead = f.canRead();
    	 System.out.println("read permission:" +canRead);
    	 boolean canWrite = f.canWrite();
    	 System.out.println("write permission:" +canWrite);
    	 boolean canExecute = f.canExecute();
    	 System.out.println("execute permission:" +canExecute);
    	 
    	 }
     else {
    	 System.out.println("file does not exists");
    	 
    	 
    	 
     }
     
     
	}

}
