#include<stdio.h>
int main()
{
	int arr[100],i,j,size,n,temp,max_sum=0;
	
	printf("Enter the size of the array : ");
	scanf("%d",&size);
	
	printf("\nEnter the %d elements into the array : ",size);
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nEnter the number of elements of the array you want to contribute in generation of the maximum possible sum : ");
	scanf("%d",&n);
	
	/*implementing straight selecetion sort*/
	for(i=0;i<size-1;i++)
	{
		for(j=i+1;j<size;j++)
		{
			/*sorting the elements in descending order so that we can choose the required elements to obtain maximum possible sum*/
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(i=0;i<n;i++)
	{
		max_sum=max_sum+arr[i];
	}
	
	printf("\nThe Maximum Possible Sum obtained by using %d elements of the array entered is : %d\n",n,max_sum);
	printf("\nThe elements used are : ");
	for(i=0;i<n;i++)
	{
		if(i!=n-1)/*to obtain correct order of commas (like 1,2,3 and not 1,2,3,)*/
		{
			printf("%d,",arr[i]);
		}
		else
		{
			printf("%d",arr[i]);
		}
	}
	
	return 0;
}