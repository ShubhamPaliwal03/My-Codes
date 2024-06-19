#include<stdio.h>
int main()
{	
	int n;
	printf("Enter a number in Decimal form : ");
	scanf("%d",&n);
	printf("\nThe entered number, %d in Hexadecimal form is : %X",n,n);
	//use %x for output in small caps 
	return 0;
}