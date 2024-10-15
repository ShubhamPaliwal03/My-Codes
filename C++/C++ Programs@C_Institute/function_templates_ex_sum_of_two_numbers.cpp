#include<iostream>
using namespace std;

//void sum(int x, int y)
//{
//	cout<<"\nSum of "<<x<<" and "<<y<<" is "<<x+y;
//}
// all the non-int values will be typecasted when this function is called with non-int values

template <class T>

void sum(T x, T y)
{
	cout<<endl<<"The Sum of "<<x<<" and "<<y<<" is "<<x+y<<endl;
}

int main()
{
	sum(10,20);
	sum(10.5,12.7);
	sum(1.2f,45.67f);
	sum('a','b');//sum=195 because on adding charcters, integer value is produced (as per it's ascii(here, 97+98 = 195)
	
	return 0;
}