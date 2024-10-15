import java.util.Scanner;

class MoreOptimisedPrintPrimeFactorsOfANumber
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = kb.nextInt();

		kb.close();

		System.out.println();

		System.out.print("The Prime Factors of "+num+" are : ");

		int i=2;

		while(num>1)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				num=num/i;
			}
			else
			{
				i++;
			}
		}
	}
}