#include<stdio.h>
int main()
{
	int n,arr[1024],i,sum=0,mean,median,mode,key=0,freq[100];

	printf("Enter the size of the array : ");
	scanf("%d",&n);

	printf("\nEnter the values in the array : ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}

	for(i=0;i<n;i++)
	{
		sum=sum+arr[i];
	}
	
	mean=sum/n;
	printf("\nMean : %d\n",mean);

	if(n%2==0)/* when the number is even */
	{
		median=arr[(n-1)/2];
		printf("\nMedian : %d",median);
		median=arr[(n+1)/2];
		printf(" , %d",median);
	}
	else/* when the number isn't even,ie.,when it is odd */
	{
		median=arr[n/2];
		printf("\nMedian : %d\n",median);
	}

	return 0;
}