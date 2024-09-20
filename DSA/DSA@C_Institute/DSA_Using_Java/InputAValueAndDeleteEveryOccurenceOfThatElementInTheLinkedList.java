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

class LinkedList
{
	static Node start;

	static Node tail;

	LinkedList()
	{
		start = null; // to store the start or head of the linked list

		tail = start; // to store the last node of the linked list
	}

	public static void createLinkedList(int size)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter "+size+" nodes in the linked list : ");

		for(int i = 1; i <= size; i++)
		{
			// System.out.print("\nEnter the data you want to store at Node"+i+" : ");

			int data = kb.nextInt();

			Node node = new Node(data);

			if(start == null) // currently, if there is no node in the linked list, ie., if this node is the first node of the linked list
			{
				start = node;

				tail = start;
			}
			else // currently, if there is at least one node in the linked list
			{
				tail.next = node; // insert the node after the last node of the linked list

				tail = tail.next; // update the tail of the linked list
			}
		}

		System.out.println("\nLinked list having "+size+" entered elements created successfully...");
	}

	public static void printLinkedList()
	{
		Node temp = start;

		System.out.println("\nThe Linked List is as follows :\n");

		while(temp.next != null)
		{
			System.out.print(temp.data+" -> ");

			temp = temp.next;
		}

		System.out.print(temp.data);
	}

	public static void deleteEveryOccurenceOf(int target)
	{
		int deleteCount = 0;

		// if(start.data == target) // if the target data is present at the first node of the linked list
		// {
		// 	start = start.next;

		// 	deleteCount++;
		// }

		Node temp = start;

		while(temp.next != null)
		{
			if(start.data == target) // if the target data is present at the first node of the linked list
			{
				start = start.next;

				temp = start;

				deleteCount++;
			}

			if(temp.next.data == target)
			{
				// delete the target node from the linked list

				temp.next = temp.next.next;

				deleteCount++;

				// if(temp.next.data != target)
				// {
				// 	temp = temp.next;
				// }
			}

			if(temp.next.data != target)
			{
				temp = temp.next;
			}
		}


		if(deleteCount == 0)
		{
			System.out.print("\nNo Nodes Found in the linked list having data = "+target+" !");
		}
		else
		{
			System.out.println("\nAll the "+deleteCount+" nodes having the data = "+target+" deleted from the linked list successfully...");
		}
	}
}

class InputAValueAndDeleteEveryOccurenceOfThatElementInTheLinkedList
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		LinkedList ll = new LinkedList();

		System.out.print("\nEnter the size of the linked list that you want to create : ");

		int size = kb.nextInt();

		LinkedList.createLinkedList(size);

		LinkedList.printLinkedList();

		System.out.print("\n\nYou want to delete every occurence of which element in the linked list ? : ");

		int target = kb.nextInt();

		LinkedList.deleteEveryOccurenceOf(target);

		LinkedList.printLinkedList();
	}	
}