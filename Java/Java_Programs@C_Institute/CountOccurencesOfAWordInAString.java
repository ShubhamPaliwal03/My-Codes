import java.util.Scanner;

class CountOccurencesOfAWordInAString
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a string : ");

		String str;

		String s;

		str = s = kb.nextLine();

		System.out.print("\nEnter a word : ");

		String word;

		String w;

		word = w = kb.nextLine();

		kb.close();

		int index = 0;

		int count = 0;

		str = str.toLowerCase();

		word = word.toLowerCase();

		while(index < str.length())
		{
			if(str.startsWith(word, index))
			{
				count += 1;

				index += word.length();
			}
			else
			{
				index++;
			}
		}

		System.out.print("\n'"+w+"' occurs "+count+" times in the string '"+s+"'");
	}
}