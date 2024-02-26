import java.util.*;

class ParenthesisCheckerUsingCollectionsLinkedList
{
	// most optmised method

	public static boolean isBalanced(String exp)
	{
		// Create the Linked List, to use it as a stack

		LinkedList<Character> stack = new LinkedList<>();

		// iterate over the expression

		for(int i = 0; i < exp.length(); i++)
		{
			char token = exp.charAt(i);

			// if the current character, or token is a opening parenthesis (, [, or {
			// then, push it into the stack.

			if(token == '(' || token == '[' || token == '{')
			{
				stack.push(token);
			}

			// if the current character, or token is a closing parenthesis

			else if(token == ')' || token == ']' || token == '}')
			{
				// if the stack is empty and the token is a closing parenthesis, then the expression is not balanced

				if(stack.isEmpty())
				{
					return false;
				}

				char top = stack.peek(); // get the character at the top of the stack

				// if we get a matching parenthesis at the top of the stack

				if(top == '(' && token == ')' || top == '[' && token == ']' || top == '{' && token == '}')
				{
					stack.pop();
				}
				else // if there is no matching opening parenthesis for the current closing parenthesis, then the expression is not balanced
				{
					return false;
				}
			}
		}

		// if the stack doesn't contain any opening parenthesis, when the expression is parsed completely, 
		// then the stack will be empty, and it will return true.
		
		// and if the stack contains any leftover unmatched opening parenthesis, when the expression is paresed completely,
		// then the stack will not be empty, and it will return false.

		return stack.isEmpty();
	}	

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the Expression you want to check for being balanced : ");

		String expression = kb.next();

		if(isBalanced(expression))
		{
			System.out.print("\nThe Given Expression '"+expression+"' Is Balanced");
		}
		else
		{
			System.out.print("\nThe Given Expression '"+expression+"' Is Not Balanced");
		}
	}
}

// other possible else if part code of the function...

// or

// if there is an opening parenthesis at the top of the stack,
// and there is a matching closing parenthesis at the current index of the string
// the, pop that closing parenthesis from the stack.

// stack.size() != 0 is checked here to avoid null pointer exception when the stack is empty

// else if(stack.size() != 0 && (stack.peek() == '(' && token == ')' || stack.peek() == '{' && token == '}' || stack.peek() == '[' && token == ']'))
// {
// 	stack.pop();
// }

// // // if there is a closing parenthesis, and there is no matching opening parenthesis present on the top of the stack

// else if(token == ')' || token == '}' || token == ']')
// {
// 	return false;
// }

// or

// if there is a closing parenthesis at the current index of the expression

// else if(token == ')' || token == ']' || token == '}')
// {
// 	// if there is an opening parenthesis at the top of the stack, 
// 	// and there is a matching closing parenthesis at the current index of the string

// 	if(stack.size() != 0 && (stack.peek() == '(' && token == ')' || stack.peek() == '[' && token == ']' || stack.peek() == '{' && token == '}'))
// 	{
// 		stack.pop();
// 	}

// 	// and there is no matching opening parenthesis present on the top of the stack

// 	else
// 	{
// 		return false;
// 	}
// }