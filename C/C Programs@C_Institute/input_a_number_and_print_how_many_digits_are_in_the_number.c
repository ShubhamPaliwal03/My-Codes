#include<stdio.h>
int main()
{
	int n,count=0;
	printf("Enter a number: ");
	scanf("%d",&n);
	while(n)
	{	count++;
		n=n/10;
	}
	printf("The number has %d digits",count);
	return 0;
}
