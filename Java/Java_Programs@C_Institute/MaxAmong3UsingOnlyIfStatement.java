import java.util.Scanner;

class MaxAmong3UsingOnlyIfStatement
{
	public static void main(String args[])
	{

		Scanner kb = new Scanner(System.in);

		int a, b ,c, max;

		System.out.print("Enter the first number : ");

		a = kb.nextInt();

		System.out.print("\nEnter the second number : ");

		b = kb.nextInt();

		System.out.print("\nEnter the third number : ");

		c = kb.nextInt();

		kb.close();

		max = a;

		if(b > max)
		{
			max = b;
		}

		if(c > max)
		{
			max = c;
		}

		System.out.print("\nMax among "+a+", "+b+", and "+c+" is : "+max);
	}	
}