package javaprogram;

public class Citypopulation {

	public static void main(String[] args) {
		String cities[] = {"delhi","mumbai","chennai","kolkata","pune"};
		int[] population = {1254525, 1547895, 2541786, 1452647, 1354754};
		double landarea[] = {452.4 ,741.2,418.3,987,4,674.4};
		
		System.out.println("City\\t\\tPopulation\\tLand Area (sq mi)");
		System.out.println("*********************************");
		for(int i =0; i < cities.length; i++)
		{
			
			System.out.printf("%-15s %,12d %,15.1f\\n\", cities[i], population[i], landareas[i]");
		}
		

		
		
	

	}

}
