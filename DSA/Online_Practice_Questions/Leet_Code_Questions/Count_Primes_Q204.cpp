#include <iostream>
using namespace std;

//declared in global scope,as whenever we declare something globally, then everything is marked as zero.

int N=5000000;// the input number as per the worst case
bool sieve[5000001];

void createSieve()
{
	for(int i=2;i<=N;i++)
	{
		sieve[i]=true;// initially, marking all the numbers from 2 to N as true.
	}

	// we are running the below outer loop until the square root of i or square root of N instead of i<=N because the inner loop won't run after j becomes greater than or equal to the square of i or (i*i)
	// so we can say there is absolutely no need of going beyond square root of N or square of i
	for(int i=2;i*i<=N;i++)
	{
		if(sieve[i]==true)// because we won't do this for those who have been marked as false, ie., those who are composites (non-primes)
		{
			for(int j=i*i;j<=N;j+=i)
			{
				sieve[j]=false;
				// marking the multiples of the number i starting from (i*i) as false no matter what they were previously
				// we started from (i*i) instead of (2*i) or the first multiple of any number to optimise the code, because multiples less than (i*i) must have been already marked as false by other numbers,
				// so this reducs unnecessary re-marking of the number as false
			}
		}
	}
}


int main()
{
	int n,count=0;

	cout<<"Enter the value of n : ";
	cin >>n;

	createSieve();//creating the Sieve of Eratosthenes
	
	for(int i=2;i<n;i++)//checking how many primes are present strictly before n
	{
		if(sieve[i]==true)
		{
			count++;
		}
	}

	cout<<"There are "<<count<<" Prime Numbers present before "<<N;

	return 0;
}