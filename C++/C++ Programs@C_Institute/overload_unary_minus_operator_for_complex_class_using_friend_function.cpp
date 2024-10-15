#include<iostream>
using namespace std;

class Complex
{
  //Complete the code here
  int real,img;
  public:
  	Complex(){}
	/*this is called do nothing constructor,
	it is used because the default constructor gets removed the moment we declare a parameterized constructor*/
  	Complex(int real,int img)
  	{
  		this->real=real;
		this->img=img;  	
	}
	void print()
	{
		cout<<"\n"<<real<<" "<<img<<"i";
	}
	friend Complex operator -(Complex temp);
};

Complex operator -(Complex temp)
{
	Complex t(temp.real*temp.real,-(temp.img*temp.img));

	return t;
}

int main()
{
  Complex c1(10,-3),c2;
  
  c2=-c1;
  
  c1.print();//10 -3i
  c2.print();//100 -9i
  
  return 0;
}