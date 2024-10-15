#include<stdio.h>
int main()
{
	int n;
	printf("Enter a number: ");
	scanf("%d",&n);
	if(n/10==0)
		printf("1 digit number");
	else if(n/100==0)
		printf("2 digit number");
	else if(n/1000==0)
		printf("3 digit number");
	else
		printf("More than 3 digit");
return 0;				
}
