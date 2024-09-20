#include<iostream>
using namespace std;

class Number
{
	int n;
	
	public:
		
		Number(){}
		
		Number (int n)
		{
			this->n=n;
		}
		
		void show()
		{
			cout<<"\n n is : "<<n;
		}
		
		friend Number operator -(Number temp);
};

Number operator -(Number temp)
{
	Number t(-temp.n);
	
	return t;
}

int main()
{
	Number a(10),b;
	
	b=-a;//operator -(a);
	
	a.show();
	b.show();
	
	return 0;
}