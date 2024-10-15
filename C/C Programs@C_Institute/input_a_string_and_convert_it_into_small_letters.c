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
		if(str[i]>='a'&&str[i]<='z')
			str[i]-=32;
			i++;
	}
	printf("The string in capitals is %s",str);
	return 0;
}
