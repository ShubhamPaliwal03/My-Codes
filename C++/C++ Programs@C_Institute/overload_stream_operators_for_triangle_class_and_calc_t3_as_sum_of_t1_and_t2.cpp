#include<iostream>
using namespace std;

class Triangle
{
	float base,height,area;
		
	friend istream &operator >> (istream &, Triangle &);
	friend ostream &operator << (ostream &, Triangle);
	
	public:
		friend Triangle operator +(Triangle,Triangle);
	
};

istream &operator >> (istream &input,Triangle &t)
{
	cout<<"\nEnter the details of the Triangle :\n";
	cout<<"\nBase\t: ";
	input>>t.base;
	cout<<"\nHeight\t: ";
	input>>t.height;
	t.area=0.5*t.base*t.height;
	
	return input;
}

ostream &operator << (ostream &output,Triangle t)
{
	output<<"\n\nThe details of the Triangle are :\n";
	output<<"\nBase\t: "<<t.base;
	output<<"\nHeight\t: "<<t.height;
	output<<"\nArea\t: "<<t.area;
	
	return output;
}

Triangle operator+(Triangle a,Triangle b)
{
	Triangle c;
	
	c.base=a.base+b.base;
	c.height=a.height+b.height;
	c.area=0.5*c.base*c.height;
	
	return c;
}

int main()
{
	Triangle t1,t2,t3;
	cin>>t1>>t2;
	t3=t1+t2;
	cout<<t1<<t2<<t3;
	
	return 0;
}