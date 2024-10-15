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
		// since we are using linked list, then no stack overflow will occur

		// creating a new node, a new element of the stack

		Node node = new Node(data);

		// push operation of stack as same as insert at beginning operation of the linked list

		if(start == null)
		{
			start = node;
		}
		else
		{
			node.next = start;

			start = node;
		}

		System.out.println("\n"+data+" successfully pushed into the stack...");
	}

	int pop()
	{
		int data = -1;

		// pop operation of stack is same as delete from beginning

		if(start == null)
		{
			System.out.println("\nStack Underflow!\n\nNothing to be popped from the stack!");
		}
		else
		{
			data = start.data;

			start = start.next;

			System.out.println("\n"+data+" successfully popped from the stack...");
		}

		return data;
	}

	int peek()
	{
		int data = -1;

		if(start == null)
		{
			System.out.println("\nStack Empty!\n\nNothing present on the top of stack!");
		}
		else
		{
			data = start.data;

			System.out.println("\n"+data+" is present on the top of the stack...");
		}

		return data;
	}

	void printStack()
	{
		if(start != null)
		{
			System.out.println("\nCurrently, The Stack Is As Follows :\n");

			Node temp = start;

			while(temp != null)
			{
				if(temp == start)
				{
					System.out.print("\n| |\n|"+temp.data+"|");
				}
				else
				{
					System.out.print("\n|_|\n| |\n|"+temp.data+"|");
				}	

				temp = temp.next;
			}

			System.out.print("\n|_|");

			System.out.println();
		}
		else
		{
			System.out.println("\nCurrently, The Stack Is Empty!");
		}	
	}
}

class Main
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		Stack myStack = new Stack();

		char choice = 'y';

		do
		{
			System.out.print("\nSelect your choice (1-3) :\n--------------------------\n\n1. Push\n2. Pop\n3. Peek\n4. Print\n\nYour Choice : ");

			int operation = kb.nextInt();
			
			switch(operation)
			{
				case 1:

					System.out.print("\nEnter the data that you want to push into the stack : ");

					int data = kb.nextInt();

					myStack.push(data);

					break;

				case 2:

					myStack.pop();

					break;
				
				case 3:

					myStack.peek();

					break;

				case 4:

					myStack.printStack();

					break;

				default:
				
					System.out.println("\nPlease enter a valid choice!");
			}

			System.out.print("\nPress y to continue and press any other key to exit...\n\nYour choice : ");

			choice = kb.next().charAt(0);
		}

		while(choice == 'y' || choice == 'Y');

		System.out.println("\nSuccessfully exited from the program...");

		kb.close();
	}
}