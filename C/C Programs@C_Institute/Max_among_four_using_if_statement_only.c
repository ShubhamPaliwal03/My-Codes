#include<stdio.h>
int max_among_four(int a ,int b, int c, int d)
{
	int max;
	
	if(a>=b && a>=c && a>=d)
	max=a;
	 
	if(b>=a && b>=c && b>=d)
	max=b;
	 
	if(c>=a && c>=b && c>=d)
	max=c;
	 
	if(d>=a && d>=b && d>=c)
	max=d;
	
	return max;
}
int main()
{
	int a,b,c,d,ans;
	printf("Enter four numbers seperated by spaces : ");
	scanf("%d %d %d %d",&a,&b,&c,&d);
	ans=max_among_four(a,b,c,d);
	printf("Max is %d",ans);
	return 0;
}

