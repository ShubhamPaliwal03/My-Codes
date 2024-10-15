#include<stdio.h>
int main()
{
	char str[1000],o,n;
	int i;
	printf("Enter string:");
	gets(str);
	printf("Enter character to be replaced:");
	scanf("%c",&o);
	fflush(stdin);
	printf("Enter the new character:");
	scanf("%c",&n);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]==o)/*'==' compares two values & '=' assigns/puts the value of the left operand into the right operand*/
			str[i]=n;
	}
	printf("String after replacing old character with new character is:\n%s",str);
	return 0;
}

