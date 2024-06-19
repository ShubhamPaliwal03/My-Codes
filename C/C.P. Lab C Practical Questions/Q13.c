#include<stdio.h>
int main()
{
	int n,i,sum=0;
	printf("Enter the number(s) till which sum is to calculated : ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	printf("\nThe Sum is %d",sum);
	return 0;
}
