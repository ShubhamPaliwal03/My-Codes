#include<iostream>
using namespace std;

class Complex
{
	private:
		int real,img;
	public:
		Complex()/*Default Constructor*/
		{
			cout<<"Enter the Real part : ";
			cin>>real;
			cout<<"Enter the Imaginary part : ";
			cin>>img;
		}
		Complex(int r,int i)/*Parameterized Constructor*/
		{
			real=r;
			img=i;
		}
		void display()
		{
			cout<<endl<<endl<<"The Real part is : "<<real;
			cout<<endl<<"The Imaginary part is : "<<img;
		}
};
int main()
{
//	int a,b;
//	a=4,b=5;
//	Complex c1,c2(a,b);
	
	Complex c1,c2(4,5);
	
	c1.display();
	c2.display();
	
	return 0;
}