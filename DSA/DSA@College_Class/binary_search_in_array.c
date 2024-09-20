#include<stdio.h>
int main()
{
	int n,arr[1024],low,high,mid,i,key;
	
	printf("Enter the size of the array : ");
	scanf("%d",&n);
	
	printf("\nEnter the elements of the array : ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nEnter the element you want to search in the array : ");
	scanf("%d",&key);
	
	low=0;
	high=n-1;
	
	while(low<=high)
	{
		mid=(low+high)/2;
		/*needs to be present inside the loop because mid needs to be updated again and again acc. to varying values of low & high*/
		
		if(arr[mid]==key)
		{
			printf("\nRequired element %d found in the array entered at %d index !",key,mid);
			break;
		}
		else if(key>arr[mid])
		{
			low=mid+1;
		}
		else/*if key<arr[mid]*/
		{
			high=mid-1;
		}
	}
	if(low>high)
	{
		printf("\nRequired element %d not found in the array entered !");
	}
	return 0;
}