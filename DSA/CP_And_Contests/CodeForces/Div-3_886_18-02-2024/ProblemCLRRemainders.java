import java.util.Scanner;

public class ProblemCLRRemainders
{
    public static void printRemainderOfProductOfElements(int start, int end, int[] arr, int m)
    {
        long product = 1; // Use long to avoid integer overflow

        for(int i = start; i < end; i++)
        {
            product *= arr[i];
            product %= m; // Take remainder at each step to avoid overflow
        }

        System.out.print((product % m)+" ");
    }


    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();

        while(t-->0)
        {
            int n = kb.nextInt();

            int m = kb.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++)
            {
                arr[i] = kb.nextInt();
            }

            kb.next();

            String s = kb.next();

            int start = 0;

            int end = n;

            for(int i = 0; i < s.length(); i++)
            {
                printRemainderOfProductOfElements(start, end, arr, m);

                if(s.charAt(i) == 'L')
                {
                    start++;
                }
                else
                {
                    end--;
                }

                if(start > end)
                {
                    break;
                }
            }

            System.out.println();
        }
    }   
}