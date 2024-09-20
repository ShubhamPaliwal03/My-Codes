#include<stdio.h>
int main()
{
	int arr[100],size,i,low,high,mid,data;
	
	printf("Enter the size of the array : ");
	scanf("%d",&size);
	
	printf("\nEnter the %d elements in the array : ",size);
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
		
		if(arr[mid]==data)
		{
			printf("\nSearched value %d found at position %d or index %d in the array",data,mid+1,mid);
			break;
		}
		else if(arr[low]<=arr[mid])
		{
			/*left part sorted*/
			if(data>=arr[low] && data<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		else
		{
			/*right part sorted*/
			if(data>arr[mid] && data<=arr[high])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
	}
	if(low>high)
	{
		printf("\nSearched value %d not found in the array",data);
	}
	return 0;
}