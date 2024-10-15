import java.util.Scanner;

class CountAndDisplayTheNoOfRepeatedAndUniqueCharactersOfAString
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String s = kb.nextLine().toLowerCase();

		int[] frequencies = new int[26];

		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);

			if(ch >= 97 && ch <= 122)
			{
				frequencies[ch-'a']++;
			}
		}

		int repeated_count = 0;
		int total_repeated_count = 0;
		int unique_count = 0;

		for(int freq : frequencies)
		{
			if(freq == 1)
			{
				unique_count++;
			}
			else if(freq > 1)
			{
				repeated_count++;

				total_repeated_count += freq;
			}
		}

		System.out.println("\nThe String '"+s+"' has :");
		System.out.println("\n"+unique_count+" unique characters,");
		System.out.println(repeated_count+" repeated characters,");
		System.out.println("and "+total_repeated_count+" total repeated characters.");

		System.out.println("\nThe Unique characters of the string '"+s+"' are as follows :\n");

		for(int i = 0; i < frequencies.length; i++)
		{
			if(frequencies[i] > 1)
			{
				System.out.println((char)(i+'a')+" : "+frequencies[i]);
			}
		}

		System.out.println("\nThe Repeated characters of the string '"+s+"' are as follows :\n");

		for(int i = 0; i < frequencies.length; i++)
		{
			if(frequencies[i] == 1)
			{
				System.out.println((char)(i+'a')+" : "+frequencies[i]);
			}
		}

		System.out.println("\nThe Frequencies of all the characters present in the string '"+s+"' are as follows :\n");

		for(int i = 0; i < frequencies.length; i++)
		{
			if(frequencies[i] > 0)
			{
				System.out.println((char)(i+'a')+" : "+frequencies[i]);
			}
		}
	}
}