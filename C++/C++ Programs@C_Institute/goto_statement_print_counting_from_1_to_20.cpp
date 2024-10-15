#include<iostream>
using namespace std;

int main()
{
	int n=1;
	
	inc:
	if(n<=20)
	{
		cout<<n<<" ";
		n++;	
		goto inc;
	}
	
	return 0;	
}