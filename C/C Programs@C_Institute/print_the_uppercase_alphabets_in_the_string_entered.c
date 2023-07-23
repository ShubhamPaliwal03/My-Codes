#include<stdio.h>
int main()
{
	char str[100];
	
	printf("Enter the string you want to check : ");
	scanf("%[^\n]s",str);
	
	printf("\nThe Uppercase Alphabets in the entered string are : ");
	
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]>65 && str[i]<90)
		{
			printf("%c",str[i]);
		}
		i++;	
	}
	return 0;
}