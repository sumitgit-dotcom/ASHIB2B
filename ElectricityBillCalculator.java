package javaprogram;
import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        int[] units = new int[5];
        double[] bills = new double[5];
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the units consumed by house " + (i+1) + ": ");
            units[i] = scanner.nextInt();
            
            if (units[i] <= 100) {
                bills[i] = units[i] * 1.20;
            } else if (units[i] <= 200) {
                bills[i] = 100 * 1.20 + (units[i] - 100) * 2.00;
            } else if (units[i] <= 500) {
                bills[i] = 100 * 1.20 + 100 * 2.00 + (units[i] - 200) * 3.00;
            } else {
                bills[i] = 100 * 1.20 + 100 * 2.00 + 300 * 3.00 + (units[i] - 500) * 5.00;
            }
            
            System.out.println(" Electricity bill for house  " + (i+1) + " : Rs. "  + bills[i]);
        }
        
        scanner.close();
    }
}
