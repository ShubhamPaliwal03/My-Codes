@FunctionalInterface
interface i1
{
	void display();
}

@FunctionalInterface
interface calculate
{
	int calculate(int a, int b);
}

class LambdasDemo
{
	public static void main(String[] args)
	{
		i1 obj1 = () -> System.out.println("\nHello from lambda expression of obj1!");

		i1 obj2 = () -> {
			System.out.println("\nHello from first print statement of lambda expression of obj2!");
			System.out.println("Hello from second print statement of lambda expression of obj2!");
		};

		obj1.display();
		obj2.display();

		int x = 50, y = 10;

		// NOTE :- Here, we cannot use (x, y) as arguments, as they are already defined before
		//		   you can use any other variable name which is not defined within this local scope
		//
		// 		   Parentheses are mandatory while using return statement in lambda expressions.


		calculate add = (a, b) -> {return a + b;};
		calculate sub = (m, n) -> {return m - n;};
		calculate mul = (a, b) -> {return a * b;};
		calculate div = (a, b) -> {return a / b;};

		System.out.println("\nAddition of "+x+" and "+y+" is :\t\t"+add.calculate(x, y));
		System.out.println("\nSubtraction of "+x+" and "+y+" is :\t\t"+sub.calculate(x, y));
		System.out.println("\nMultiplication of "+x+" and "+y+" is :\t"+mul.calculate(x, y));
		System.out.println("\nDivision of "+x+" and "+y+" is :\t\t"+div.calculate(x, y));
	}
}