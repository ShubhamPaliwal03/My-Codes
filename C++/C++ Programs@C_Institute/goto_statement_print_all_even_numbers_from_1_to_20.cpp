#include<iostream>
using namespace std;

int main()
{
	int n=2;
	
	here:
		cout<<n<<" ";
		n+=2;
		if(n<=20)
			goto here;
	
	return 0;		
}