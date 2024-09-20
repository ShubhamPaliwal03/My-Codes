#include<iostream>
using namespace std;

class Triangle
{
	private:
		float base,height,area;
	public:
		Triangle(float b=0,float h=0)
		{
			base=b;
			height=h;
			area=0.5*base*height;
		}
		friend Triangle add(Triangle,Triangle);
		friend void display(Triangle);
};
Triangle add(Triangle t1,Triangle t2)
{
	Triangle t3(t1.base+t2.base,t1.height+t2.height);
	
/*or*/	
/*	Triangle t3;	
	t3.base=t1.base+t2.base;
	t3.height=t1.height+t2.height;
	t3.area=0.5*t1.area*t2.area;
*/	
	return t3;
}
void display(Triangle t)
{
	cout<<endl<<"Base is \t: "<<t.base;
	cout<<endl<<"Height is \t: "<<t.height;
	cout<<endl<<"Area is \t: "<<t.area<<endl;
}
int main()
{
	Triangle t1(2,3),t2(4,3),t3;
	
	t3=add(t1,t2);
	
	display(t1);
	display(t2);
	display(t3);
	
	return 0;
}