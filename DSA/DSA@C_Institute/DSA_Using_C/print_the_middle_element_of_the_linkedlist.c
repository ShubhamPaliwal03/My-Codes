#include<stdio.h>
#include<stdlib.h>
struct LinkedList
{
	int data;
	struct LinkedList *next;	
};
typedef struct LinkedList LinkedList;
LinkedList *start = NULL;

int main()
{
	int n,i;
	LinkedList *node,*temp;
	
	/*code for creating a linkedlist*/
	printf("How many nodes you want to create? : ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		node=(LinkedList*)malloc(sizeof(LinkedList));
		
		printf("\nEnter data you want to enter at node %d of linkedlist: ",i);
		scanf("%d",&node->data);
		
		node->next = NULL;
		if(start==NULL)
		{
			start=node;
		}
		else
		{
			temp=start;
			while(temp->next!=NULL)
			{
				temp=temp->next;
			}
			temp->next=node;
		}
	}
	
	/*code for printing the middle node of the linkedlist*/

	/*using brute force method*/
	temp=start;
	for(i=1;i<=n;i++)
	{
		if(i==(n+1)/2)
		{
			printf("\nThe Middle element of the linkedlist is : %d",temp->data);
			break;
		}
		temp=temp->next;
	}

	/*using optimised two pointer approach*/
//	LinkedList *ptr1,*ptr2;
//	
//	temp=start;
//	while(temp!=NULL)
//	{
//		printf("\n\nTemp : %d",temp);
//		
//		ptr1=temp->next;
//		ptr2=temp->next->next;
//		
//		printf("\n\nPTR1 : %d",ptr1->data);
//		printf("\n\nPTR2 : %d",ptr2->data);
//		
//		if(ptr2->next==NULL)
//		{
//			printf("\nThe Middle element of the linkedlist is : %d",ptr1->data);
//			break;
//		}
//			
//			
//		temp=temp->next;
//	}
	return 0;
}