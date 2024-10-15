#include<stdio.h>
int main()
{
	int n;
	FILE *fp=fopen("number.txt","w");
	if(fp==NULL)
		printf("\nFile opening failed");
	else
	{
		printf("Enter a number to write on file : ");
		scanf("%d",&n);
		fprintf(fp,"%d",n);
		fclose(fp);
	}
	return 0;
}
