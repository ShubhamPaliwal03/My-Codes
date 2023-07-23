#include<stdio.h>
int main()
{
	int n,i,f=1;
	printf("Enter a number: ");
	scanf("%d",&n);
	i=n;
	while(i>=1)
	{
		f=f*i;
        i--; 
	}
	printf("Factorial of %d is %d",n,f);
	return 0;		
}
