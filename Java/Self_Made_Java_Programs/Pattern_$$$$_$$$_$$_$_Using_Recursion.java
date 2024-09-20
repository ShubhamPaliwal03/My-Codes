import java.util.Scanner;

class Pattern_$$$$_$$$_$$_$_Using_Recursion
{
	static void PatternRows(int n)
	{
		if(n==0)
		{
			return;
		}

		System.out.print("*");

		PatternRows(n-1);
	}

	public static void Pattern(int n)
	{
		if(n==0)
		{
			return;
		}

		PatternRows(n);

		System.out.println();

		Pattern(n-1);
	}

	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		kb.close();

		Pattern(n);

	}
}
