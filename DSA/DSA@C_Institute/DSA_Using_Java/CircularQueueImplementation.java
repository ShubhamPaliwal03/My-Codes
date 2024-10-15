class CircularQueue
{
	private int[] c_queue;

	private int rear;

	private int front;

	public CircularQueue(int size)
	{
		c_queue = new int[size];

		rear = -1;

		front = -1;
	}

	public void enqueue(int data)
	{
		int size = c_queue.length;

		if((front == 0 && rear == size-1) || (rear+1 == front))
		{
			System.out.println("\nCircular queue Exhausted!\n"+data+" cannot be added to the circular queue");

			return;
		}
		else
		{
			if(front == -1)
			{
				front = rear = 0;

				c_queue[rear] = data;
			}
			else if(front != 0 && rear == size-1) // this enables wrap-around when there is some extra space left
			{
				rear = 0;
				
				c_queue[rear] = data;	
			}
			else
			{
				rear++;

				c_queue[rear] = data;
			}

			System.out.println("\n"+data+" added to the circular queue...");
		}
	}

	public int dequeue()
	{
		int size = c_queue.length;

		int data = -1;

		if(front == -1)
		{
			System.out.println("\nCircular queue Empty!\nNothing to be deleted from the circular queue!");
		}
		else
		{
			data = c_queue[front];

			c_queue[front] = 0;

			System.out.println("\n"+data+" deleted from the circular queue...");

			if(front == rear)
			{
				front = rear = -1;

				return data;
			}

			front++;

			if(front == size)
			{
				front = 0;
			}
		}

		return data;
	}
}

class UseMyCircularQueue
{
	public static void main(String args[])
	{
		CircularQueue cQueue = new CircularQueue(5);

		for(int i = 1; i <= 5; i++)
		{
			cQueue.enqueue(i);
		}

		// for(int i = 1; i <= 5; i++)
		// {
			cQueue.dequeue();
		// }

		cQueue.enqueue(6);

		cQueue.enqueue(7);
	}
}