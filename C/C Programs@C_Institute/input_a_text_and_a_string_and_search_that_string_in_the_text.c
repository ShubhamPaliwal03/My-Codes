#include<stdio.h>
#include<string.h>
int main()
{
	char str[1000],substr[50];
	int i,j,len,n;

	len=strlen(substr);

	printf("Enter text : ");
	gets(str);

	printf("\nEnter the string to search : ");
	gets(substr);
	// for(i=0;str[i]=='\0';)
	// {
	// 	j=0;
	// 	if(str[i]==substr[j])
	// 	{
	// 		while(str[i]==substr[j])
	// 			j++;
	// 		if(substr[j]=='\0')
	// 			break;
	// 			i++;
	// 	}
	// 	else
	// 		i++;
	// 	if(substr[j]=='\0')
	// 		break;
	// }
	// if(str[i]=='\0')
	// 	printf("%s not found in %s",substr,str);
	// else
	// 	printf("%s found in %s",substr,str);
	i=0,j=0;
	while(str[i]!='\0')
	{
		if(str[i]==substr[j])
		{
			n=1;
			while(n!=len-1)
			{
				j++;
				if(str[i+n]==substr[j+n])
				{
					printf("Found");
					break;
				}
				n++;					
			}
		}
		else
		{
			printf("Not found");
			break;
		}
		i++;
	}
	return 0;
}
