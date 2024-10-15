#include<stdio.h>
int main()
{
	int n;
	printf("Enter the number of day:\n");
	scanf("%d",&n);
	switch(n)
	{	case 1:
		printf("Monday");
		break;
		//Break is used to stop the previous values from getting repeated
		
		case 2:
		printf("Tuesday");
		break;
		
		case 3:
		printf("Wednesday");
		break;
		
		case 4:
		printf("Thurday");
		break;
		
		case 5:
		printf("Friday");
		break;
		
		case 6:
		printf("Saturday");
		break;
		
		case 7:
		printf("Sunday");
		break;
		
		default:printf("Please enter a valid value of number of day!");
   }
		return 0;
}
