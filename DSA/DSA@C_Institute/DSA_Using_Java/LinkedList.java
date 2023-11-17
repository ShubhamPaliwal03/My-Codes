class Node
{
	int data;

	Node next;

	Node(int data)
	{
		this.data = data;

		this.next = null;
	}
}

class LinkedList
{
	Node start;

	LinkedList()
	{
		start = null;
	}

	void createList(int n)
	{
		int i;

		for(i = 0; i < n; i++)
		{
			Node node = new Node(i+1);

			if(start == null)
			{
				start = node;
			}
			else
			{
				Node temp = start;

				while(temp.next != null)
				{
					temp = temp.next;
				}

				temp.next = node;
			}
		}
	}

	void displayList()
	{
		Node temp = start;

		while(temp != null)
		{
			if(temp.next != null)
			{
				System.out.print(temp.data+" -> ");
			}
			else
			{
				System.out.print(temp.data);
			}

			temp = temp.next;
		}
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		// LinkedList ll = new LinkedList();

		// ll.createList(5);

		// ll.displayList();

		char choice = 'y';

		do
		{
			System.out.print("\n1. Create LinkedList 2. Display LinkedList\n\nSelect your choice (1-2) : ");

			int operation = kb.nextInt();

			switch(operation)
			{
				case 1:

					LinkedList ll = new LinkedList();

					ll.createList();

					break;

				case 2:

					ll.displayList();

					break;

				default:
				
					System.out.print("\nPlease enter a valid operation (1-2) !");
			}

			System.out.print("\nPress y to continue and Press any other key to exit...");

			choice = kb.next().charAt(0);

		} while(choice.toLowerCase() == 'y');
	}	
}