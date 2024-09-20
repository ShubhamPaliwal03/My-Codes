#include <iostream>
using namespace std;

class Father
{
	public:

		Father()
		{
			cout<<endl<<endl<<"An object of Father class has been created!";
		}
		
		void well_wisher()
		{
			cout<<endl<<endl<<"A father always wishes the best for his child!";
		}

		void supporter()
		{
			cout<<endl<<endl<<"A father always supports his child throughout his life, especially in tough times";
		}

		void guide()
		{
			cout<<endl<<endl<<"A father always guides his child to the right path, so that the child can excel in his/her life";
		}

		void tough_love()
		{
			cout<<endl<<endl<<"The love a father has for his child is unmatchable, he might display strictness, but he is soft from the heart";
		}
};

class Child:public Father
{
	public:
	
		Child()
		{
			cout<<endl<<endl<<"An object of Child class has been created";
		}
		
		void successful()
		{
			cout<<endl<<endl<<"A child finally becomes successful in his/her life, and a huge credit goes to his father!"<<endl<<"As he always provided love, support, well wishes and guided his child";
		}

};

int main()
{	
	Child child;
	
	cout<<endl<<endl<<"Happy Father's Day!";
	cout<<endl<<"-------------------";
	
	cout<<endl<<endl<<"An object of the class 'Child' can access member methods of the class 'Father'";
	cout<<endl<<endl<<"The object of the class 'Child' is wishing his father :- ";
	cout<<endl<<"-----------------------------------------------------";
	
	child.well_wisher();
	child.supporter();
	child.guide();
	child.tough_love();	
	child.successful();
	
	return 0;
}