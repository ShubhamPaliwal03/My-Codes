#include<stdio.h>
int power_of_a_number()
{
	int a,b,p=1;
	printf("Enter the number : ");
	scanf("%d",&a);
	printf("Enter the power : ");
	scanf("%d",&b);
	while(b!=0)
	{
		p=p*a;
		b--;
	}
	return p;
}
int main()
{
	int p=power_of_a_number();
	printf("\nThe value of a to the power b is %d",p);
}
