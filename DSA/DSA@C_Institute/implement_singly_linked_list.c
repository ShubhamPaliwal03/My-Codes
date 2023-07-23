#include<stdio.h>
#include<stdlib.h>

struct LinkedList
{
	int data;
	struct LinkedList *next;
};

typedef struct LinkedList LinkedList;

LinkedList *start = NULL; // declared as global

int main()
{
	int n,i,choice,con,pos,count,val;
	
	LinkedList *node,*temp; // declared as local
	
	do
	{
		
		system("cls");
		printf("\nSelect the operation which you would like to perform from the following :\n");
		printf("\n1.Create\n2.Display\n3.Insert at Beginning\n4.Insert at Last\n5.Insert at Middle\n6.Delete from Beginning\n7.Delete from Last\n8.Delete from Middle\n9.Count\n10.Search\n");
		printf("\nEnter your choice (1-10) : ");
		scanf("%d",&choice);
		
		switch(choice)
		{
			case 1 : // Create
			
				printf("\nEnter the number of nodes you want to create in the Linked List : ");
				scanf("%d",&n);
				
				for(i=1;i<=n;i++)
				{
					node = (LinkedList*)malloc(sizeof(LinkedList)); // creating a new node by dynamically giving memory to it
					
					printf("\nEnter the data you want to store in node %d : ",i);
					scanf("%d",&node->data);
					
					node->next=NULL;
					
					if(start==NULL)
					{
						start=node;
					}
					else
					{
						temp = start;
						
						while(temp->next!=NULL)
						{
							temp=temp->next;				
						}				
						
						temp->next=node;
					}
				}
			
			break;
			
			case 2 : // Display
			
				if(start==NULL)
				{
					printf("\nLinked List Empty!\n");
				}
				else
				{
					printf("\nThe Linked List is : ");
					
					temp=start;
					
					while(temp!=NULL)
					{
						if(temp->next!=NULL) // ie., if we are not printing the last node of the linked list, we print with '->' 
						{
							printf("%d -> ",temp->data);
						}
						else // ie., if we are printing the last node of the linked list, we don't print '->'
						{
							printf("%d",temp->data);
						}
						
						temp=temp->next;
					}
					
					printf("\n");
				}
			
			break; //Insert at Beginning
			
			case 3 :
				
				node = (LinkedList*)malloc(sizeof(LinkedList)); // creating a new node by dynamically giving memory to it			
				
				printf("\nEnter the data you want to store in node %d : ",1);
				scanf("%d",&node->data);
				
				node->next = start;
				
				start=node;
				
			break;	
			
			default :
				
				printf("\nPlease select a valid choice (1-10) !\n");	
		}	
		
		printf("\nPress 1 to continue\nPress any other num key(s) to exit\n");
		scanf("%d",&con);
		
	}while(con==1);
	
	return 0;
}