#include<stdio.h>
int main()
{
	int arr[100],size,i,low,high,mid,data;
	
	printf("Enter the size of the array : ");
	scanf("%d",&size);
	
	printf("\nEnter the elements in the array : ");
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nEnter the value to be searched : ");
	scanf("%d",&data);
	
	low=0;
	high=size-1;
	
	while(low<=high)
	{
		mid=(low+high)/2;
		/*needs to be present inside the loop because mid needs to be updated again and again acc. to varying low & high*/
		
		if(arr[mid]==data)
		{
			printf("\nSearched data %d found in the array at position %d or index %d",data,mid+1,mid);
			break;
		}
		else if(data>arr[mid])
		{
			low=mid+1;
		}
		else/*if data<arr[mid]*/
		{
			high=mid-1;
		}
	}
	if(low>high)
	{
		printf("\nSearched data %d not found in the array");
	}
	return 0;
}