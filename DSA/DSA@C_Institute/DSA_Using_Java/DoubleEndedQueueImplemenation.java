class DoubleEndedQueue
{
	private int[] d_queue;

	private int front;

	private int rear;

	public DoubleEndedQueue(int size)
	{
		d_queue = new int[size];

		front = -1;

		rear = -1;
	}

	public void enqueueFront(int data)
	{
		int size = d_queue.length;

		if((front == 0 && rear == size - 1) || front == rear + 1) // checking if the double ended is already full
		{
			System.out.println("\nQueue Exhausted!\n"+data+" cannot be added to the front of the double ended queue!");
		}
		else
		{
			if(front == -1)
			{
				front = rear = 0;

				d_queue[front] = data;
			}
			else if(front == 0)
			{
				front = size - 1;

				d_queue[front] = data;
			}
			else
			{
				front--;

				d_queue[front] = data;
			}

			System.out.println("\n"+data+" added to the front of the double ended queue...");
		}
	}

	public void enqueueRear(int data)
	{
		int size = d_queue.length;

		if((front == 0 && rear == size -1) || front == rear + 1) // checking if the double ended queue is already full
		{
			System.out.println("\nQueue Exhausted!\n"+data+" cannot be addded to the rear of the double ended queue!");
		}
		else
		{
			if(front == -1)
			{
				front = rear = 0;

				d_queue[rear] = data;
			}
			else if(rear == size - 1)
			{
				rear = 0;

				d_queue[rear] = data;
			}
			else
			{
				rear++;

				d_queue[rear] = data;
			}

			System.out.println("\n"+data+" added to the rear of the double ended queue...");
		}
	}

	public int dequeueFront()
	{
		int size = d_queue.length;

		int data = -1;

		if(front == -1) // if the queue is already empty
		{
			System.out.println("\nQueue Empty!\nNothing to be deleted from the front of the double ended queue!");
		}
		else 
		{
			if(front == rear) // if the double ended queue has only one element
			{
				data = d_queue[front];

				d_queue[front] = 0;

				front = rear = -1;
			}
			else if(front == size - 1) // if the front is at the last index of the double ended queue, then we point the front to the starting index of the double ended queue
			{
				data = d_queue[front];

				d_queue[front] = 0;

				front = 0;
			}
			else // increment the front by one, or decrease the size of the double ended queue by 1, whenever we delete an element from the double ended queue
			{
				data = d_queue[front];

				d_queue[front] = 0;

				front++;
			}

			System.out.println("\n"+data+" deleted from the front of the double ended queue...");
		}	

		return data;
	}

	public int dequeueRear()
	{
		int size = d_queue.length;

		int data = -1;

		if(front == -1) // if the queue is already empty
		{
			System.out.println("\nQueue Empty!\nNothing to be deleted from the rear of the double ended queue!");
		}
		else
		{
			if(front == rear) // if the double ended queue has only one element
			{
				data = d_queue[rear];

				d_queue[rear] = 0;

				front = rear = -1;
			}
			else if(rear == 0) // if the rear is at the starting index of the double ended queue, then we point the rear to the last index of the double ended queue
			{
				data = d_queue[rear];

				d_queue[rear] = 0;

				rear = size - 1;
			}
			else // decrement the rear by one, decrease the size of the double ended queue by 1
			{
				data = d_queue[rear];

				d_queue[rear] = 0;

				rear--;
			}

			System.out.println("\n"+data+" deleted from the rear of the double ended queue...");
		}

		return data;
	}

	public void traverseDEQueue()
	{
		System.out.println();

		

		System.out.println("Front : "+front+"\nRear : "+rear);
	}
}

class UseMyDoubleEndedQueue
{
	public static void main(String args[])
	{
		DoubleEndedQueue dq = new DoubleEndedQueue(5);

		dq.enqueueFront(1);

		// 1

		dq.enqueueFront(2);

		// 2 1

		dq.enqueueRear(3);

		// 2 1 3

		dq.enqueueRear(4);

		// 2 1 3 4

		dq.enqueueFront(5);

		// 5 2 1 3 4

		dq.enqueueFront(6);

		// Queue Full

		dq.enqueueRear(7);

		// Queue Full

		// dq.dequeueFront();

		// 2 1 3 4

		// dq.dequeueFront();

		// 1 3 4

		// dq.dequeueRear();

		// 1 3

		// dq.dequeueRear();

		// 1

		// dq.dequeueFront();

		//

		// dq.dequeueRear();

		// Queue Empty

		// dq.dequeueFront();

		// Queue Empty

		dq.traverseDEQueue();
	}	
}