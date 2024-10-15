import java.util.Scanner;

class PrintPrimeFactorsOfANumber
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = kb.nextInt();

		kb.close();

		System.out.println();

		System.out.print("The Prime Factors of "+num+" are : ");

		int factor=2;
		while(factor<=num)
		{
			if(num%factor==0)
			{
				int i=2;
				while(i*i<=factor)
				{
					if(factor%i==0)
					{
						break;
					}
					i++;
				}

				if(i*i>factor)
				{	
					int result=0;
					while(result!=num)
					{
						System.out.print(factor+" ");
						result=result+factor;
					}
				}
			}
			factor++;
		}
	}
}