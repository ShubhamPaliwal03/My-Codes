import java.util.Scanner;

class MaxAmong2ConditionalOperator
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int a,b,max;

		System.out.print("Enter the first value : ");
		a = kb.nextInt();
		System.out.println();

		System.out.print("Enter the second value : ");
		b = kb.nextInt();
		System.out.println();

		max = a>b ? a : b;

		System.out.print("Max value among "+a+" and "+b+" is : "+max);
	}
}