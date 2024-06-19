#include<stdio.h>
#include<string.h>
int main()
{
	char *str = "2";
	char **utility = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	char **result;
		
	int i,len=strlen(str),j,elem;
	
	for(i=0;i<len;i++)
	{
		if(str[i]=='2')
		{
			for(j=0;j<3;j++)
			{
				result[j][i] = utility[2][j];
			}
		}
		
		printf("%c",result[i][j]);
	}
	
	return 0;
}