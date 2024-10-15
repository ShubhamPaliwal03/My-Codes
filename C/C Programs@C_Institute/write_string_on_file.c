#include<stdio.h>
int main()
{
	char str[100];
	FILE *fp=fopen("string.txt","w");
	if(fp==NULL)
		printf("\nFile opening failed");
	else
	{
		printf("Enter a string to enter on file : ");
		scanf("%[^\n]s",str);//We can also use gets function here
		fprintf(fp,"%s",str);
		fclose(fp);
	}
	return 0;
}
