#include<stdio.h>
struct Employee
{
	int age,exp,sal;
	char name[1000];
};
int main()
{
	int max=0,i;
	struct Employee s[2];
	printf("Enter the details of 10 employees:\n");
	for(i=0;i<2;i++)
	{
		printf("Name:");
		gets(s[i].name);
		printf("Age:");
		scanf("%d",&s[i].age);
		printf("Experience:");
		scanf("%d",&s[i].exp);
		printf("Salary:");
		scanf("%d",&s[i].sal);
		fflush(stdin);
	}
	printf("The details of the employee who gets maximum salary are:\n");
	for(i=0;i<2;i++)
	{
		if(s[i].sal<max)
		max=s[i].sal;
	}	
	printf("Name:%s",s[i].name);
	printf("Age:%d",s[i].age);
	printf("Experience:%d",s[i].exp);
	printf("Salary:%d",s[i].sal);
	return 0;
}
