#include<stdio.h>
int main()
{
	int n;
	printf("Enter the number: ");
	scanf("%d",&n);
    if(n/100==0)
 {     if(n/10==0)
		{	printf("1 digit");
		}
		else
		{	printf("2 digit");
		}
 }
	else
 {		if(n/1000==0)
		{	printf("3 digit");
		}
		else
		{	printf("More than 3 digit");
	    }
 }
 
return 0; 

}
