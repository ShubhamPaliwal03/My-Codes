#include<stdio.h>
int palindrome_of_a_number(int n)
{
	int m,r=0,t=n;
	while(n!=0)
	{
		m=n%10;
		r=r*10+m;
		n=n/10;
	}
	return t==r;
	//We can also use if-else statement,but this method is more optimised 
}
int main()
{
	int n;
	printf("Enter the number:\n");
	scanf("%d",&n);
	if(palindrome_of_a_number(n))
		printf("Palindrome");
	else
		printf("Not a palindrome");
	return 0;	
}
