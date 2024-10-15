#include<iostream>
using namespace std;

class Circle
{
	private:
		float radius,area;	
	public:
		Circle(float radius)
		{
			this->radius=radius;
			area=3.14*radius*radius;
		}
		friend void print(Circle);/*declaration of the function 'print' as a friend function*/
};

void print(Circle c)/*definition of the function 'print'*/
{
	cout<<"Radius is "<<c.radius;
	cout<<endl<<endl<<"Area is "<<c.area;
}

int main()
{
	Circle c(100);
	print(c);/*function call of the function 'print'*/
	return 0;
}