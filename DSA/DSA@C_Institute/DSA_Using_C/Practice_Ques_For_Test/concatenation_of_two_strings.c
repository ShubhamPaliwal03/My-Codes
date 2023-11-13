
#include<stdio.h>

int main()
{
	char str1[100],str2[100],str3[100];
	int len1,len2,i,j;
	
	printf("Enter the two strings you want to concatenate : ");
	
	printf("\n\nEnter the 1st string : ");
	gets(str1);
	
	printf("\nEnter the 2nd string : ");
	gets(str2);
	
	for(i=0;str1[i]!='\0';i++);
	len1=i;
	
	for(i=0;str2[i]!='\0';i++);
	len2=i;
	
	for(i=0;i<len1;i++)
	{
		str3[i]=str1[i];
	}
	
	for(i=len1,j=0;i<len2,j<len2;i++,j++)
	{
		str3[i]=str2[j];
	}
	str3[i]='\0';
	
	printf("\nThe Concatenated string is : %s",str3);
	
	return 0;
}