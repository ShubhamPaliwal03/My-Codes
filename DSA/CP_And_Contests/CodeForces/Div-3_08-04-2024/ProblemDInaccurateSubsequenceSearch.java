// Wrong Output On Local Computer, Not Submitted

// import java.util.*;

// public class ProblemDInaccurateSubsequenceSearch
// {
// 	public static void main(String[] args)
// 	{
// 		Scanner kb = new Scanner(System.in);

// 		int t = kb.nextInt();

// 		while(t-->0)
// 		{
// 			int n = kb.nextInt();
// 			int m = kb.nextInt();
// 			int k = kb.nextInt();

// 			int[] a = new int[n];
// 			int[] b = new int[m];

// 			for(int i = 0; i < n; i++)
// 			{
// 				a[i] = kb.nextInt();
// 			}

// 			HashMap<Integer, Integer> mapB = new HashMap<>();

// 			for(int i = 0; i < m; i++)
// 			{
// 				b[i] = kb.nextInt();

// 				mapB.put(b[i], mapB.getOrDefault(b[i], 0) + 1);
// 			}

// 			HashMap<Integer, Integer> dupMapB = new HashMap<>(mapB);

// 			int gs_count = 0;

// 			for(int i = 0; i < n; i++)
// 			{
// 				int count = 0;

// 				for(int j = i; j < n; j++)
// 				{
// 					if(dupMapB.containsKey(a[j]))
// 					{
// 						count++;

// 						if(dupMapB.get(a[j]) > 1)
// 						{
// 							dupMapB.put(a[j], dupMapB.get(a[j]) - 1);
// 						}
// 						else
// 						{	
// 							dupMapB.remove(a[j]);
// 						}
// 					}

// 					if(count >= k)
// 					{
// 						gs_count++;

// 						break;
// 					}
// 				}

// 				dupMapB = new HashMap<>(mapB);
// 			}

// 			System.out.println(gs_count);
// 		}
// 	}
// }

// TLE On Test Case 4 On Submission

import java.util.*;

public class ProblemDInaccurateSubsequenceSearch 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();

        while (t-->0) 
        {
            int n = kb.nextInt();
            int m = kb.nextInt();
            int k = kb.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for(int i = 0; i < n; i++) 
            {
                a[i] = kb.nextInt();
            }

            HashMap<Integer, Integer> targetFreq = new HashMap<>();

            for(int i = 0; i < m; i++) 
            {
                b[i] = kb.nextInt();
                targetFreq.put(b[i], targetFreq.getOrDefault(b[i], 0) + 1);
            }

            int goodSegments = 0;
            HashMap<Integer, Integer> windowFreq = new HashMap<>();

            for(int i = 0, j = 0; i < n; i++) 
            {
                windowFreq.put(a[i], windowFreq.getOrDefault(a[i], 0) + 1);

                if(i - j + 1 > m) 
                {
                    int left = a[j++];

                    if(windowFreq.get(left) == 1) 
                    {
                        windowFreq.remove(left);
                    }
                    else
                    {
                        windowFreq.put(left, windowFreq.get(left) - 1);
                    }
                }

                if(i - j + 1 == m)
                {
                    int matchingElements = 0;

                    for(int key : targetFreq.keySet()) 
                    {
                        if(windowFreq.containsKey(key))
                        {
                            matchingElements += Math.min(targetFreq.get(key), windowFreq.get(key));
                        }
                    }

                    if(matchingElements >= k) 
                    {
                        goodSegments++;
                    }
                }
            }

            System.out.println(goodSegments);
        }
    }
}
