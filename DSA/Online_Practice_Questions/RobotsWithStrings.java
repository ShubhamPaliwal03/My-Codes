// There are three robots named Ray, Ben, and Kevin. Initially Ray has a string S of length N, while the other two robots have empty strings. We can make either of the following moves:

//     Move 1: Remove the first character from Ray's string and append it to Ben's string.
//     Move 2: Remove the last character from Ben's string and append it to Kevin's string.

// You must perform either fo the two moves mentioned above in such a way that the strings left with Ray and Ben are empty and the string left with Kevin is lexicographically smallest string that Kevin has after completing this activity.

// Input specs:
// input1: integer denoting the length N of the string S
// input2: A string S which belongs to Ray and contains all lowercase characters.

// Output specs:
// A string value denoting the string left with Kevin which is lexicographically smallest.

// Example1:
// Input: [3, dad]
// Output: add

// Example2:
// input: [3, cba]
// output: abc

class RobotsWithStrings
{
	public static String generateResult(String s)
	{
		StringBuilder ray = new StringBuilder(s);
		StringBuilder ben = new StringBuilder();
		StringBuilder kevin = new StringBuilder();

		while(ray.length() > 0)
		{
			int ben_len = ben.length();

			// Move 1

			if(ben_len == 0 || ray.charAt(0) <= ben.charAt(ben_len - 1))
			{
				ben.append(ray.charAt(0));

				ray.deleteCharAt(0);
			}

			// Move 2

			else
			{
				kevin.append(ben.charAt(ben_len - 1));

				ben.deleteCharAt(ben_len - 1);
			}
		}

		int len;

		while((len = ben.length()) > 0)
		{
			kevin.append(ben.charAt(len - 1));

			ben.deleteCharAt(len - 1);
		}

		return kevin.toString();
	}

	public static void main(String[] args)
	{
		System.out.println(generateResult("cba"));
	}
}