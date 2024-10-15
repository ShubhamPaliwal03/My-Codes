import java.util.Scanner;

class GCDofTwoNumbers {

	public static int getGCD(int a, int b) {

		if (b == 0) {

			return a;
		}

		return getGCD(b, a % b);
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a : ");

		int a = kb.nextInt();

		System.out.print("\nEnter b : ");

		int b = kb.nextInt();

		int gcd = getGCD(a, b);

		System.out.println("\nGCD of " + a + " and " + b + " is : "+gcd);
	}
}