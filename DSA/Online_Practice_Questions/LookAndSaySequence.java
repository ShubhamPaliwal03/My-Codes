public class Solution 
{
	public static String lookAndSaySequence(int n) 
	{
		// Write your code here.
			
		if(n==1) // base case for n=1
		{
			return "1";
		}

		// process for n>=2

		String str = "1"; // considering the string for n=1 as the reference for generating the string for nth term

		for(int i=2;i<=n;i++)
		{
			String temp = ""; // creating a temporary string which is initially empty, it will store the string for the ith build of the string

			str = str + "&"; // appending a delimiter '&' after building every part of the string
			
			int freq = 1; // initializing a variable freq with value 1 (since the character has at least one frequency in the string as it has appeared in the string) to track the frequency of each character of the number 

			for(int j=0;j<str.length()-1;j++)
			{
				if(str.charAt(j)==str.charAt(j+1)) // if there is a subarray having same elements consecutively 
				{	
					freq++; // increasing the frequency count by 1
				}
				else // if a new subarray begins
				{
					temp = temp + Integer.toString(freq); // appending the frequency of current character to str
					
					temp = temp + str.charAt(j); // appending the current character to str

					freq = 1; // reset the frequency to 1, to keep the track of the frequency of the new character
				}
			}

			str = temp; // at the end of the ith build of the string, assigning string 'str' with string 'temp'
		}

		return str;
	}
}

// using StringBuilder can significantly improve the efficiency of string concatenation operations, especially in situations where you need to build a string iteratively. It reduces the overhead of creating multiple string objects and copying characters, which can lead to better performance.

public static String lookAndSaySequence(int n) 
{
	if (n == 1) // base case for n=1
	{
        return "1";
    }

    String prev = "1"; 

    // Initialize with the first term, or basically considering the string for n=1 as the reference for generating the string for nth term

    StringBuilder current; // creating a temporary string which is initially empty, it will store the string for the ith build of the string

    for (int i = 2; i <= n; i++) 
	{
        current = new StringBuilder();

        char prevChar = prev.charAt(0);

        int freq = 1; // initializing a variable freq with value 1 (since the character has at least one frequency in the string as it has appeared in the string) to track the frequency of each character of the number

        for (int j = 1; j < prev.length(); j++) 
		{
            if (prev.charAt(j) == prevChar) // if there is a subarray having same elements consecutively 
			{
                freq++; // increasing the frequency count by 1
            } 
			else // if a new subarray begins
			{
                current.append(freq).append(prevChar); // appending the frequency of current character to prev

                prevChar = prev.charAt(j); // appending the current character to prev

                freq = 1; // reset the frequency to 1, to keep the track of the frequency of the new character
            }
        }

        current.append(freq).append(prevChar);

        prev = current.toString(); // at the end of the ith build of the string, assigning string 'prev' with string 'current'
    }

    return prev;
}