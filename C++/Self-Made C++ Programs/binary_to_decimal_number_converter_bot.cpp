#include<iostream>
#include<math.h>
#define SIZE 1000
using namespace std;
int main()
{
	int s=2,size,n,r=0,result=0,p=0;

	cin>>size;
	cin>>n;

	p=size;
	r = r*10 + n%10;
	n=n/10;

	while(p!=size)
	{
		result=result+n*pow(s,p);
		p++;
	}
	
	cout<<result;

	return 0;
}