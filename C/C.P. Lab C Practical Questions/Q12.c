#include<stdio.h>
int main()
{
	int a,b,c;
	printf("Enter the value of a : ");
	scanf("%d",&a);
	printf("Enter the value of b : ");
	scanf("%d",&b);
	printf("Enter the value of c : ");
	scanf("%d",&c);
	if(a>b)
	{
		if(a>c)
		{
			printf("Max is a");
		}
	}
	else
	{
		if(b>c)
		{
			printf("Max is b");
		}
		else
		{
		printf("Max is c");
		}
	}
	return 0;
}
