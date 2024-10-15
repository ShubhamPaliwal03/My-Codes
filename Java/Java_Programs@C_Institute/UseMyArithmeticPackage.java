import arithmetic.Math;

class UseMyArithmeticPackage
{
	public static void main(String args[])
	{
		Math m = new Math();

		System.out.println(m.reverse(123)); // 321

		System.out.println(m.getLength(123)); // 3

		System.out.println(m.getLastDigit(123)); // 3
	}
}