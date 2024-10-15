#include<stdio.h>
int  main()
{
	int arr[10],i,sum=0;
	printf("Enter the 10 values in the array:\n");
	for(i=0;i<10;i++)
	{
		scanf("%d",arr[i]);
		if(arr[i]%2==0)
		sum=sum+arr[i];
	}
	return 0;
}
