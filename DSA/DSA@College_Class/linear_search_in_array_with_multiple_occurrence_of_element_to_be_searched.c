#include<stdio.h>
int main()
{
	int n,key,arr[1024],i,count=0;
	
	printf("Enter the size of the array : ");
	scanf("%d",&n);
	
	printf("\nEnter the elements in the array : ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nEnter the element to be searched : ");
	scanf("%d",&key);
	
	for(i=0;i<n;i++)
	{
		if(arr[i]==key)
		{
			printf("\nSearched element %d found in the array entered at index number %d or position %d\n",key,i,i+1);
			count++;
		}
		else/*if(arr[i]!=k)*/
		{
			if(i>=n-1)
			/* i==n is set here as condition because when the loop will check the condition for the last element of the array
			and the final increment of i will take place which will be equal to n as array is indexed from number 0 to n-1 
			and still the element will not be found,then it clearly means that the element is not present in the array entered */
			{
				if(count>0)
				{
					break;
				}
				printf("\nSearched element %d not found in the array entered",key);
				break;
				/*break is used here to prevent loop for running over again and again as per the condition 
				and to avoid multiple statements enclosed in printf statement being shown in output*/
			}
		}
	}
	return 0;
}