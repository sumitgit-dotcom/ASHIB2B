package javaprogram;

public class FrequencyCharacter {

	public static void main(String[] args) {
		String str = "picture perfect";
		int freq[] = new int[str.length()];
		int i,j;
		
		char string[] =  str.toCharArray();
		for(i = 0 ; i < str.length(); i++)
		{
			
			freq[i] = 1;
			for(j = i+1; j<str.length(); j++)
			{
				if(string [i]==string[j])
				{
					freq[i]++;
					string [j] = '0';
				}
				
			}
		}
		System.out.print("Every two years, JAINA, in partnership with a group of local Sanghs, hosts a convention that brings together over 4,000 guests worldwide");
		for(i = 0; i < str.length(); i++)
		{
			if (string[i]!= ' ' && string[i]!= '0')
				System.out.println(string[i] + " - " +freq[i]);
				
				
			
		}
		

	}

}
