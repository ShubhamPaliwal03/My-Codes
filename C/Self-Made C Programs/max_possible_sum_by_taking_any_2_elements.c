

/*This code is based on an inefficient brute force approach which doesn't work on n elements
REFER to the program named 'max_possible_sum_by_taking_n_elements_of_an_array' which is present in the same folder*/

#include<stdio.h>
int main()
{
	int arr[100],size,i,j,sum=0,max_sum=0,e1,e2;
	
	printf("Enter the size of the array : ");
	scanf("%d",&size);
	
	printf("\nEnter the %d elements into the array : ",size);
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			sum=arr[i]+arr[j];
			if(sum>max_sum)
			{
				max_sum=sum;
				e1=arr[i];
				e2=arr[j];
			}
		}
	}
	
	printf("\nThe Maximum Sum of two elements in the array is : %d and it is obtained by using %d,%d",max_sum,e1,e2);
	return 0;
}