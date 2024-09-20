#include<stdio.h>
int main()
{
	int i,n;
	int t1=0,t2=1;
	int next_term=t1+t2;

	printf("Enter the number of terms: ");
	scanf("%d",&n);

	printf("Fibonacci series: %d,%d,",t1,t2);

	for(i=3;i<=n;++i)/*in this case,we can also use ++i, because there is no statement after this loop which uses the value of i*/
	{
		if(i==n)
			printf("%d",next_term);
		else
			printf("%d,",next_term);
			
		t1=t2;
		t2=next_term;
		next_term=t1+t2;
	}
	return 0;
}
