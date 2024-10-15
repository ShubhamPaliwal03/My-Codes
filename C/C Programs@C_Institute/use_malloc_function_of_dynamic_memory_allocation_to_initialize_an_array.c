#include<stdio.h>
#include<stdlib.h>
int main()
{
	int *p,size,i;
	
	printf("Enter the size of the array you want to create : ");
	scanf("%d",&size);
	
	p = (int *) malloc (size*sizeof(int));
	
	printf("\nEnter the %d values into the array : ",size);
	for(i=0;i<size;i++)
	{
		scanf("%d",&p[i]);
	}
	
	printf("\nThe %d values stored in the array are : ",size);
	for(i=0;i<size;i++)
	{
		printf("%d ",p[i]);
	}
	
	free(p);
	
	return 0;
}