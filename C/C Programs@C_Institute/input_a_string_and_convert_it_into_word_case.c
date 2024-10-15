#include<stdio.h>
int main()
{
	char str[100];
	int i,j=0;

	printf("Enter a string : ");
	gets(str);

	if(str[0]>='a'&&str[0]<='z')
		str[0]-=32;

	for(i=1;str[i]!='\0';i++)
	{
		if(str[i]>='A'&&str[i]<='Z'&&i!=j)
			str[i]+=32;
			
		if(str[i]==' ')
		{
			j=i+1;
			if(str[i+1]>='a'&&str[i+1]<='z')
			str[i+1]-=32;
		}
	}
	printf("The string in word case is : %s",str);
	return 0;
}
