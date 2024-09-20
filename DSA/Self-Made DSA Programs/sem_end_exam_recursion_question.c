#include<stdio.h>

void print(int n)
{
	printf("%d",n);
}

void f(int n)
{
	if(n<1)
	{
		return;
	}
	
	print(n);
	
	f(n-1);
	
	print(n);
}

int main()
{
	f(3);
	
	return 0;
}