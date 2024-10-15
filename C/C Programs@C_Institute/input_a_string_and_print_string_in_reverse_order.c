#include<stdio.h>
int main()
{
	char str[100];
	int i;
	printf("Enter a string:\n");
	gets(str);
	i=0;
	while(str[i]!='\0')
	{	
		i++;
	}
	printf("The reverse of %s is:\n",str);
	for(i=i-1;i>=0;i--)
	{
		putch(str[i]);
		/*printf("%c",str[i]);*/
	}
	return 0;
}
