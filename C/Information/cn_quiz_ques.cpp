#include<iostream>
using namespace std;

int main()
{
	char b[] = "xyz";
	
	char *c = &b[0];
	
	cout << c << endl;
	
	printf("%s", c);
	
	return 0;
}