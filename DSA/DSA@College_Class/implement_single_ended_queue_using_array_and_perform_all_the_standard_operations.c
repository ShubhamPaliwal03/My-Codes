#include<stdio.h>
#include<stdlib.h>
#define SIZE 5

int main()
{
	int queue[SIZE],front=-1,rear=-1,data,choice,con;
	
	do
	{
		system("cls");
		printf("\nSelect the operation you want to perform :\n");
		printf("\n1.Enqueue\n2.Dequeue\n\nEnter your choice (1-2) : ");
		scanf("%d",&choice);
		
		switch(choice)
		{
			case 1 : // Enqueue
				
				printf("\nEnter the data you want to add to the queue : ");
				scanf("%d",&data);
				
				if(rear==SIZE-1) // when the queue is full
				{
					printf("\nQueue Exhausted (Queue Overflow/Queue Full)!\n%d cannnot be added to the queue!",data);
				}
				else
				{
					if(front==-1) // when the queue is empty
					{	
						front=rear=0;
						queue[rear]=data;
					}
					else // when the queue contains one or more than one element
					{
						rear++;
						queue[rear]=data;
					}
					printf("\n%d added to the queue",data);
				}
				
			break;
				
				case 2 : // Dequeue
				
					if(front==-1) // when the queue is empty
					{
						printf("\nQueue Empty!\nNothing to be deleted from the queue!");
					}
					else // when the queue is partially filled
					{
						data=queue[front];
						queue[front]=0;
						
						front++;
						
						printf("\n%d deleted from the queue",data);
						
						if(front>rear) // ie., the queue is empty now and we need to reset both the front and the rear to -1
						{
							front=rear=-1;
						}
					}
					
				break;
				
				default : // when the user inputs out of bound choice
					
					printf("\nInvalid choice entered! Please enter a valid choice (1-2)!");
		}
		
		printf("\n\nPress 1 to continue and press any other num key(s) to exit : ");
		scanf("%d",&con);
			
	} while(con==1);
	
	return 0;
}