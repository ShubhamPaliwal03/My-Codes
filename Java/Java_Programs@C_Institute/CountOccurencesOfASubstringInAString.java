import java.util.Scanner;

class CountOccurencesOfASubstringInAString
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String str = kb.nextLine();

		System.out.print("\nEnter the substring to count the occurences of : ");

		String substr = kb.nextLine();

		int count = 0;

		for(int i = 0; i < str.length(); i++)
		{
			if(str.startsWith(substr, i))
			{
				count++;
			}
		}

		System.out.print("\nThe substring '"+substr+"' occurs "+count+" times in the string '"+str+"'");
	}
}