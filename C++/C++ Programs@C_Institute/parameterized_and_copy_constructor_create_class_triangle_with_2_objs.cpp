#include<iostream>
using namespace std;

class Triangle
{
	private:
		float base,height,area;
	public:
		Triangle(float b,float h)/*Parameterized Constructor*/
		{
			base=b;
			height=h;
			area=0.5*base*height;
		}
		Triangle(Triangle&T)/*Copy Constructor*/
		{
			base=T.base;
			height=T.height;
			area=T.area;
		}
		void display()
		{
			cout<<endl<<endl<<"The Base is : "<<base;
			cout<<endl<<"The Height is : "<<height;
			cout<<endl<<"The Area is : "<<area;
		}
};
int main()
{
	Triangle T1(3,5),T2(T1);
	
	T1.display();
	T2.display();
	
	return 0;
}