import java.util.Scanner;

class FibonacciRecursion
{
    static int Fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }

        return Fibonacci(n-1) + Fibonacci(n-2);
        
    }
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of term of fibonacci sequence you want to print : ");
        int term = kb.nextInt();
        kb.close();

        System.out.println(Fibonacci(term));

        // Fibonacci Series : 1, 1, 2, 3, 5, 8, 13

        // System.out.println("The "+term+" of fibonacci sequence is "+Fibonacci(term));
    }
}