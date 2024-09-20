import java.util.*;

class UseHashTableToCountFrequencyOfWordsInAString
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a String : ");

		String s = kb.nextLine();

		String[] words = s.split(" ");

		Hashtable<String, Integer> wordFrequencyTable = new Hashtable<>();

		for(String word : words)
		{
			wordFrequencyTable.put(word, wordFrequencyTable.getOrDefault(word, 0) + 1);
		}

		System.out.println("\nThe Frequency Of Words in the String '"+s+"' is as follows :\n");

		for(String word : wordFrequencyTable.keySet())
		{
			System.out.println(word+" : "+wordFrequencyTable.get(word));
		}
	}
}