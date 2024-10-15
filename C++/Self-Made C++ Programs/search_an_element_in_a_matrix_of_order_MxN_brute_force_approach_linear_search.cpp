#include<iostream>
using namespace std;

int main()
{
	int arr[10][10],m,n,i,j,key;
	
	cout<<"Enter the size of the matrix in M x N form (enter two values seperated by spaces) : ";
	cin>>m>>n;
	
	cout<<endl<<"Enter the "<<m*n<<" elements into the matrix :"<<endl<<endl;
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			cin>>arr[i][j];
		}
	}
	
	cout<<endl<<"Enter the element you want to search in the matrix : ";
	cin>>key;
	
	// linear search algorithm to find the key value in the matrix (brute-force approach)
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(arr[i][j]==key)
			{
				cout<<endl<<"Searched element "<<key<<" found at row "<<i+1<<" and column "<<j+1<<" of the matrix and is element arr["<<i<<"]["<<j<<"] of the matrix";
				break;
			}
	cout<<i<<j;
		}
	}
	if(i==m && j==n)
	{
		cout<<endl<<"Searched element "<<key<<" not found in the matrix";
	}
	
	return 0;
}