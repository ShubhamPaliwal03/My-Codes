// Given an integer n, return the number of prime numbers that are strictly less than n.
import java.util.Scanner;

class LessOptimisedTLECountPrimesQ204
{
    public static int countPrimes(int n)
    {   
        int num=2,count=0;
        while(num<n)
        {
            int i=2;
            while(i*i<=num)
            {
                if(num%i==0)
                {
                    break;
                }
                i++;
            }
            if(i*i>num)
            {
                count++;
            }
            num++;
        }
        return count;
    }

    public static void main(String args[])
    {
    	Scanner kb = new Scanner(System.in);

    	System.out.print("Enter the value of n : ");
    	int n = kb.nextInt();
    	kb.close();
    	System.out.println();

    	int count = countPrimes(n);
    	System.out.println("There are "+count+" Prime Numbers less than "+n);
    }
}