#include<stdio.h>
int main()
{
	/* INITIALIZATION */
	
	int i,arr[100],n;
	
	printf("Enter the size of the array you want to initialize : ");
	scanf("%d",&n);
	
	printf("\nEnter the elements in the array : ");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nArray initialized !\n");
	
	/* TRAVERSAL */
	
	printf("\nThe initialized array is : ");
	
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	
	return 0;
}