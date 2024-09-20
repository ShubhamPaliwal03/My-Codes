import java.util.Scanner;

class RecursivelyCalculatePower
{
	public static int power(int a, int b)
	{
		if(b == 0)
		{
			return 1;
		}

		return a * power(a, b - 1);
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the base : ");

		int base = kb.nextInt();

		System.out.print("\nEnter the exponent : ");

		int exp = kb.nextInt();

		int pow = power(base, exp);

		System.out.print("\n"+base+" raised to the power "+exp+" is : "+pow);
	}
}