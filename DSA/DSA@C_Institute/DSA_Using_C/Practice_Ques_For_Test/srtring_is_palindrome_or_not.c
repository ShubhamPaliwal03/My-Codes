#include<stdio.h>

int main()
{
	char str[100];
	int len,i,j;
		
	printf("Enter the string you want to check for being a palindrome or not : ");
	gets(str);
	
	for(i=0;str[i]!='\0';i++);
	len=i;
	
	for(i=0,j=len-1;i<j;i++,j--)
	{
		if(str[i]!=str[j])
		{
			printf("\nString is Not a paindrome!");
			break;
		}
	}
	
	if(i==j)
	{
		printf("\nString is a Palindrome!");
	}
	
	return 0;
}