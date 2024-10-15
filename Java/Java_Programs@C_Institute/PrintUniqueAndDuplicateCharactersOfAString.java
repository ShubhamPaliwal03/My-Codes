import java.util.Scanner;

class PrintUniqueAndDuplicateCharactersOfAString
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the String : ");

		String str = kb.nextLine();

		// make a boolean array named seive, to store true and false, which denotes that the value is dupicate and unique resp.

		// boolean[] seive = new boolean[str.length()];

		// for(int i=0;i<str.length();i++)
		// {
		// 	if(seive[i]==true)
		// 	{
		// 		continue;
		// 	}

		// 	for(int j=i+1;j<str.length();j++)
		// 	{

		// 		if(str.charAt(i)==str.charAt(j))
		// 		{
		// 			seive[i] = seive[j] = true;
		// 		}
		// 	}
		// }

		// System.out.print("\nThe Unique elements of the array are : ");

		// for(int i=0;i<seive.length;i++)
		// {
		// 	if(seive[i]==false)
		// 	{
		// 		System.out.print(str.charAt(i)+" ");
		// 	}
		// }

		// System.out.print("\n\nThe Duplicate elements of the array are : ");

		// for(int i=0;i<seive.length;i++)
		// {
		// 	if(seive[i]==true)
		// 	{
		// 		System.out.print(str.charAt(i)+" ");
		// 	}
		// }

		char[] s = str.toCharArray();

		char[] duplicates = new char[str.length()];

		char[] uniques = new char[str.length()];

		int d = 0, u = 0;

		for(int i=0;i<s.length;i++)
		{
			int count = 1;

			if(s[i]=='0') // skipping the current iteration if the element is a duplicate
			{
				continue;
			}

			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					s[j] = '0'; // marking the element as a duplicate
					count++;
				}
			}

			if(count>1) // if the element is a duplicate
			{
				duplicates[d] = s[i];
				d++;
			}
			else // if the element is unique
			{
				uniques[u] = s[i];
				u++;
			}
		}

		System.out.print("\nThe Unique elements present in the string '"+str+"' are : ");

		for(char ch : uniques)
		{
			if(ch!='\0')
			{
				System.out.print(ch+" ");
			}	
		}

		System.out.print("\n\nThe Duplicate elements present in the string '"+str+"' are : ");

		for(char ch : duplicates)
		{
			if(ch!='\0')
			{
				System.out.print(ch+" ");
			}	
		}
	}
}