#include<stdio.h>
int main()
{
	int n,i,a[1024],min,max;
	printf("Enter the size of the array : ");
	scanf("%d",&n);
	printf("Enter the elements of the array : ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	min=max=a[0];
	for(i=1;i<n;i++)
	{
		
		if(a[i]>max)
		{
			max=a[i];
		}
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	printf("The max element is : %d\n",max);
	printf("The min element is : %d\n",min);
	return 0;
}