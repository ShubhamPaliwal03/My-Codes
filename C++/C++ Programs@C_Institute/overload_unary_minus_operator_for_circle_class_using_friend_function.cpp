#include<iostream>
using namespace std;

class Circle
{
	float radius,area;
	
	public:
		
		Circle(){}
		
		Circle(float radius)
		{
			this->radius=radius;
			area=3.14*radius*radius;	
		}
		
		friend void print(Circle);
		friend Circle operator -(Circle);
};

void print(Circle c)
{
	cout<<"\n\nRadius is : "<<c.radius;
	cout<<"\nArea is : "<<c.area;
}

Circle operator -(Circle t)
{
	Circle temp(t.radius*2);
	
	return temp;
}

int main()
{
	Circle c1(10),c2;
	
	c2=-c1;//operator -(c1)
	
	print(c1);// 10 314
	print(c2);// 20 1256
	
	return 0;
}