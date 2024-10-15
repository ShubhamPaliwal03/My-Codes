#include<stdio.h>
int main()
{
	char str[100];
	int i,count=0;
	puts("Enter the string: ");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if(' '!=str[i])
		count++;
	}
	printf("%s have %d length",str,count);
	return 0;
}
