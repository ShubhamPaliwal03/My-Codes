import java.util.Scanner;

class FactorialOfNum
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a positive integer : ");

		int num = kb.nextInt();
		int number=num;
		int fact=1;

		if(num<0)
		{
			System.out.println("\nInvalid Input");
		}
		else
		{
			for(;num>=1;num--)
			{
				fact=fact*num;
			}

			System.out.println("\nThe Factorial of "+number+" is : "+fact);			
		}
	}	
}