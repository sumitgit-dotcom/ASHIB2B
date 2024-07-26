package javaprogram;
import java.util.Scanner;

public class Electricitybillswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("electricity bill consumed");
		int units = sc.nextInt();
		double billamount = billcalculate(units);
		System.out.print("bill is" +billamount);
		sc.close();
		
	}

	private static double billcalculate(int units) {
		double billamount;
		
		switch(units)
		{
		case 0:
	    billamount = units*2.5;
	    break;
	    
		case 1:
		billamount = units*3.5;
		break;
		
		case 2:
		billamount = units*4.5;
		break;
		
		case 3: 
	    billamount = units*5.5;
		break;
		
		case 4:
		billamount = units*6.5;
		break;
		
		
			
			
			
			
		
		
		}
		return units;
		
		
		
	}

}
