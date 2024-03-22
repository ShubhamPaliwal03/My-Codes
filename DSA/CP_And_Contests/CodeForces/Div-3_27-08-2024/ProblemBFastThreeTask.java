import java.util.Scanner;

public class ProblemBFastThreeTask
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int n = kb.nextInt(); // size of the array

            int[] arr = new int[n];

            int sum = 0;

            for(int i = 0; i < n; i++) 
            {
                arr[i] = kb.nextInt();

                sum += arr[i];
            }

            int remainder = sum % 3;

            int moves = 0;

            if(remainder == 1) 
            {
                // We need to remove a number with remainder 1

                boolean found = false;

                for(int i = 0; i < n; i++) 
                {
                    if(arr[i] % 3 == 1) 
                    {
                        arr[i] = 0;

                        found = true;

                        moves = 1;

                        break;
                    }
                }

                if (!found) 
                {
                    // We need to remove two numbers with remainder 2

                    int count = 0;

                    for(int i = 0; i < n; i++) 
                    {
                        if (arr[i] % 3 == 2) 
                        {
                            arr[i] = 0;

                            count++;
                        }

                        if(count == 2) 
                        {
                            moves = 2;

                            break;
                        }
                    }
                }
            }
            else if (remainder == 2) 
            {   
                // We need to remove a number with remainder 2

                boolean found = false;

                for(int i = 0; i < n; i++) 
                {
                    if(arr[i] % 3 == 2) 
                    {
                        arr[i] = 0;

                        found = true;

                        moves = 1;

                        break;
                    }
                }

                if(!found) 
                {
                    // We need to remove one number with remainder 1

                    int count = 0;

                    for (int i = 0; i < n; i++) 
                    {
                        if (arr[i] % 3 == 1) 
                        {
                            arr[i] = 0;

                            moves = 1;

                            break;
                        }
                    }
                }

            }
            
            System.out.println(moves);
		}
	}
}