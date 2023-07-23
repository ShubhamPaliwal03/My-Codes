#include<iostream>
using namespace std;
class complex_no
{
	int real_part1,img_part1,real_part2,img_part2;
	public:
		void getNum1()
		{
			cout<<"Enter the details of Complex Number C1 : "<<endl;
			cout<<endl<<"Enter the value of real part : ";
			cin>>real_part1;
			cout<<"Enter the value of imaginary part : ";
			cin>>img_part1;
		}
		void getNum2()
		{
			cout<<"Enter the details of Complex Number C2 : "<<endl;
			cout<<endl<<"Enter the value of real part : ";
			cin>>real_part2;
			cout<<"Enter the value of imaginary part : ";
			cin>>img_part2;
		}
		void show1()
		{
			cout<<"C1 = ";
			cout<<real_part1<<" "<<"+ i"<<img_part1;
		}
		void show2()
		{
			cout<<"C2 = ";
			cout<<real_part2<<" "<<"+ i"<<img_part2;
		}
		void sum()
		{
			cout<<"Therefore,the sum of C1 and C2, C3 is : "<<endl;
			cout<<endl<<"C3 = ";
			cout<<real_part1+real_part2<<" "<<"+ i"<<img_part1+img_part2;
		}
};

int main()
{
	complex_no c;
	
	cout<<"Enter the required details : "<<endl<<endl;
	
	c.getNum1();
	cout<<endl;
	c.show1();
	cout<<endl<<endl;
	
	c.getNum2();
	cout<<endl;
	c.show2();
	cout<<endl<<endl;
	
	c.sum();
	
	return 0;
}