#include<stdio.h>
int main()
{
	char s;
	FILE *fp=fopen("character.txt","r");
	if(fp==NULL)
		printf("\nFile opening failed!");
	else
	{
		s=fgetc(fp);
		printf("Character read from file is : ");
		putch(s);
		fclose(fp);
	}
	return 0;
}
