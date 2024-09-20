import java.util.Scanner;

class ValidOrInvalidTriangleConditionalOperator
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		float a1,a2,a3,sum;
		String result;

		System.out.print("Enter the first angle : ");
		a1 = kb.nextFloat();
		System.out.println();

		System.out.print("Enter the second angle : ");
		a2 = kb.nextFloat();
		System.out.println();

		System.out.print("Enter the third angle : ");
		a3 = kb.nextFloat();
		System.out.println();

		sum = a1+a2+a3;

		result = sum==180 ? "Valid Triangle" : "Invalid Triangle" ;

		System.out.println(result)

		// System.out.println(a1+a2+a3==180?"Valid Triangle":"Invalid Triangle");
	}
} 