#include<iostream>
using namespace std;

int main()
{
	int t;
	
	cin>>t;

	int count = 0;

	while(count!=t)
	{
		int n;
		
		cin>>n;

		int max = 1;

		int cnt = 0;
		
		int res,i=0;
		
		while(cnt!=n)
		{
			i++;
			
			int a,b;
			
			cin>>a;
			
			cin>>b;

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
		
		cout<<res<<endl;
	}
	
	return 0;
}