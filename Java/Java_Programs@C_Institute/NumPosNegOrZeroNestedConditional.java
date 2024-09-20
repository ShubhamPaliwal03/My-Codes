import java.util.Scanner;

class NumPosNegOrZeroNestedContitional
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		double num;

		System.out.print("Enter a number : ");
		num = kb.nextDouble();
		System.out.println();

		System.out.println
		(
			num>=0 ?
					num==0 ? "The Number is Zero" : "The Number is Positive"
				   :
				   	"The Number is Negative"	
		);
	}
}