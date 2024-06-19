import java.util.Scanner;

class CircularlySwap3Nums
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int a,b,c,d;

		System.out.print("Enter the value of a : ");
		a = kb.nextInt();
		System.out.println();

		System.out.print("Enter the value of b : ");
		b = kb.nextInt();
		System.out.println();

		System.out.print("Enter the value of c : ");
		c = kb.nextInt();
		System.out.println();

		d = b;
		b = a;
		a = c;
		c = d;

		System.out.println("After Circular Swapping :\n\na is : "+a+"\nb is : "+b+"\nc is : "+c);
	}
}