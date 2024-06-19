#include<stdio.h>
int main()
{
	char str[1000],o,n;
	int i,count=0;
	printf("Enter string:");
	gets(str);
	printf("Enter the character to be replaced:");
	scanf("%c",&o);
	fflush(stdin);
	printf("Enter the new character:");
	scanf("%c",&n);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]==o)
			count++;
			str[i]=n;
	}
	printf("The number of characters replaced is:\n%d",count);
	return 0;
}
