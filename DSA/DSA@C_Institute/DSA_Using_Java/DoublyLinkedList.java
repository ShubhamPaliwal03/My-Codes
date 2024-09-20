import java.util.Scanner;

class Node
{
	int data;

	Node prev;

	Node next;

	Node(int data)
	{
		this.data = data;

		this.prev = null;

		this.next = null;
	}
}

class DoublyLinkedList
{
	Node start;

	Node tail;

	// although, we don't need to explicitly assign start and tail to null, as by default, the objects of our class have null values

	DoublyLinkedList()
	{
		start = null;

		tail = null;
	}

	void createList(int n)
	{
		Scanner kb = new Scanner(System.in);

		int i;

		Node node;

		for(i = 1; i <= n; i++)
		{
			System.out.print("\nEnter the data you want to insert at Node "+i+" : ");

			int data = kb.nextInt();

			node = new Node(data);

			if(start == null)
			{
				start = tail = node;
			}
			else
			{
				tail.next = node;

				node.prev = tail;

				tail = node;
			}
		}

		System.out.println("\nThe Doubly Linked List having "+n+" nodes has been successfully created...");
	}

	void displayList()
	{
		Node temp = start;

		if(temp == null)
		{
			System.out.println("\nThe Doubly Linked List is Empty!");
		}
		else
		{
			System.out.println("\nThe Doubly Linked List is as follows :\n");

			while(temp != null)
			{
				if(temp.next == null)
				{
					System.out.print(temp.data);
				}	
				else
				{
					System.out.print(temp.data+" -> ");
				}

				temp = temp.next;
			}
		}

		System.out.println();
	}

	void displayListFromEnd()
	{
		Node temp = tail;

		if(temp == null)
		{
			System.out.println("\nThe Linked List is Empty!");
		}
		else
		{
			System.out.println("\nThe Doubly Linked List in Reverse Order is as follows :\n");

			while(temp != null)
			{
				if(temp.prev == null)
				{
					System.out.print(temp.data);
				}
				else
				{
					System.out.print(temp.data+" -> ");
				}

				temp = temp.prev;
			}
		}

		System.out.println();
	}

	void insertAtBeginning(int data)
	{
		Node node = new Node(data);

		if(start == null) // if the doubly linked list is empty
		{
			start = tail = node;
		}
		else
		{
			start.prev = node;

			node.next = start;

			start = node;
		}

		System.out.println(data+" successfully inserted at the beginning of the Doubly Linked List...");
	}

	void insertAtMiddle(int data, int pos)
	{
		Node node = new Node(data);

		if(start != null)
		{
			if(pos < 1) // in case of invalid - positions
			{
				System.out.println("\nPosition "+pos+" does not exist in the Linked List!\n\nCan't add "+data+" to the Linked List!");
			}
			else if(pos == 1) // same as insert at beginning
			{
				start.prev = node;

				node.next = start;

				start = node;

				System.out.println(data+" added at position "+pos+" of the Doubly Linked List sucessfully...");
			}
			else
			{
				// searching for that position in the doubly linked list

				Node temp = start;

				int count = 1;

				boolean flag = false;

				while(temp.next != null)
				{
					if(count == pos - 1) // if we have reached the position just before the desired position in the Doubly Linked List to add the node
					{
						flag = true;

						break;
					}

					count++;

					temp = temp.next;
				}

				if(flag == true) // if the desired position exists in the Doubly Linked List
				{
					temp.next.prev = node;

					node.next = temp.next;

					temp.next = node;

					node.prev = temp;

					System.out.println(data+" added at position "+pos+" of the Doubly Linked List sucessfully...");
				}
				else if(temp.next == null && count == pos - 1) // if the position is just after the end of the current doubly linked list
				{
					// same as insertion at end

					tail.next = node;

					node.prev = tail;

					tail = node;

					System.out.println(data+" added at position "+pos+" of the Doubly Linked List sucessfully...");
				}
				else // in case of non-existing positions
				{
					System.out.println("\nPosition " + pos + " does not exist in the Linked List!\n\nCan't add " + data+ " to the Linked List!\n\nYou can only add data at positions 1 to " + (count + 1)+ " of the Linked List!");
				}
			}
		}
		else if(start == null && pos == 1)
		{
			start = tail = node;

			System.out.print("\n" + data + " added at position " + pos + " of the Doubly Linked List sucessfully...");
		}
		else
		{
			System.out.println("\nThe Linked List is Currently Empty!");
		}
	}

	void insertAtEnd(int data)
	{
		Node node = new Node(data);

		if(start == null) // if the doubly linked list is empty
		{
			start = tail = node;
		}
		else
		{
			tail.next = node;

			node.prev = tail;

			tail = node;
		}

		System.out.println(data+" successfully inserted at the end of the Doubly Linked List...");

		System.out.println();
	}

	void deleteFromBeginning()
	{
		if(start == null)
		{
			System.out.println("\nCurrently, the Doubly Linked List is Empty!\n\nCan't delete data from the beginning of the Doubly Linked List!");
		}
		else
		{
			int data = start.data;
			
			if(start == tail) // if currently, there is only one node in the Doubly Linked List
			{
				start = tail = null;
			}
			else
			{
				start = start.next;

				start.prev = null;
			}

			System.out.println(data+" successfully deleted from the beginning of the Doubly Linked List...");
		}

		System.out.println();
	}

	void deleteFromMiddle(int pos)
	{
		if(start != null)
		{
			Node temp = start;

			if(pos < 1) // in case of non-existing positions
			{
				System.out.println("\nPosition "+pos+" does not exist in the Doubly Linked List!\n\nCan't delete data from the Linked List!");
			}	
			else if(pos == 1) // same as deletion from beginning
			{
				int data = start.this.data;

				if(start == tail) // if there is only one node in the Doubly Linked List
				{
					start = tail = null;
				}
				else
				{
					start = start.next;

					start.prev = null;
				}	

				System.out.print("\n" + data + " deleted from position " + pos + " of the Linked List sucessfully...");
			}
			else
			{
				// searching for and reaching that position in the doubly linked list

				int count = 1;

				boolean flag = false;

				while(temp.next != null)
				{
					if(count == pos - 1)
					{
						flag = true;

						break;
					}

					count++;

					temp = temp.next;
				}

				if(flag == true) // if the desired position exists in the doubly linked list
				{
					data = temp.next.this.data;

					temp.next = temp.next.next;

					if(temp.next.next != null)
					{
						temp.next.next.prev = temp;
					}

					System.out.print("\n" + data + " deleted from position " + pos + " of the Linked List sucessfully...");
				}
				else if(temp.next == null && count == pos - 1) // if the desired position is just after the current last node of the doubly linked list
				{
					// same as deletion from end
				}	
				else // in case of non-existing positions
				{
					System.out.print("\nPosition " + pos+ " does not exist in the Linked List!\n\nCan't delete data from the Linked List!\n\nYou can only delete data from positions 1 to "+ count + " of the Linked List!");
				}
			}
		}
		else
		{
			System.out.println("\nThe Linked List is Currently Empty!");	
		}
	}

	void deleteFromEnd()
	{
		if(start == null)
		{
			System.out.println("\nCurrently, the Doubly Linked List is Empty!\n\nCan't delete data from the beginning of the Doubly Linked List!");
		}
		else
		{
			int data = tail.data;

			if(start == tail) // if currently, there is only one node present in the Doubly Linked List
			{
				start = tail = null;
			}
			else
			{
				tail = tail.prev;

				tail.next = null;
			}

			System.out.println(data+" successfully deleted from the end of the Doubly Linked List...");	
		}

		System.out.println();
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		char choice = 'y';

		DoublyLinkedList dll = new DoublyLinkedList();

		do
		{
			System.out.print("\nSelect your choice (1-) :\n--------------------------\n\n1. Create\n2. Display\n3. Display From End\n4. Insert At Beginning\n5. Insert At Middle\n6. Insert At End\n7. Delete From Beginning\n8. Delete From Middle\n9. Delete From End\n\nYour Choice : ");

			int operation = kb.nextInt();

			switch(operation)
			{
				case 1:

					System.out.print("\nHow many nodes do you want in the Doubly linked list ? : ");

					int n = kb.nextInt();

					dll = new DoublyLinkedList();

					dll.createList(n);

					break;

				case 2:

					dll.displayList();

					break;

				case 3:
				
					dll.displayListFromEnd();

					break;

				case 4:

					System.out.print("\nEnter the data you want to insert at the beginning of the Doubly Linked List : ");

					int data = kb.nextInt();

					System.out.println();

					dll.insertAtBeginning(data);

					break;

				case 5:
					
					System.out.print("\nEnter the data you want to insert at the middle of the Doubly Linked List : ");

					data = kb.nextInt();

					System.out.print("\nEnter the position at which you want to insert this node in the Doubly Linked List : ");

					int pos = kb.nextInt();

					System.out.println();

					dll.insertAtMiddle(data, pos);

					break;

				case 6:
				
					System.out.print("\nEnter the data you want to insert at the end of the Doubly Linked List : ");

					data = kb.nextInt();

					System.out.println();

					dll.insertAtEnd(data);

					break;

				case 7:

					System.out.println();

					dll.deleteFromBeginning();

					break;

				case 8:
					
					System.out.print("\nEnter the position from which you want to delete the node in the Linked List : ");

					pos = kb.nextInt();

					System.out.println();

					// dll.deleteFromMiddle();

					break;

				case 9:
				
					System.out.println();

					dll.deleteFromEnd();

					break;	
			}

			System.out.print("\nPress y/Y to continue and Press any other key to exit...\n\nYour Choice : ");

			choice = kb.next().charAt(0);

			if (choice != 'y' && choice != 'Y') 
			{
				System.out.println("\nSucessfullly Exited From The Program...");
			}

		} while(choice == 'y' || choice == 'Y');
	}	
}