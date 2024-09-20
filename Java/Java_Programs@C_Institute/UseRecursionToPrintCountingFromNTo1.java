import java.util.Scanner;

class UseRecursionToPrintCountingFromNTo1
{
	static void printCountingFromNTo1(int n)
	{
		if(n == 0)
		{
			return;
		}

		System.out.println(n);

		printCountingFromNTo1(n-1);
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the value of N : ");

		int n = kb.nextInt();

		System.out.println("\nCounting From N to 1 is :\n");

		printCountingFromNTo1(n);
	}
}