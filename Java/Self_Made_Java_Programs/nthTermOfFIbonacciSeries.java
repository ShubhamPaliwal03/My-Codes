import java.util.Scanner;

class nthTermOfFIbonacciSeries
{
    static int nthFibonacci(int n)
    {

        int fib1=1, fib2=1, sum, count=2, mod=1000000007; //  Since the answer can be very large, we will return the answer modulo 1000000007.
        
        if(n==1 || n==2)
        {
            return 1;
        }
        
        while(count!=n)
        {
            sum = (fib1 + fib2) % mod;
            fib1 = fib2;
            fib2 = sum;
            
            count++;
        }
        
        return fib2%mod;
    }

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter which positive term of Fibonacci Series do you want : ");

        int n = kb.nextInt();

        System.out.print("\nThe "+n+"th term of the Fibonacci Series is : "+nthFibonacci(n));
    }
}