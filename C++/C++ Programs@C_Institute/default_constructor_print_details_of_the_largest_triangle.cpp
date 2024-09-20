#include<iostream>
using namespace std;

class Triangle
{
	private:
		float base,height,area;
	
	public:
		Triangle()/*Default Constructor*/
		{
			
			cout<<endl<<"Enter the Base : ";
			cin>>base;
			
			cout<<"Enter the Height : ";
			cin>>height;
			
			area=0.5*base*height;
		}
		
		void display()
		{
			cout<<endl<<endl<<"The Base is : "<<base;
			cout<<endl<<"The Height is : "<<height;
			cout<<endl<<"The Area is : "<<area;
		}
		
		float Area()
		{
			return area;
		}
};

int main()
{
	Triangle T1,T2,T3;
	
	/*printing the details of all the traingles*/
	cout<<endl<<"The details of T1 are :";
	T1.display();
	
	cout<<endl<<endl<<"The details of T2 are :";
	T2.display();
	
	cout<<endl<<endl<<"The details of T3 are :";
	T3.display();
	
	/*printing the details of the largest triangle*/
	if(T1.Area()>T2.Area() && T1.Area()>T3.Area())
	{
		cout<<endl<<endl<<"The largest triangle is T1 and it's details are :";
		T1.display();
	}
	else if(T2.Area()>T1.Area() && T2.Area()>T3.Area())
	{
		cout<<endl<<endl<<"The largest triangle is T2 and it's details are :";
		T2.display();
	}
	else
	{
		cout<<endl<<endl<<"The largest triangle is T2 and it's details are :";
		T3.display();
	}
	
	return 0;
}