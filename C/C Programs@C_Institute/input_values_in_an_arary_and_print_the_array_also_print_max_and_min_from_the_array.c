#include<stdio.h>
int main()
{
	int arr[10],max,min,i;
	printf("Enter the 10 values in the array:\n");
	for(i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	max=min=arr[0];
	{
		printf("\nThe array is:\n");
		for(i=0;i<10;i++)
		{
			printf("%d\n",arr[i]);
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
	}
	printf("\nMax is %d\nMin is %d",max,min);
	return 0;
}
