import java.util.*;

class Node // self - referencing structure
{
	int data;

	Node next; // self - referencing pointer (an object which holds the reference of the same type of its class)

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
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the data (numeric) that you want to place at all the " + n + " nodes :\n");

		for (int i = 0; i < n; i++) 
		{
			System.out.print("\nData To Be Placed At Node " + (i + 1) + " : ");

			int data = kb.nextInt();

			Node node = new Node(data);

			if (start == null) 
			{
				start = node;
			} 
			else 
			{
				Node temp = start;

				while (temp.next != null) 
				{
					temp = temp.next;
				}

				temp.next = node;
			}
		}

		System.out.print("\nLinked List with " + n + " nodes has been created sucessfully...\n");
	}

	void displayList() 
	{
		if (start != null) 
		{
			System.out.print("\n\nCurrently, the Linked List is as follows :\n\n");

			Node temp = start;

			while (temp != null) 
			{
				if (temp.next != null) 
				{
					System.out.print(temp.data + " -> ");
				} 
				else 
				{
					System.out.print(temp.data);
				}

				temp = temp.next;
			}
		} 
		else 
		{
			System.out.print("\nThe Linked List is Currently Empty !");
		}

		System.out.println();
	}

	void displayFromEndUtil(Node tmp) 
	{
		if (tmp == null) 
		{
			return;
		}

		displayFromEndUtil(tmp.next);

		System.out.print(tmp.data + " ");
	}

	void displayFromEnd() 
	{
		if (start != null) 
		{
			System.out.print("\n\nThe Linked List in Reverse Order is as follows :\n\n");

			Node temp = start;

			displayFromEndUtil(temp);
		} 
		else 
		{
			System.out.print("\nThe Linked List is Currently Empty !");
		}

		System.out.println();
	}

	void insertAtBeginning(int data) 
	{
		Node node = new Node(data);

		if(start == null)
		{
			start = node;
		}
		else
		{
			Node temp = start;

			start = node;

			node.next = temp;

			// or

			// node.next = start;

			// start = node;
		}

		System.out.print("\n" + data + " added at the beginning of the Linked List successfully...");
	}

	void insertAtMiddle(int data, int pos)
	{
		if (start != null) 
		{
			Node node = new Node(data);

			Node temp = start;

			if (pos < 1) // in case of invalid positions
			{
				System.out.print("\nPosition " + pos + " does not exist in the Linked List!\n\nCan't add " + data+ " to the Linked List!");
			} 
			else if (pos == 1) // same as insert at beginning
			{
				// start = node;

				// node.next = temp;

				// or

				node.next = start;

				start = node;

				System.out.print("\n" + data + " added at position " + pos + " of the Linked List sucessfully...");
			} 
			else 
			{
				// searching for and reaching that position in the linked list

				int count = 1;

				boolean flag = false;

				while (temp.next != null) 
				{
					if (count == pos - 1)  // if we have reached the position just before the desired position in the Linked List to add the node
					{
						flag = true;

						break;
					}

					count++;

					temp = temp.next;
				}

				if (flag == true) // if the desired position exists in the Linked List
				{
					Node old = temp.next;

					temp.next = node;

					node.next = old;

					System.out.print("\n" + data + " added at position " + pos + " of the Linked List sucessfully...");
				}
				else if (temp.next == null && count == pos - 1) // if the desired position is just after the last node of the current linked list
				{
					// same as Insertion At End

					temp.next = node;

					System.out.print("\n" + data + " added at position " + pos + " of the Linked List sucessfully...");
				}
				else // in case of non-existing positions
				{
					System.out.print("\nPosition " + pos + " does not exist in the Linked List!\n\nCan't add " + data+ " to the Linked List!\n\nYou can only add data at positions 1 to " + (count + 1)+ " of the Linked List!");
				}
			}
		} 
		else if(start == null && pos == 1)
		{
			start = node;

			System.out.print("\n" + data + " added at position " + pos + " of the Linked List sucessfully...");
		}
		else 
		{
			System.out.print("\nThe Linked List is Currently Empty!");
		}
	}

	void insertAtEnd(int data) 
	{
		Node node = new Node(data);

		Node temp = start;

		while (temp.next != null) 
		{
			temp = temp.next;
		}

		temp.next = node;

		System.out.print("\n" + data + " added at the end of the Linked List successfully...");
	}

	void deleteFromBeginning() 
	{
		if (start != null) 
		{
			System.out.print("\n" + start.data + " removed from the beginning of the Linked List successfully...");

			start = start.next;
		} 
		else 
		{
			System.out.print("\nThe Linked List is Currently Empty !");
		}
	}

	void deleteFromMiddle(int pos) 
	{
		if (start != null) 
		{
			Node temp = start;

			if (pos < 1) // in case of invalid positions
			{
				System.out.print("\nPosition " + pos+ " does not exist in the Linked List!\n\nCan't delete data from the Linked List!");
			} 
			else if (pos == 1) // delete from beginning
			{
				int node_data = start.data;

				start = start.next;

				System.out.print("\n" + node_data + " deleted from position " + pos + " of the Linked List sucessfully...");
			} 
			else 
			{
				int count = 1;

				boolean flag = false;

				while (temp.next != null)
				{
					if (count == pos - 1) // if we have reached the position just before the desired position in the Linked List to delete the node
					{
						flag = true;

						break;
					}

					count++;

					temp = temp.next;
				}

				if (flag == true) // if the desired position exists in the Linked List
				{
					int node_data = temp.next.data;

					temp.next = temp.next.next;

					System.out.print("\n" + node_data + " deleted from position " + pos + " of the Linked List sucessfully...");
				} 
				else // in case of non-existing positions
				{
					System.out.print("\nPosition " + pos+ " does not exist in the Linked List!\n\nCan't delete data from the Linked List!\n\nYou can only delete data from positions 1 to "+ count + " of the Linked List!");
				}
			}
		} 
		else 
		{
			System.out.print("\nThe Linked List is Currenty Empty!");
		}
	}

	void deleteFromEnd() 
	{
		if (start != null) 
		{
			Node temp = start;

			while (temp.next.next != null) 
			{
				temp = temp.next;
			}

			System.out.print("\n" + temp.next.data + " removed from the beginning of the Linked List successfully...");

			temp.next = null;
		} 
		else 
		{
			System.out.print("\nThe Linked List is Currently Empty !");
		}
	}

	void checkSize() 
	{
		int count = 0;

		Node temp = start;

		while (temp != null) 
		{
			count++;

			temp = temp.next;
		}

		System.out.print("\nCurrently, the Linked List contains " + count + " elements...");
	}

	void searchElement(int key) 
	{
		if (start != null) 
		{
			int count = 0;

			ArrayList<Integer> positions = new ArrayList<>();

			int p = 1;

			Node temp = start;

			while (temp != null) 
			{
				if (temp.data == key) 
				{
					count++;

					positions.add(p);
				}

				p++;

				temp = temp.next;
			}

			if (count == 0) 
			{
				System.out.print("\n" + key + " not found at any position in the Linked List!");
			} 
			else 
			{
				System.out.print("\n" + key + " found " + count + " time(s) in the array at position(s) : ");

				for (int pos : positions) // using for each loop and auto-boxing of wrapper classes
				{
					System.out.print(pos + " ");
				}
			}
		} 
		else 
		{
			System.out.print("\nThe Linked List is Currently Empty!");
		}
	}

	// the below function checks and returns true if the linkedlist is circular, else it returns false if it is not-circular

	// we will check if a node in the linkedlist holds the address of the starting node in its next pointer

	boolean checkCircular(Node node)
	{
		if(node == null)
		{
			return false;
		}
		else
		{
			Node start = node;

			while(node.next != null)
			{
				if(node.next == start)
				{
					return true;
				}

				node = node.next;
			}

			return false;
		}
	}
}	

class Main 
{
	public static void main(String args[]) 
	{
		Scanner kb = new Scanner(System.in);

		LinkedList ll = new LinkedList();

		// initializing Linked List ll with null is not correct, it throws
		// NullPointerExeption in many cases
		// which are not needed to be handled by normal if-else statements,
		// and exception handling is not recommended here to handle caveats in the code.

		char choice = 'y';

		do 
		{
			System.out.print("\nSelect your choice (1-12) :\n--------------------------\n\n1.  Create\n2.  Display\n3.  Display From End\n4.  Insert At Beginning\n5.  Insert At Middle (At Desired Position)\n6.  Insert At End\n7.  Delete From Beginning\n8.  Delete From Middle (At desired position)\n9.  Delete From End\n10. Check Size\n11. Search an Element\n12. Check if the LinkedList is Circular (true/false)\n13. Reverse the Linked List (in-place)\n\nYour Choice : ");

			int operation = kb.nextInt();

			switch (operation) 
			{
				case 1:

					System.out.print("\nHow many nodes do you want in the linked list ? : ");

					int n = kb.nextInt();

					// Linked List ll = new Linked List(); // we can't declare and define it like this
					// here in switch case

					ll = new LinkedList();

					ll.createList(n);

					break;

				case 2:

					ll.displayList();

					break;

				case 3:

					ll.displayFromEnd();

					break;

				case 4:

					System.out.print("\nEnter the data you want to insert at the beginning of the Linked List : ");

					int data = kb.nextInt();

					ll.insertAtBeginning(data);

					break;

				case 5:

					System.out.print("\nEnter the data you want to insert at the middle of the Linked List : ");

					data = kb.nextInt();

					System.out.print("\nEnter the position at which you want to insert this node in the Linked List : ");

					int pos = kb.nextInt();

					ll.insertAtMiddle(data, pos);

					break;

				case 6:

					System.out.print("\nEnter the data you want to insert at the end of the Linked List : ");

					data = kb.nextInt();

					ll.insertAtEnd(data);

					break;

				case 7:

					ll.deleteFromBeginning();

					break;

				case 8:

					System.out.print("\nEnter the position from which you want to delete the node in the Linked List : ");

					pos = kb.nextInt();

					ll.deleteFromMiddle(pos);

					break;

				case 9:

					ll.deleteFromEnd();

					break;

				case 10:

					ll.checkSize();

					break;

				case 11:

					System.out.print("\nEnter the element that you want to search for in the Linked List : ");

					int key = kb.nextInt();

					ll.searchElement(key);

					break;

				case 12:
				
					Node n1 = new Node(1);	
					Node n2 = new Node(2);
					Node n3 = new Node(3);

					// circular

					n1.next = n2;
					n2.next = n3;
					n3.next = n1;

					// not circular

					// n1.next = n2;
					// n2.next = n3;
					// n3.next = null;

					System.out.print("\n"+ll.checkCircular(n1));

					break;

				default:

					System.out.print("\nPlease enter a valid operation (1-12) !");
			}

			System.out.print("\n\nPress y/Y to continue and Press any other key to exit...\n\nYour Choice : ");

			choice = kb.next().charAt(0);

			if (choice != 'y' && choice != 'Y') 
			{
				System.out.print("\nSucessfullly Exited From The Program...");
			}

		} 
		while (String.valueOf(choice).toLowerCase().charAt(0) == 'y');

		// while(choice == 'y' || choice == 'Y');
	}
}