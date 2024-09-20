#include<stdio.h>
#include<string.h>

int main()
{
	int i,len,div,k,rep,l,flag;
	char s[13]="abab",substr[7],cmp[7];
	
	len=strlen(s);
	
	printf("The length of the string is : %d",len);
	
	i=1;
	while(i<=len/2)
	{
		if(len%i==0)
		{
			div=i;
			printf("\nDiv is : %d",div);
		}
		
		k=0;
		while(k<div)
		{
			substr[k]=s[k];
			printf("\n%c of string is getting copied to %c of substring",s[k],substr[k]);
			k++;
		}
		substr[k]='\0';
		
		printf("\nSubstring is : %s",substr);
		
		rep=len/strlen(substr);
		
		cmp[0]='\0'; // to clear the cmp string before using it again
		
		for(l=1;l<=rep;l++)
		{
			strcat(cmp,substr);
		}
		
		printf("\nCmp is : %s",cmp);
		
		if(strcmp(cmp,s)==0)
		{
			flag=0;
			printf("\ntrue");
			break;
		}
		else
		{
			flag=1;
		}
		
		i++;
	}

	if(flag==1)
	{
		printf("\nfalse");
	}
	
	return 0;
}