#include<iostream>
#include<fstream>
using namespace std;

int main()
{
	int choice;
	
	char source[]="unprocessed_text.txt";
	char destination[]="processed_text.txt";
	
	ifstream fin(source);
	ofstream fout(destination);
	
	cout<<"Welcome To Text Case Convertor Bot : ";
	cout<<endl<<"-------------------------------------";
	cout<<endl<<endl<<"OPTIONS OF CASE CONVERSION OPERATIONS : ";
	cout<<endl<<"----------------------------------------";
	cout<<"\n\n1.Lowercase to Uppercase\n2.Uppercase to Lowercase";
	cout<<endl<<endl<<"Enter your choice (1-2) : ";
	cout<<endl<<"-------------------------"<<endl;
	cin>>choice;
	
	if(fin&&fout)
	{
		char ch;
		while(!fin.eof())
		{
			switch(choice)
			{
				case 1:
					
					fin.get(ch);
					
					if(ch>='a' && ch<='z')
					{	
						ch-=32;
						fout.put(ch);
					}
					else
					{
						fout.put(ch);
					}
					
					break;
				
				case 2:
					
					fin.get(ch);
					
					if(ch>='A' && ch<='Z')
					{
						ch+=32;
						fout.put(ch);
					}
					else
					{
						fout.put(ch);
					}
					
					break;
			}
		}				
		
		cout<<endl<<"Desired Case Conversion has been performed on all the letters of your text file...";
		cout<<endl<<"You can check and use the processed text file it by opening the file : "<<destination;
		
		fin.close();
		fout.close();
	}
	else
	{
		cout<<endl<<"File opening failed!";
	}
	
	return 0;
}