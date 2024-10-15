#include<stdio.h>
int main()
{
	char c;
	printf("Enter a character : ");
	scanf("%c",&c);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
		printf("The character entered is a vowel!\a");
	}
	else
	{
		printf("The character entered is a constant!");
	}
	return 0;
}
