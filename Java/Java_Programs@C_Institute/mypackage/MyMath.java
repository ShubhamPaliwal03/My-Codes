package mypackage;

public class MyMath // since we are using public accessibility mode here, therefore the name of the class should be the same as the name of the file
{
	public void printSum(int a, int b)
	{
		int c = a + b;

		System.out.println("Sum of "+a+" and "+b+" is : "+c);
	}

	public void printProduct(int a, int b)
	{
		int c = a * b;

		System.out.println("Product of "+a+" and "+b+" is : "+c);
	}
}