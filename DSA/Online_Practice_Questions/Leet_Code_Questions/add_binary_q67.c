#include<stdio.h>
#include<string.h>
int main()
{   
	char a[100],b[100],res[100];
	int sum=0,i,j,a_len=2,b_len=1,carry=0;

    printf("Enter the binary string a : ");
    scanf("%[^\n]s",a);
    
    printf("\nEnter the binary string b : ");
    fflush(stdin);
    scanf("%[^\n]s",b);

	a_len=strlen(a);
	b_len=strlen(b);
	
    for(i=a_len-1;i>=0;i--)
    {
        for(j=b_len-1;j>=0;j--)
        {
            if(a[i]=='0' && b[j]=='0')
            {
            	if(carry==1)
            	{
            		res[i]=1+carry;
            		carry=0;
				}
				else/*if carry==0*/
				{
	                res[i]=0+carry;
	                carry=0;
				}
            }
            else if(a[i]=='0' && b[j]=='1' || a[i]=='1' && b[j]=='0')
            {
            	if(carry==1)
            	{
            		res[i]=0+carry;
            		carry=1;
				}
				else/*if carry==0*/
				{
                	res[i]=1+carry;
                	carry=0;
				}
            }
            else/*if(a[i]=='1' && b[j]=='1')*/
            {
        		if(carry==1)
            	{
            		res[i]=1+carry;
            		carry=1;
				}
				else/*if carry==0*/
				{
                	res[i]=0+carry;
                	carry=1;
				}
            }
        }
    }
//    res[a_len]='\0';
    
    for(i=0;i<=a_len;i++)
    {
    	printf("%d",res[i]);
	}

    return 0;
}