#include<stdio.h>
struct Student
{
	int age,roll;
	char name[100];
}shubham={20,101,"shubham"};
/*shubham is a global object of student*/
int main()
{
	FILE *fp=fopen("data.dat","wb");
	if(fp==NULL)
		printf("\nFile opening failed!");
	else
	{
		fwrite(&shubham,sizeof(shubham),1,fp);
		fclose(fp);
	}
	return 0;
}
