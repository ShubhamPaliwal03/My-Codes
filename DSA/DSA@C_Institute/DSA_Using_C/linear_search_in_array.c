#include<stdio.h>
int main()
{
	int arr[100],data,i,size;
	
	printf("Enter the size of the array : ");
	scanf("%d",&size);
	
	printf("\nEnter the elements in the array : ");
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nEnter the data you want to search in the array : ");
	scanf("%d",&data);
	
	for(i=0;i<size;i++)
	{
		if(arr[i]==data)
		{
			printf("\nSearched data %d found at index %d or position %d of the array",data,i,i+1);
			break;
		}
	}

	if(i==size)
	{
		printf("\nSearched data %d not found in the given array",data);
	}
	
	return 0;
}