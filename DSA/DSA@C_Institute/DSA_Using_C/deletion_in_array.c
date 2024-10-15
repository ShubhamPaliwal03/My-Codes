#include<stdio.h>
int main()
{
	int i,size,data,pos,arr[100];
	
	printf("Enter the size of the array : ");
	scanf("%d",&size);
	
	printf("\nEnter the elements in the array : ");
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);	
	}
	
	printf("\nEnter the position at which you want to perform deletion : ");
	scanf("%d",&pos);
	
	for(i=pos-1;i<size-1;i++)
	{
		arr[i]=arr[i+1];
	}
	arr[i]=0;
	
	printf("\nAfter deleting the value from position %d or index number %d, the array is : ",arr[pos-1],pos,pos-1);
	
	for(i=0;i<size;i++)
	{
		printf("%d ",arr[i]);
	}
	return 0;
}