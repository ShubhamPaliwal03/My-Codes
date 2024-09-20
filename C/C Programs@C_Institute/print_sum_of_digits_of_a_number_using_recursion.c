#include<stdio.h>
int sum_of_digits(int n)
{
	if(n==0)
		return 0;
	else
		return (n%10)+sum_of_digits(n/10);	
}
int main()
{
	int n,s=0;
	printf("Enter a number: ");
	scanf("%d",&n);
	s=sum_of_digits(n);
	printf("The sum of the digits of the number %d is %d",n,s);
	return 0;
}
