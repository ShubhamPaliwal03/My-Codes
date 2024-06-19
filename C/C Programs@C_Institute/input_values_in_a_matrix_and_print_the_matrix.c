#include<stdio.h>
int main()
{
	int m[3][3],i,j;

	printf("\nEnter the values in the matrix:\n");
	for(i=0;i<3;i++)
	{	
		for(j=0;j<3;j++)
			scanf("%d",&m[i][j]);
	}

	printf("\nThe values in the matrix are:\n");
	for(i=0;i<3;i++)	
	{
		for(j=0;j<3;j++)
			printf("%d\t",m[i][j]);/*\t is an escape sequence and it is used here for giving tab spacing after printing every 3 elements*/
		printf("\n");
	}
	return 0;
}
