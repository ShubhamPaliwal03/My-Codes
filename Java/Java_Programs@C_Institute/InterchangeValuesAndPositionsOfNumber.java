import java.util.Scanner;

class InterchangeValuesAndPositionsOfNumber
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter how many digit number you want to enter (like 5 for a 5-digit number) : ");

		int n = kb.nextInt();

		System.out.print("\nEnter a number having indivisual digit(s) having value strictly greater than 1 and less than "+n+" : ");

		int num = kb.nextInt();

		int number = num;

		int[] ans = new int[n]; // initialize an array to extract the indivisual digits of the number from the number

		int i = 1;

		while(num > 1)
		{
			int digit = num % 10;

			ans[digit - 1] = i++;

			num = num / 10;
		}

		i = n - 1;

		int inv = 0;

		while(i >= 0)
		{
			inv = inv * 10 + ans[i];

			i--;
		}

		System.out.println("\nThe Number obtained after inversion of "+number+" is : "+inv);
	}
}