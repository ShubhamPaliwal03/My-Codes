#include<stdio.h>
int main()
{
	char str[100];
	int i,space_count=0,word_count=0;
	printf("Enter a string:\n");
	gets(str);
	for(i=0;str[i]!='\0';i++)
		if(str[i]==' ')
		space_count++;
		word_count=1+space_count;
	printf("The number of spaces in the string is %d",space_count);
	printf("\nThe number of words in the string is %d",word_count);
	return 0;			
}
