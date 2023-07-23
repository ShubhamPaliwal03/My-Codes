#include<stdio.h>
int main()
{
	int a,b,c;
	printf("Enter first number: ");
	scanf("%d",&a);
	printf("Enter second number: ");
	scanf("%d",&b);
	printf("Enter the value of third number: ");
	scanf("%d",&c);
	if(a>b&&a>c)
		printf("Max is %d",a);
    else if(b>c)
       	printf("Max is %d",b);
    else
       	printf("Max is %d",c);
    return 0;
}
