#include<stdio.h>
int main()
{
	char str[100];
	FILE *fp=fopen("string.txt","r");
	if(fp==NULL)
		printf("\nFile opening failed");
	else
	{
		fgets(str,99,fp);
		/*Similarly,fscanf can also be used to take input of a string from the user:
		fscanf(fp,"%[^\n]s",&str);
		*/
		
		/*fprintf(stdout,"%s",str); Used to print the string stored in the file directly on the screen,
		we use stdout instead of file pointer as 1st argument of fprintf()
		
		fscanf(stdin,"%s",str); Used to take the input of a string in the file directly from the user,
		we use stdin instead of file pointer as 1st argument of fprintf()
		*/
		printf("String read from file : %s",str);
		fclose(fp);
	}
}
