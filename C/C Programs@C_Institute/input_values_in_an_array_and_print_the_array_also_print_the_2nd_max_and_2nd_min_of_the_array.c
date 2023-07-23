#include<stdio.h>
int main()
{
	int arr[10],max,min,second_max,second_min,i;
	printf("Enter the 10 values in the array:\n");
	for(i=0;i<10;i++)
		scanf("%d",arr[i]);
	
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
	
	second_max=second_min=arr[0];
	{
		for(i=0;i<10;i++)
		{
			if(arr[i]>second_max!=max)
				second_max=arr[i];
			if(arr[i]<second_min!=min)
				second_min=arr[i];
		}
	}
	printf("\nSecond_max is %d\nSecond_min is %d",second_min,second_max);	
	return 0;
}
