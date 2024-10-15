// WAP to create a function which takes an integer as argument and returns reverse of the integer.

import java.util.Scanner;

class FuncWithArgRetReverseOfInteger
{
	public static void main(String args[])
	{	
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter an integer : ");

		int num = kb.nextInt();

		int rev = ReverseInteger(num);

		System.out.println("\nThe Reverse of "+num+" is : "+rev);
	}

	static int ReverseInteger(int n)
	{
		int r=0,m;

		while(n!=0)
		{
			m = n % 10;

			r = r * 10 + m;

			n = n / 10;
		}

		return r;
	}
}