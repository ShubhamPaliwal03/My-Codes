#include<stdio.h>
int main()
{
	int n;
	FILE *fp=fopen("number.txt","r");
	if(fp==NULL)
		printf("\nFile opening failed");
	else
	{
		fscanf(fp,"%d",&n);
		printf("Number read from file : %d",n);
		fclose(fp);
	}
	return 0;
}
