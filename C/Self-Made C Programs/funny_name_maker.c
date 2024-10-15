#include<stdio.h>
int main()
{
	char name[50],temp;
	int i,len;
	
	printf("Welcome to Funny Name Maker!\n");
	printf("\nEnter the Full Name : ");
	scanf("%[^\n]s",name);
	
	for(i=0;name[i]!='\0';i++);
	len=i;
	
	for(i=0;i<len;i++)
	{
		if(name[i]==' ')
		{
			temp=name[i+1];
			name[i+1]=name[0];
			name[0]=temp;
		}
	}
	name[i]='\0';
	
	printf("\nThe Funny Name is : %s",name);
	
	return 0;
}