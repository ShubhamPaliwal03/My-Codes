#include<stdio.h>
int main()
{
	char str[100],count;
	int i;
	printf("Enter a string:\n");
	gets(str);
	for(i=0;str[i]!='\0';i++)
		if(str[i]==' ')
	/*To denote space,' ' or 32 is used
	and to denote null character,'\0' or 0 or NULL is used
	and declare their data types carefully*/
		count++;
	printf("The number of spaces in the string is %d",count);
	return 0;
}
