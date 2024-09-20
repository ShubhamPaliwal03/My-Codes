#include<iostream>
using namespace std;

class Complex
{
	int real,img;
	public:
		Complex(){}
		Complex(int real,int img)
		{
			this->real=real;
			this->img=img;
		}
		void print()
		{
			cout<<"\n"<<real<<" "<<img<<"i";
		}
		
		Complex operator -()
		{
			Complex t(real*real,-(img*img));
			
			return t;
		}
};


int main()
{
	Complex c1(10,-3),c2;
	
	c2=-c1;//.operator -();

	c1.print();
	c2.print();
	
	return 0;
}