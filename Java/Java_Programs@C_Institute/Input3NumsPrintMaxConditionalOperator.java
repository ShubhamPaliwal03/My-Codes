import java.util.Scanner;

class Input3NumsPrintMaxConditionalOperator
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int a,b,c,max;

		System.out.print("Enter the first number : ");
		a = kb.nextInt();
		System.out.println();

		System.out.print("Enter the second number : ");
		b = kb.nextInt();
		System.out.println();

		System.out.print("Enter the third number : ");
		c = kb.nextInt();
		System.out.println();

		max = a>b ? a : b;
		max = max>c ? max : c;

		System.out.println("Max among "+a+", "+b+" and "+c+" : "+max); 
	}
}