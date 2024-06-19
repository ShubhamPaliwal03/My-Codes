import java.util.Scanner;

class PrintFactorsOfANumber
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = kb.nextInt();

		kb.close();

		System.out.println();

		System.out.print("The factors of "+num+" are : ");

		int factor=1;
		while(factor<=num/2)
		{
			if(num%factor==0)
			{
				System.out.print(factor+" ");
			}
			factor++;
		}
	}
}