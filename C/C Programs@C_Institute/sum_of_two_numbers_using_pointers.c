#include<stdio.h>
int main()
{
	int a,b,sum;
	int *p1=&a,*p2=&b;
	printf("Enter the value of a: ");
	scanf("%d",p1);
	printf("Enter the value of b: ");
	scanf("%d",p2);
	sum=*p1+*p2;
	printf("The sum of a and b is %d",sum);
	return 0;
}
