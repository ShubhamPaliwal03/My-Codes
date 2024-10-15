#include<stdio.h>
int main()
{
	int n,arr[1024],i,sum=0,mean,median,mode,key=0,freq[100],j;

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
	printf("\nMean	 : %d\n",mean);
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
		printf("\nMedian	 : %d\n",median);
	}

	mode=0;
	for(i=0;i<n;i++)
	{
		key=arr[i];/* assigning every element as key */

		for(j=0;j<n;j++)
		{
			if(arr[j]==key)/* and checking the frequency of that element in the array */
			{
				freq[j]++;
			}

			if(freq[j]>mode)/* finding the element which has max frequency (mode) */
			{
				mode=arr[j];
			}
		}
	}	
	printf("\nMode	 : %d",mode);
	return 0;

//	int j;
//		for(j=0;j<i;j++)
//		{
//			if(freq[i]==freq[j])
//			{
//				printf("Mode cannot be calculated because every element has the same frequency!");
//				break;
//			}
//			if(freq[i]!=freq[j])
//			{
//				printf("Mode	 : %d",mode);
//				break;
//			}		
//		}
}