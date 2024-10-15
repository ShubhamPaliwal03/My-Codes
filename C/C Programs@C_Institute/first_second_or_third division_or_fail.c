#include<stdio.h>
int main()
{
	float percentage;
	printf("Enter percentage: ");
	scanf("%f",&percentage);
	if(percentage>=48)
 {		if(percentage>=60)
  		{	printf("First");
		}
		else
		{	printf("Second");
		}
 }  else
 {	   if(percentage>=33)
 		{	printf("Third");
		}
		else
		{	printf("Fail");
		}	
 }

 
return 0;

}
