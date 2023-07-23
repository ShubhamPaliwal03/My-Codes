#include<stdio.h>
int main()
{
	int i=1,n;
		printf("Enter the value till which the counting has to be done: ");
		scanf("%d",&n);
	do
	{
		printf("%d",i);
		i++;
	}
	while(i<=n);
	return 0;
}
