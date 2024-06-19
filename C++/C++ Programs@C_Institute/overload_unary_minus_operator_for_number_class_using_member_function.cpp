#include<iostream>
using namespace std;

class Number
{
	int n;
	
	public:
		
		Number(){}
	
		Number(int n)
		{
			this->n=n;
		}
		
		void show()
		{
			cout<<"\nThe number is : "<<n;
		}
		
		Number operator -()
		{
			Number t(-n);
			
			return t;
		}
};

int main()
{
	Number num1(100);
	Number num2;
	
	num2=-num1;//num1.operator -()
	
	num1.show();
	num2.show();
	
	return 0;
}