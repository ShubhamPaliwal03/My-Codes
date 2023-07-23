#include<stdio.h>
void table_of_a_number(int i,int n,int m)
{
	printf("The table of the number is:\n");
	for(i=n,n=1;n<=12;n++)
	{
		m=i*n;
		printf("%d\n",m);
	}
}
int main()
{
	int i,n,m;
	printf("Enter a number: ");
	scanf("%d",&n);
	table_of_a_number(i,n,m);
	return 0;
}
