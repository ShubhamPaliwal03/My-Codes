#include<stdio.h>
int main()
{
	int a,b,c,product;
	int *p1=&a,*p2=&b,*p3=&c;
	printf("Enter the value of a: ");
	scanf("%d",p1);
	printf("Enter the value of b: ");
	scanf("%d",p2);
	printf("Enter the value of c");
	scanf("%d",p3);
	product=(*p1)*(*p2)*(*p3);
	printf("The product of a,b and c is %d",product);
	return 0;
}
