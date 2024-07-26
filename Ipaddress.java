package javaprogram;
import java.io.*;
import java.util.*;
import java.net.*;

public class Ipaddress {

	public static void main(String[] args) {
		String host =  "www.ashidiamonds.com";
		
		try {
			
			InetAddress[] iaddress= InetAddress.getAllByName(host);
			
			for(InetAddress ipaddresses : iaddress)
			{
				
				System.out.println(ipaddresses.toString());
			}
			
			
		}
		catch(UnknownHostException e) {
			
			System.out.println(e);
		}
		

	}

}
