#include<iostream>
using namespace std;
class Triangle
{
	float base,height,area;
	public:
		Triangle(float base=0,float height=0)
		{
			this->base=base;
			this->height=height;
			area=0.5*base*height;
		}
		void show()
		{
			cout<<endl<<base;
			cout<<endl<<height;
			cout<<endl<<area<<endl;
		}
		Triangle operator ++(int)
		{
			cout<<endl<<"Overloaded operartor post increment ++ called!"<<endl;
			Triangle temp(base++,height++);
			return temp;
		}
		Triangle operator --(int)
		{
			cout<<endl<<"Overloaded operartor post decrement -- called!"<<endl;
			Triangle temp(base--,height--);
			return temp;
		}
		
};
int main()
{
	Triangle t1(10,20),t2;
	
	cout<<endl<<"t1 : "<<endl;
	t1.show();
	t2=t1++;//t2.operator ++()
	cout<<endl<<"t1 after overloaded operator is called : "<<endl;
	t1.show();
	cout<<endl<<"t2 (t2=t1++) : "<<endl;
	t2.show();
//		
	cout<<endl<<"t1 : "<<endl;
	t1.show();
	t2=t1--;//t2.operator --()
	cout<<endl<<"t1 after overloaded operator is called : "<<endl;
	t1.show();
	cout<<endl<<"t2 (t2=t1--) : "<<endl;
	t2.show();
	
	return 0;
}