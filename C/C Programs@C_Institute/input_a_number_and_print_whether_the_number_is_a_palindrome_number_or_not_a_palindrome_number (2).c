#include<stdio.h>
int main()
{
	int n,i=1;
	printf("Enter a number: ");
	scanf("%d",&n);
	while(n!=1)
	{
		if(n%i==0)
			printf("%d\n",i);
			n/=i;
	}
		else
		{
			i++;
		}
	return 0;	
}
