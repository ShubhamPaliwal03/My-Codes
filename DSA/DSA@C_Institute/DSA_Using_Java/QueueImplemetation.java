import java.util.Scanner;

class Queue
{
	private int[] queue;

	private int rear;

	private int front;

	public Queue(int size)
	{
		queue = new int[size];

		rear = -1;

		front = -1;
	}

	public void enqueue(int data)
	{
		int size = queue.length;

		if(rear == size - 1) // when queue is full
		{
			System.out.println("\nQueue Exhausted (Full)! "+data+" cannot be added to the Queue!");

			return;
		}
		else
		{
			if(front == -1) // when the queue is empty
			{
				front = rear = 0;

				queue[rear] = data; // adding data to the rear of the queue
			}
			else // when the queue contains one or more than one element
			{
				rear++;

				queue[rear] = data; // adding data to the rear of the queue
			}

			System.out.println("\n"+data+" added to the Queue...");
		}
	}

	public int dequeue()
	{
		int data = -1;

		if(front == -1) // when the queue is empty
		{
			System.out.println("\nQueue Empty! Nothing to be deleted from the Queue!");
		}
		else
		{
			data = queue[front];

			queue[front] = 0;

			front++;

			System.out.println("\n"+data+" deleted from the Queue...");

			if(front > rear) // ie., if the queue is empty, we reset both the front and the rear to -1
			{
				front = rear = -1;
			}
		}

		return data;
	}
}

class UseMyQueue
{
	public static void main(String args[])
	{
		Queue queue = new Queue(5);

		for(int i = 1; i <= 5; i++)
		{
			queue.enqueue(i);
		}

		for (int i = 1; i <= 3; i++) 
		{
			queue.dequeue();
		}	
	}
}