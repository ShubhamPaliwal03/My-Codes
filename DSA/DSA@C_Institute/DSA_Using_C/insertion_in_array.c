#include<stdio.h>
#define SIZE 100
int main()
{
	/* Here, we are not increasing the size because we are taking the standard case in which either array is predefined
   	or the size if array is predefiend and we have created an array of maximum elements possible */
   	
	int size,i,data,pos,arr[SIZE];
	
	printf("Enter the size of the array : ");
	scanf("%d",&size);
	
	printf("\nEnter the elements in the array : ");
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);/* you can also use arr+i or i+arr instead of &arr[i] */
	}
	
	printf("\nEnter the data you want to insert : ");
	scanf("%d",&data);
	
	printf("\nEnter the position where you want to insert the data : ");	
	scanf("%d",&pos);
	
	for(i=size-1;i>=pos;i--)
	{
		arr[i]=arr[i-1];
	}
	
	arr[pos-1]=data;
	
	printf("\nAfter inserting new data %d at index number %d or position %d, the array is : ",data,pos-1,pos);
	
	for(i=0;i<size;i++)
	{
		printf("%d ",arr[i]);
	}
	return 0;
}