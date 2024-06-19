#include<stdio.h>
int main()
{
	int arr[1024],i,n,x,pos;
	printf("Enter the size of the array : ");
	scanf("%d",&n);
	
	printf("\nEnter the elements of the array : ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nEnter the new element to be inserted in the array : ");
	scanf("%d",&x);
	
	printf("\nEnter the position at which you want to insert the new element : ");
	scanf("%d",&pos);
	
	//increasing the size of the array by one
	n++;
	
	//shifting the elements forward
	for(i=n-1;i>=pos;i--)
	{
		arr[i]=arr[i-1];
	}
	
	//insert x at pos
	arr[pos-1]=x;
	
	printf("\nAfter inserting new element %d at index number %d or position %d, the array is : ",x,pos-1,pos);
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	return 0;
}