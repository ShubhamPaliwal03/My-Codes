#include<stdio.h>
int main()
{
	int a,b,sum,div,mul,mod;
	printf("Enter two numbers seperated by spaces : ");
	scanf("%d %d",&a,&b);
	sum=a+b;
	div=a/b;
	mul=a*b;
	mod=a%b;
	printf("\nThe sum is      : %d",sum);
	printf("\nThe division is : %d",div);
	printf("\nThe product is  : %d",mul);
	printf("\nThe modulus is  : %d",mod);
	return 0;
}
