#include<stdio.h>
int main()
{
	float a,b,sum;
	printf("Enter two numbers seperated by spaces : ");
	scanf("%f %f",&a,&b);
	sum=a+b;
	printf("The sum is %.2f",sum);
	return 0;
}
