#include<stdio.h>
int main()
{
	int a=10;
	int b=20;
	int c=(a++,b++)?a+3:a-3;
	printf("%d %d %d",a,b,c);
	return 0;
}
