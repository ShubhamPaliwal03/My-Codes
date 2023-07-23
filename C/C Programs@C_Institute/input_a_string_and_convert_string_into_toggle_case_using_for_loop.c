#include<stdio.h>
int main()
{
	char str[100];
	int i;
	printf("Enter a string:\n");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]>='a'&&str[i]<='z')
			str[i]-=32;
		else
			if(str[i]>='A'&&str[i]<='Z')
				str[i]+=32;	
	}
	printf("The string in toggle case is %s",str);
	return 0;
}
