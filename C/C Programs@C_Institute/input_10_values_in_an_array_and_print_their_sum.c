#include<stdio.h>
int main()
{
	int arr[10],i,sum =0;
	printf("Enter the 10 values of the array:\n");
	for(i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
		sum=sum+arr[i];
	}
	printf("\nSum is %d",sum);
	return 0;
}
