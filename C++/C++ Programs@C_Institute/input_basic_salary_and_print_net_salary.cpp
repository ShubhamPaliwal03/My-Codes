#include<iostream>
using namespace std;
int main()
{
	float BS,HRA,TA,DA,PF,INS,NS;
	cout<<"Enter the basic salary of the employee : ";
	cin>>BS;
	HRA=BS*25/100;//=(BS*25)/100,ie.,acc.to the respective associativity of the operators
	TA=BS*15/100;
	DA=BS*147.5/100;
	PF=BS*21.3/100;
	INS=BS*2/100;
	NS=(BS+TA+DA)-(PF+INS);//Or NS=BS+TA+DA-PF-INS;
	/*
	We can adjust the code to make the output look exactly one below the other by using tab(s),
	we can also use '\t' to put t instead of pressing the tab key.
	*/
	cout<<"\nBasic Salary	="<<BS;
	cout<<"\nH.R.A.		="<<HRA;
	cout<<"\nT.A.		="<<TA;
	cout<<"\nD.A.		="<<DA;
	cout<<"\nP.F.		=-"<<PF;
	cout<<"\nI.N.S.		=-"<<INS;
	cout<<"\nN.S.		="<<NS;
	return 0;
}
