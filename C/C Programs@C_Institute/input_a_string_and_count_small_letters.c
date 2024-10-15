#include<stdio.h>
int main()
{
	char str[100];
	int i,count=0;
	printf("Enter a string:\n");
	gets(str);
	i=0;
	while(str[i]!='\0')
	{
		if(str[i]>='a'&&str[i]<='z')
		count++;
		i++;
	}
	printf("The number of small letters in the string is %d",count);
	return 0;
}
