#include<stdio.h>
int main()
{
	int n=0,sum=0;
	do
	{
		sum=sum+n;
		n=n+2;
	}
	while(n<=100);
	printf("The sum of all even numbers from 1 to 100 is %d",sum);
	return 0;
}
