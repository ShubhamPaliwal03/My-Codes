#include<stdio.h>
#include<stdlib.h>
#define SIZE 1024
int main()
{
	int arr[SIZE],i,size,choice,con,data,pos;
	do
	{
		system("cls");
		printf("Welcome to one stop destination for all array operations : \n");
		printf("\nWhich operation would you like to perform from the following : \n");
		printf("\n1.Initialization\n2.Traversing\n3.Insertion\n4.Deletion\n\n");
		scanf("%d",&choice);
	
		switch(choice)
		{
			case 1:
				
				printf("\nEnter the size of the array : ");
				scanf("%d",&size);
				printf("\nEnter the elements in the array : ");
				for(i=0;i<size;i++)
				{
					scanf("%d",&arr[i]);	
				}
				printf("\nArray initialized successfully !");
				break;
			
			case 2:
				
				printf("\nThe elements of the array are as follows : ");
				for(i=0;i<size;i++)
				{
					printf("%d ",arr[i]);
				}
				break;
		
			case 3:
				printf("Enter the element you want to insert in the array : ");
				scanf("%d",&data);
				printf("Enter the position at which you want to insert the element : ");
				scanf("%d",&pos);
				
				for(i=size-1;i>=pos;i--)
				{
					arr[i]=arr[i-1];
				}
				arr[pos-1]=data;
				
				printf("%d inserted at index %d of array!",data,pos);
				break;
			
			case 4:
				printf("Enter the position where you want to perform deletion : ");
				scanf("%d",&pos);
				
				for(i=pos-1;i<size-1;i++)
				{
					arr[i]=arr[i+1];	
				}
				arr[i]=0;
				printf("%d deleted from position %d of array",arr[pos-1],pos);
				
				break;
				
			default :
				printf("\nPlease enter a valid choice(1-6)!");
				break;

		}
		
	printf("\n\nPress 1 to continue and any other key to exit !\n");
	scanf("%d",&con);
	if(!con>=48 && !con<=57)
	{
		/*to handle corner case when an infinite loop can run if user enters any key other than a num key*/
		break;
	}
	
	}while(con==1);
	
	return 0;
}