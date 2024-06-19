import java.util.*;

class PrintASubstringOfStringFromStartToGivenLength
{
	public static void printSubstring(String s, int start, int length)
	{
		if(start < 0 || length == 0)
		{
			System.out.println("\nNo substring exists in this range!");

			if(start < 0)
			{
				System.out.println("\nstart parameter can't be negative!");	
			}

			if(length < 0)
			{
				System.out.println("\nlength parameter can't be negative!");	
			}
		}
		else if(start > length)
		{
			System.out.println("\nNo substring exists in this range!\nstart parameter can't be greater than length parameter!");
		}
		else if(length > s.length())
		{
			System.out.println("\nNo substring exists in this range!\nlength parameter can't be greater than length of the original string parameter!");
		}
		else if(start + length > s.length())
		{
			System.out.println("\nNo substring exists in this range!\nSubstring of required length '"+length+"' not possible starting from given start parameter '"+start+"'!");
		}
		else
		{
			System.out.print("\nThe Substring from index start = "+start+", having a length of "+length+" is : ");

			for(int i = start; i < start + length ; i++)
			{
				System.out.print(s.charAt(i));
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String s = kb.nextLine();

		System.out.print("\nEnter the value of start (index) : ");

		int start = kb.nextInt();

		System.out.print("\nEnter the length of the substring : ");

		int length = kb.nextInt();

		printSubstring(s, start, length);
	}
}