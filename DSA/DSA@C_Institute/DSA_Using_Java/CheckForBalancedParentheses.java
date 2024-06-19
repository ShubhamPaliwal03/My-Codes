import java.util.Scanner;

class MyStack
{
	private int top;
	private int size;
	private char[] stack;

	MyStack(int size)
	{
		this.size = size;

		stack = new char[size];

		top = -1;
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

	public void push(char data)
	{
		if(top == size - 1)
		{
			return;
		}

		stack[++top] = data;
	}

	public char peek()
	{
		if(top == -1)
		{
			return '0';
		}

		return stack[top];
	}

	public boolean isEmpty()
	{
		return top == -1;
	}
}

class CheckForBalancedParentheses
{
	public static boolean isOpeningParenthesis(char token)
	{
		return token == '(' || token == '[' || token == '{';
	}

	public static boolean isClosingParenthesis(char token)
	{
		return token == ')' || token == ']' || token == '}';
	}

	public static boolean matchingPairExists(char token, MyStack stack)
	{
		return stack.peek() == '(' && token == ')' || stack.peek() == '[' && token == ']' || stack.peek() == '{' && token == '}';
	}

	public static boolean isBalancedExpression(String expression)
	{
		MyStack stack = new MyStack(expression.length());

		for(char token : expression.toCharArray())
		{
			// if the token is an opening parenthesis, push it into the stack

			if(isOpeningParenthesis(token))
			{
				stack.push(token);
			}

			// if the token is a closing parenthesis

			else if(isClosingParenthesis(token))
			{
				// if there is a matching opening parenthesis for it present in the stack, pop it from the stack

				if(matchingPairExists(token, stack))
				{
					stack.pop();
				}
				else
				{
					return false;
				}
			}
		}

		// if the expression is not balanced, then the stack will not be empty

		return stack.isEmpty();
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter an expression : ");

		String expression = kb.nextLine();

		String result = isBalancedExpression(expression) ? "Balanced" : "Not Balanced";

		System.out.print("\nThe given expression '"+expression+"' is "+result+"!");
	}
}