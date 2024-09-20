#include<stdio.h>
int main()
{
	int n,m,i;
	printf("Enter the number whose table is to be printed: ");
	scanf("%d",&n);
	for(i=n,n=1;n<=12;n++)
	{	m=i*n;
		printf("The table is %d\n",i,n,m);
	}
	return 0;
	
}
