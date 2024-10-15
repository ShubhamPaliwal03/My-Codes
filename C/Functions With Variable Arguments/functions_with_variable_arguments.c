#include<stdio.h>
#include<stdarg.h>

int Average(int count,...)// ... is called ellipse
{
	int sum=0,i,avg;
	va_list lst;
	va_start(lst,count);
	for(i=0;i<count;i++)
	{
		int n = va_arg(lst,int);
		sum+=n;
	}
	avg = sum/count;
	va_end(lst);
	return avg;
}
int main()
{
	printf("Average = %d",Average(3,1,2,3));
	printf("\nAverage = %d",Average(5,1,2,3,4,5));
	printf("\nAverage = %d",Average(8,1,2,3,4,5,6,7,8));
	
	return 0;
}
