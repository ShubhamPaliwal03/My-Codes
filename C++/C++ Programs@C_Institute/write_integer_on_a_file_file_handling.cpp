#include<iostream>
#include<fstream>
using namespace std;

int main()
{
	int n;
	
	cout<<"Enter a number : ";
	cin>>n;
	
	ofstream fout("data.txt");
	
	//if data.txt doesn't exist, then a new file data.txt is created, otherwise, the existing data is overwritten
	
	if(fout)
	{
		fout<<n;
		fout.close();
	}
	else
	{
		cout<<"\nFile opening failed!";
	}
	
	return 0;
}