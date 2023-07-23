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
		
		if(arr[mid]==data)
		{
			while(arr[mid-1]==arr[mid] && mid>0)
			{
				mid--;
			}
			while(arr[mid]==data)
			{
				printf("\narr[%d] = %d",mid,arr[mid]);
				mid++;
			}
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
		printf("\nSearched value %d not found in the array",data);
	}
	return 0;
}