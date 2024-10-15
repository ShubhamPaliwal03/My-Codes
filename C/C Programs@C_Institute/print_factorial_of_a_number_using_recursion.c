#include<stdio.h>
int fact(int n)
{
	if(n<0)
	{
		return n;
	}
	if(n==0)
	{	
		return 1;
	}
	return n*fact(n-1);
}
int main()
{
	int n,f;
	printf("Enter a number: ");
	scanf("%d",&n);
	f=fact(n);
	printf("The factorial of %d is %d",n,f);
	return 0;
}
