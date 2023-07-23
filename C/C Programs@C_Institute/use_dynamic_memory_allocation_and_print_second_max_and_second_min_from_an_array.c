#include<stdio.h>
#include<stdlib.h>

int main()
{
	int *p,size,i,max,min,smax,smin;
	
	printf("Enter the size of the array you want to create : ");
	scanf("%d",&size);
	
	p = (int *) malloc (size*sizeof(int));
	
	printf("\nEnter the %d elements into the array : ",size);
	for(i=0;i<size;i++)
	{
		scanf("%d",&p[i]);
	}
	
	max=min=p[0];
	
	for(i=1;i<size;i++)
	{
		if(p[i]>max)
		{
			max=p[i];
		}
		if(p[i]<min)
		{
			min=p[i];
		}
	}
	
	smax=min;
	smin=max;
	
	for(i=0;i<size;i++)
	{	
		if(p[i]>smax && p[i]!=max)
		{
			smax=p[i];
		}
		if(p[i]<smin && p[i]!=min)
		{
			smin=p[i];
		}
	}	
	printf("\nThe Second Max element of the array is : %d",smax);
	printf("\n\nThe Second Min element of the array is : %d",smin);
	
	free(p);
	
	return 0;
}