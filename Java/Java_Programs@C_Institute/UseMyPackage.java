import mypackage.MyMath;

public class UseMyPackage
{
	public static void main(String args[])
	{
		MyMath m = new MyMath();

		m.printSum(1000, 1);

		m.printProduct(100, 2);
	}
}