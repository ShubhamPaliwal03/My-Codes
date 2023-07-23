#include<stdio.h>
int main()
{
	int a,b,c;
	printf("Enter two numbers seperated by spaces : ");
	scanf("%d %d",&a,&b);
	c=a;
	a=b;
	b=c;
	printf("\nThe values after swapping are : ");
	printf("\na = %d",a);
	printf("\nb = %d",b);
	return 0;
}
