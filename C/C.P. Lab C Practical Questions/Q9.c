#include<stdio.h>
int main()
{
	int a,b;
	printf("Enter two numbers seperated by spaces : ");
	scanf("%d %d",&a,&b);
	/*a=a+b;
	b=a-b;
	a=a-b;*/
	a=a*b;
	b=a/b;
	a=a/b;
	printf("\nThe values after swapping are : ");
	printf("\na = %d",a);
	printf("\nb = %d",b);
	return 0;
}
