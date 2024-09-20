#include<iostream>
using namespace std;

class Circle
{
	private:
		float radius,area;
	public:
		Circle()
		{
		}
		Circle(float radius)
		/*or using default arguments*/
		/*Circle(float radius=0)*/
		{
			this->radius=radius;
			area=3.14*radius*radius;
		}
		
		friend void print(Circle);/*friend function*/
		
		Circle add(Circle temp)
		{			
			Circle c(radius+c.radius);			
			
			/*or*/
//			Circle c;
//			c.radius = radius + temp.radius;

			return c;
		}
};

void print(Circle c)
{
	cout<<endl<<"Radius is "<<c.radius;
	cout<<endl<<"Area is "<<c.area<<endl;
}

int main()
{
	Circle c1(100),c2(200),c3;
	
	c3=c1.add(c2);
	
	print(c1);
	print(c2);
	print(c3);
	
	return 0;
}