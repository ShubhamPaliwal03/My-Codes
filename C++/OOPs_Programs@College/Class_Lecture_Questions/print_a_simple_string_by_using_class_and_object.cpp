#include<iostream>
using namespace std;
class message
{
	public:
		void show()
		{
			cout<<"Welcome to C++";	
		}
};

int main()
{
	message m;
	m.show();
	
	return 0;
}