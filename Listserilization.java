package javaprogram;
import java.util.*;
import java.io.*;

public class Listserilization {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("rohit");
		al.add("manav");
		al.add("gautam");
		
		try
		{
			
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList)ois.readObject();
			System.out.print(list);
			
		}
		catch(Exception e)
		{
			System.out.print(e);
			
		}


		
				
		

	}

}
