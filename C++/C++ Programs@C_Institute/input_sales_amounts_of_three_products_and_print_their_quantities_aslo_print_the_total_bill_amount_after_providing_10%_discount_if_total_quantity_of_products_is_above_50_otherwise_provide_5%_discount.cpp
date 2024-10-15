#include<iostream>
using namespace std;
int main()
{
	float saP1,saP2,saP3,qtyP1,qtyP2,qtyP3,total_qty,gross_bill,total_bill;
	
	cout<<"Enter the sales amount of :\n";
	cout<<"\nProduct 1 : ";
	cin>>saP1;
	cout<<"\nProduct 2 : ";
	cin>>saP2;
	cout<<"\nProduct 3 : ";
	cin>>saP3;
	
	cout<<"\nEnter the quantity of :\n";
	cout<<"\nProduct 1 : ";
	cin>>qtyP1;
	cout<<"\nProduct 2 : ";
	cin>>qtyP2;
	cout<<"\nProduct 3 : ";
	cin>>qtyP3;
	
	total_qty=qtyP1+qtyP2+qtyP3;
	
	gross_bill=(saP1*qtyP1)+(saP2*qtyP2)+(saP3*qtyP3);
	
	if(total_qty>50)
	{
		total_bill=gross_bill-(gross_bill*10/100);
	}
	else
	{
		total_bill=gross_bill-(gross_bill*5/100);
	}
	cout<<"\nThe total bill is : "<<total_bill;
	/*Instead of using cascading of insertion operator here,we can directly use another cout,
	like:
	cout<<"\nThe total bill is : ";
	cout<<total_bill;
	This will give the same output as the other one
	*/
	return 0;
}
