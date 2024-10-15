#include<stdio.h>

int main()
{
	char str[100];
	int i;
	
	printf("Enter the string whose length has to be calculated : ");
	scanf("%[^\n]s",str);
//	gets(str);

	for(i=0;str[i]!='\0';i++);
	
	printf("The length of the string is : %d",i);
	
	return 0;
}