#include <stdio.h>
int main()
{
	int i;
	for(i=1;i<=9;i++)
	{
		printf("%d",i);
		if(i%3==0)
		printf("\n");
	}
}
