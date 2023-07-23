import java.util.Scanner;

class CheckForPrimeNumber
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = kb.nextInt();

		kb.close();

		System.out.println();

		int i;

		if(num<0)
		{
			System.out.println("Negative numbers are excluded! Prime numbers are integers greater than one with no positive divisors besides one and itself");
		}
		else if(num==0)
		{
			System.out.println("0 is Neither a Prime Number Nor a Composite Number");
		}
		else
		{
			i=2;
			while(i*i<=num)
			{
				if(num%i==0)
				{
					break;
				}
				i++;
			}

			if(i*i>num)
			{
				System.out.println(num+" is a Prime Number");
			}
			else
			{
				System.out.println(num+" is Not a Prime Number");
			}
		}
	}	
}