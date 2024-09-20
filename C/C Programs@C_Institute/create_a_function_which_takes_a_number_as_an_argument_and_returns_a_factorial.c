#include<stdio.h>
long long int getfactorial(int n)
{
	long long int f=1;
	int i;
	i=n;
	while(i>=1)
	{
		f=f*i;
		i--;
	}
	return f;
}
int main()
{
	long long int f;
	int n;
	printf("Enter a number:\n");
	scanf("%d",&n);
	f=getfactorial(n);
	printf("The factorial of %d is %lld",n,f);
	return 0;
}
