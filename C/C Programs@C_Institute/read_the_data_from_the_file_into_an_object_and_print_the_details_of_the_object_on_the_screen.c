#include<stdio.h>
struct Student
{
	int age,roll;
	char name[100];
}x;
int main()
{
	FILE *fp=fopen("data.dat","rb");
	if(fp==NULL)
		printf("\nFile opening failed!");
	else
	{
		fread(&x,sizeof(x),1,fp);
	
		printf("Name : %s\nAge : %d\nRoll number : %d",x.name,x.age,x.roll);
	
		fclose(fp);
	}
	
	return 0;
}
