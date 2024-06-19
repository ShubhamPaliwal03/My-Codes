import java.util.Scanner;

class MyStack
{
	private int top;
	private char[] stack;
	private int size;

	MyStack(int size)
	{
		this.size = size;

		stack = new char[size];

		top = -1;
	}

	public void push(char data)
	{
		if(top == size - 1)
		{
			return;
		}

		stack[++top] = data;
	}

	public char pop()
	{
		if(top == -1)
		{
			return '0';
		}

		char data = stack[top];

		stack[top--] = '0';

		return data;
	}

	public boolean isEmpty()
	{
		return top == -1;
	}
}

class ReverseAStringUsingStack
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a string : ");

		String s = kb.nextLine();

		MyStack stack = new MyStack(s.length());

		for(char ch : s.toCharArray())
		{
			stack.push(ch);
		}

		StringBuilder rev = new StringBuilder();

		while(!stack.isEmpty())
		{
			char data = stack.pop();

			rev.append(data);
		}

		System.out.println("\nThe reversed string is : "+rev);
	}
}