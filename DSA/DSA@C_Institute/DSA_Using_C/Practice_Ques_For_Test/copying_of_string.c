#include<stdio.h>

int main()
{
	char str1[100],str2[100];
	int i,len;
	
	printf("Enter the string you want to copy (str1) : ");
	scanf("%[^\n]s",str1);
	
	for(i=0;str1[i]!='\0';i++);/*calculating the length*/
	len=i;
	
	for(i=0;i<len;i++)/*copying the elements of str1 into str2*/
	{
		str2[i]=str1[i];
	}
	str2[i]='\0';/*when the loop reaches the end of the char array, we put NULL or '\0' at the end to make it a string*/
	
	printf("\nAfter copying str1, ie., %s into str2,\n\nstr2 is : %s",str1,str2);
	
	return 0;
}