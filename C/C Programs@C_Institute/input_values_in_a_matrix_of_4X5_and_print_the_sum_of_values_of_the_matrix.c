#include<stdio.h>
int main()
{
	int m[4][5],i,j,sum;
	printf("\nEnter the values in the matrix:\n");
	for(i=0;i<4;i++)
	{	
		for(j=0;j<5;j++)
			scanf("%d",&m[i][j]);
	}
	for(i=0;i<4;i++)
	{
		for(j=0;j<5;j++)
			sum=sum+m[i][j];
	}
	printf("\nThe sum is %d",sum);
	return 0;
}
