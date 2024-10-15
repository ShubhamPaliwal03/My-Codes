#include<stdio.h>
struct Student
{
	int age,roll;
	char name[100];
};
int main()
{
	struct Student s[5];
	int i;
	printf("Enter the details of 5 students\n");
	for(i=0;i<5;i++)
	{
		printf("Name:");
		gets(s[i].name);
		printf("Age:");
		scanf("%d",&s[i].age);
		printf("Roll:");
		scanf("%d",s[i].roll);
	}
	printf("\nDetails of 5 students:");
	for(i=0;i<5;i++)
	{
		printf("Name:%s",s[i].name);
		printf("\nAge:%d",s[i].age);
		printf("\nRoll:%d",s[i].roll);
	}
	return 0;
}
