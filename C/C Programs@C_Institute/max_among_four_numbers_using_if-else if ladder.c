#include<stdio.h>
int main()
{
	int a,b,c,d;
	printf("Enter first number: ");
	scanf("%d",&a);
	printf("Enter second number: ");
	scanf("%d",&b);
	printf("Enter the value of third number: ");
	scanf("%d",&c);
	printf("Enter the value of fourth number: ");
	scanf("%d",&d);
	if(a>b&&a>c&&a>d)
		printf("Max is %d",a);
    else if(b>c&&b>d)
       	printf("Max is %d",b);
    else if(c>d)
       	printf("Max is %d",c);
    else
		printf("Max is %d",d);   	
    return 0;
}
