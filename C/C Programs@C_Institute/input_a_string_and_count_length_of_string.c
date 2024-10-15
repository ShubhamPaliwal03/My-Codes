#include<stdio.h>
int main()
{
	char str[100];
	int i;
	puts("Enter a string: ");
	gets(str);
	for(i=0;str[i]!='\0';i++);
	printf("%s has %d length",str,i);
	return 0;
}
