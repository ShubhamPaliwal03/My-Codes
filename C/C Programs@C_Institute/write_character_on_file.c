#include<stdio.h>
int main()
{
	char s;
	FILE *fp=fopen("character.txt","w");
	if(fp==NULL)
		printf("\nFile opening failed!");
	else
	{
		printf("Enter character to write on the file : ");
		scanf("%c",&s);
		fprintf(fp,"%c",s);
		fclose(fp);
	}
	return 0;
}
