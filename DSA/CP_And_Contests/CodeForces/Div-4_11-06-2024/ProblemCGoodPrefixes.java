import java.util.HashSet;
import java.util.Scanner;

public class ProblemCGoodPrefixes 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();

        while (t-- > 0) 
        {
            int n = kb.nextInt();

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) 
            {
                arr[i] = kb.nextLong();
            }

            long prefixSum = 0;

            HashSet<Long> elements = new HashSet<>();

            int goodPrefixes = 0;

            for (int i = 0; i < n; i++) 
            {
                prefixSum += arr[i];

                elements.add(arr[i]);

                if (prefixSum % 2 == 0 && elements.contains(prefixSum / 2)) 
                {
                    goodPrefixes++;
                }
            }

            System.out.println(goodPrefixes);
        }
    }
}
