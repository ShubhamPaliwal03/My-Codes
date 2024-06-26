import java.util.Scanner;

class ReverseWordsInAString
{
	public static void reverseString(int i, int j, StringBuilder sb)
	{
		while(i < j)
		{
			char ch = sb.charAt(i);

			sb.setCharAt(i, sb.charAt(j));

			sb.setCharAt(j, ch);

			i++;

			j--;
		}
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		StringBuilder sb = new StringBuilder(kb.nextLine());

		int start = 0;

		for(int i = 0; i < sb.length(); i++)
		{
			if(sb.charAt(i) == ' ')
			{
				reverseString(start, i - 1, sb);

				start = i + 1;
			}
			else if(i == sb.length() - 1)
			{
				reverseString(start, i, sb);
			}
		}

		System.out.print("\nThe reversed string is : "+sb);
	}
}