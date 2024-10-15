import java.util.Scanner;

class Node
{
	int data;

	Node next;

	Node(int data)
	{
		this.data = data;

		next = null;
	}
}

class Stack
{
	Node start;

	Stack()
	{
		start = null;
	}

	void push(int data)
	{
		Node node = new Node(data);

		if(start == null)
		{
			start = node;
		}
		else
		{
			node.next = start;

			start = node;
		}
	}

	int pop()
	{
		int data = -1;

		if(start != null)
		{
			data = start.data;

			start = start.next;
		}

		return data;
	}

	int peek()
	{
		int data = -1;

		if(start != null)
		{
			data = start.data;
		}

		return data;
	}

	boolean isEmpty()
	{
		return peek() == -1 ? true : false;
	}
}

class ParenthesisMatchingUsingStack
{
	public static boolean isBalanced(String expression)
	{
		Stack myStack = new Stack();

		for(int i = 0; i < expression.length(); i++)
		{
			char ch = expression.charAt(i);

			// if the current character in the expression is a opening parenthesis, then push into the stack

			if(ch == '(' || ch == '{' || ch == '[')
			{
				myStack.push(ch);
			}

			// if there is an opening parenthesis at the top of the stack,
			// and there is a matching closing parenthesis at the current index of the string

			else if(myStack.peek() == '(' && ch == ')' || myStack.peek() == '{' && ch == '}' || myStack.peek() == '[' && ch == ']')
			{
				myStack.pop();
			}

			// if there is a closing parenthesis, and there is no matching opening parenthesis present on the top of the stack

			else if(ch == ')' || ch == '}' || ch == ']')
			{
				return false;
			}
		}

		// if the stack is empty, then the expression will be balanced

		return myStack.isEmpty();
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter an expression : ");

		String expression = kb.next();

		if(isBalanced(expression))
		{
			System.out.println("\nThe Expression "+expression+" Is Balanced...");
		}
		else
		{
			System.out.println("\nThe Expression "+expression+" Is Not Balanced...");
		}
	}	
}