#include<iostream>
using namespace std;
class data
{
	int n;
	public:
		void get()
		{
			cout<<"\nEnter the data to be stored (in numerical form) : ";
			cin>>n;
		}
		void show()
		{
			cout<<endl<<"The data stored is : "<<n;
		}
};

int main()
{
	data d;
	
	d.get();
	d.show();
	
	return 0;
}