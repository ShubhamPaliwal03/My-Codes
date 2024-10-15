import java.util.Scanner;

class PowerOfTwoNumbers {

	public static int getPower(int a, int b) {

		if (b == 0) {

			return 1;
		}

		return a * getPower(a, b - 1);
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a : ");

		int a = kb.nextInt();

		System.out.print("\nEnter b : ");

		int b = kb.nextInt();

		int pow = getPower(a, b);

		System.out.println(pow);
	}
}