import java.util.Scanner;

class FactorialOfANum
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = kb.nextInt();

		int fact = 1;

		int i;

		if(num>=0)
		{
			for(i=num;i>=2;i--)
			{
				fact = fact * i;
			}

			System.out.print("\nThe Factorial of "+num+" is : "+fact);
		}
		else
		{
			System.out.print("\nInvalid Input!");
		}
	}
}