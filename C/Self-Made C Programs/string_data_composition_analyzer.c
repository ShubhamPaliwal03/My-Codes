#include<stdio.h>
#include<string.h>
int main()
{
	char str[1000],upp[1000],low[1000],num[1000],sym[1000];
	int i,len;
	int c_upp=0,c_low=0,c_num=0,c_spc=0,c_sym=0;
	
	len=strlen(str);
	
	printf("Enter the string you want to check : ");
	scanf("%[^\n]%*c",str);
	
	i=0;
	while(str[i]!='\0')
	{
		if(str[i]>=65 && str[i]<=90)
		{
			upp[c_upp++]=str[i];
		}
		else if(str[i]>=97 && str[i]<=122)
		{
			low[c_low++]=str[i];
		}
		else if(str[i]>=48 && str[i]<=57)
		{
			num[c_num++]=str[i];
		}
		else if(str[i]==32)
		{
			c_spc++;
		}
		// else if(str[i]>33 && str[i]<47 || str[i]>58 && str[i]<64 || str[i]>91 && str[i]<96 || str[i]>123 && str[i]<126)
		else
		{
			sym[c_sym++]=str[i];
		}
		i++;
	}
	
	printf("\nThe data composition of the string entered, after analysis is as follows :-\n");
	printf("------------------------------------------------------------------------\n");
	
	printf("\nUppercase letter(s) :- %d",c_upp);
	printf("\n-------------------");
	if(c_upp!=0)
	{
		printf("\n\nThe %d uppercase letter(s) is/are as follows :-\n\n",c_upp);
	}
	for(i=0;i<c_upp-1;i++)
	{
		printf("'%c', ",upp[i]);
	}
	if(i!=0)
	{
		printf("'%c'",upp[i]);
	}
	printf("\n");
	
	printf("\nLowercase letter(s) :- %d",c_low);
	printf("\n-------------------");
	if(c_low!=0)
	{
		printf("\n\nThe %d lowercase letter(s) is/are as follows :-\n\n",c_low);
	}
	for(i=0;i<c_low-1;i++)
	{
		printf("'%c', ",low[i]);
	}
	if(i!=0)
	{
		printf("'%c'",low[i]);
	}	
	printf("\n");
	
	printf("\nNumber(s) :- %d",c_num);
	printf("\n---------");
	if(c_num!=0)
	{
		printf("\n\nThe %d number(s) is/are as follows :-\n\n",c_num);
	}
	for(i=0;i<c_num-1;i++)
	{
		printf("'%c', ",num[i]);
	}
	if(i!=0)
	{
		printf("'%c'",num[i]);
	}	
	printf("\n");
	
	printf("\nSpace(s) :- %d",c_spc);
	printf("\n--------");
	printf("\n");
		
	printf("\nSymbol(s) :- %d",c_sym);
	printf("\n---------");
	if(c_sym!=0)
	{
		printf("\n\nThe %d symbol(s) is/are as follows :-\n\n",c_sym);
	}
	for(i=0;i<c_sym-1;i++)
	{
		printf("'%c', ",sym[i]);
	}
	if(i!=0)
	{
		printf("'%c'",sym[i]);
	}	
	
	return 0;
}