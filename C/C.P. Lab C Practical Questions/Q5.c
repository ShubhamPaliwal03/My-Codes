#include<stdio.h>
int main()
{
	int a,b,r,q;
	printf("Enter two numbers seperated : ");
	scanf("%d %d",&a,&b);
	r=a%b;
	printf("\nThe remainder is : %d",r);
	q=a/b;
	printf("\nThe quotient is : %d",q);
	return 0;
}
