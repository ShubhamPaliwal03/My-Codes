#include<iostream>
using namespace std;
class Triangle
{ 
 	int base,height;
  	float area;
  	public:
    void input()
    {  	
		cout<<"Enter height : ";  cin>>height;
      	cout<<"Enter base : ";    cin>>base;  
      	area=0.5*base*height;
    }
    void print()
    {  
		cout<<"\nBase : "<<base<<"\nHeight : "<<height<<"\nArea : "<<area;
    }
    //Define add() here
    int add(Triangle)
    {
    	base=base+base;
    	height=height+height;
    	return base;
	}
};
int main()
{  
	Triangle t1,t2,t3;
  	t1.input();//10 5
  	t2.input();// 15 20
 	t3=t1.add(t2);
  	t1.print();//10 5 25
  	t2.print();//15 20 150
	t3.print();//25 25 312.5
	cout<<t1.add(t2);
  	return 0;
}