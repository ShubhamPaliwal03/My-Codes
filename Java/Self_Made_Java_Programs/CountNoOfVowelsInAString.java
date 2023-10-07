import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the String : ");

		String str = kb.nextLine();

		str = str.toLowerCase(); // converting the letters of the string to lowercase

		int count = 0;

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);

			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}

		System.out.print("\nThe Number of Vowels in the string are : "+count);

		kb.close();
	}
}