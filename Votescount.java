package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Votescount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> votes = new HashMap<>();
		System.out.print(" enter the count of voters: ");
		int numvoters = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numvoters ; i++)
		{
			System.out.print(" candidate name " +(i+1) +" : ");
			String candidate = scanner.nextLine();
			votes.put(candidate, 0);
			
		}
		for(int i = 0; i < numvoters; i++)
			
		{
			System.out.print(" enter the candidate name : " );
			String candidate = scanner.nextLine();
			
			if(votes.containsKey(candidate))
			{
				int votecount = votes.get(candidate);
				votes.put(candidate, votecount +1);
				
			}
			else
			{
				System.out.println("invalid candidate");
				i--;
			}
		}
		System.out.print("\\nVote count results:");
		for(String candidate : votes.keySet())
{
	int votecount = votes.get(candidate);
	System.out.print(candidate + " :" + votecount);

}
		scanner.close();
		

	}

}
