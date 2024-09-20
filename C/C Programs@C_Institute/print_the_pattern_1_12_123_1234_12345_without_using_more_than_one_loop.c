#include<stdio.h>
int main()
{
	int i;
	for(i=1;i<=12345;i=i*10+i%10+1)
	{
		printf("%d\n",i);
	}
	return 0;
}
