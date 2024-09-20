#include<stdio.h>
int main()
{
	char s,c;
	printf("Enter the small case alphabet: ");
	scanf("%c",&s);
	c=s-32;
	printf("The capital alphabet is %c",c);
	return 0;
}
