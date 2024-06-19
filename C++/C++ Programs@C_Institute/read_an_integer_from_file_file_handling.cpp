#include<iostream>
#include<fstream>
using namespace std;

int main()
{
	int n=0;
	
	ifstream fin("data.txt");
	//if data.txt doesn't exist, then file opening is failed
	
	if(fin)
	{
		fin>>n;
		cout<<"The number read from the file is : "<<n;
		fin.close();
	}
	else
	{
		cout<<"\nFile opening failed!";
	}
	
	return 0;
}