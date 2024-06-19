#include<stdio.h>

int main()
{
	int t;
	
	scanf("%d",&t);

	int count = 0;

	while(count!=t)
	{
		int n;
		
		scanf("%d",&n);

		int max = 1;

		int cnt = 0;
		
		int res,i=0;
		
		while(cnt!=n)
		{
			i++;
			
			int a,b;
			
			scanf("%d %d",&a,&b);

			if(a<=10)
			{
				if(b>max)
				{
					max = b;
					
					res = i;
				}
			}
			
			cnt++;
		}
		
		printf("%d\n",res);
	}
	
	return 0;
}