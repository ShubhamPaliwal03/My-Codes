#include<stdio.h>
int main()
{
	char i;
	int j;
	for(i='A';i<='E';i++)
	{
		for(j='E';j>i;j--)
		{
			printf(" ");
		}
		for(j=1;j<=(i-64)*2-1;j++)
		{
			printf("%c",i);
		}
		printf("\n");
	}
	return 0;
}
