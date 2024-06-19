#include<stdio.h>
struct Teacher
{
	int exp;
	char name[100],subject[20];
};
int main()
{
	float avg_exp,total_exp;
	struct Teacher t1,t2,t3;
	printf("Enter details of the teachers:\n");
	printf("Enter details of first teacher:\n");
	printf("Name:");
	gets(t1.name);
	printf("Subject:");
	gets(t1.subject);
	printf("Experience:");
	scanf("%d",&t1.exp);
	fflush(stdin);

	printf("\nEnter the details of the second teacher:\n");
	printf("Name:");
	gets(t2.name);
	printf("Subject:");
	gets(t2.subject);
	printf("Experience:");
	scanf("%d",&t2.exp);
	fflush(stdin);

	printf("\nEnter the details of the third teacher:\n");
	printf("Name:");
	gets(t3.name);
	printf("Subject:");
	gets(t3.subject);
	printf("Experience:");
	scanf("%d",&t3.exp);
	fflush(stdin);

	printf("\nDetails of the teacher having max experience:\n");
	if(t1.exp>t2.exp&&t1.exp>t3.exp)
	{
		printf("Name:%s",t1.name);
		printf("\nSubject:%s",t1.subject);
		printf("\nExperience:%d",t1.exp);
	}
	else if(t2.exp>t3.exp)
	{
		printf("Name:%s",t2.name);
		printf("\nSubject:%s",t2.subject);
		printf("\nExperience:%d",t2.exp);
	}
	else
	{
		printf("Name:%s",t3.name);
		printf("\nSubject:%s",t3.subject);
		printf("\nExperience:%d",t3.exp);
	}
	avg_exp=(t1.exp+t2.exp+t3.exp)/3;
	printf("\nThe average experience is:%.2f",avg_exp);
	total_exp=(t1.exp+t2.exp+t3.exp);
	printf("\nThe total experience is:%.2f",total_exp);
	return 0;
}
