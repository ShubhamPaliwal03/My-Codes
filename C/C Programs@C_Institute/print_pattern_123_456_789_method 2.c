#include<stdio.h>
int main()
{
	int i,j;
	for(i=0;i<3;i++)
	{
		for(j=i*3+1;j<=i*3+3;j++)
		{
			printf("%d",j);
		}
		printf("\n");
	}
	return 0;
}
