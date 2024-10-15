#include<stdio.h>
int main()
{
	int i,n;
	printf("Enter the value of n: ");
	scanf("%d",&n);
	{
		for(i=0;i<=n;i++)
		if(i==n)
		printf("%d",i);
		else
		printf("%d\n",i);
	}
	return 0;
}
