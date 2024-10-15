#include<stdio.h>
int main()
{
	int age;
	printf("Enter the age of the person: ");
	scanf("%d",&age);
	if(age>=18)
	{
		printf("The person can give vote");
	}
	else
	{
		printf("The person cannot give vote");
	}
	return 0;
}
