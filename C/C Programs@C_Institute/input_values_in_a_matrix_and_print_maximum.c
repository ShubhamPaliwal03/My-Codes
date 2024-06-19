#include<stdio.h>
int main()
{
	int m[3][2],i,j,max=0;
	printf("\nEnter the values in the matrix:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<2;j++)
		scanf("%d",&m[i][j]);
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<2;j++)
		if(m[i][j]>max)
		max=m[i][j];
	}
	printf("\nThe maximum value present in the matrix is %d",max);
	return 0;
}
