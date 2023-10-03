// Column name from a given column number
// MediumAccuracy: 32.41%Submissions: 62K+Points: 4
// Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

// banner
// Given a positive integer, return its corresponding column title as appear in an Excel sheet.
// Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named as "A", column 2 as "B", column 27 as "AA" and so on.

// Example 1:

// Input:
// N = 28
// Output: AB
// Explanation: 1 to 26 are A to Z.
// Then, 27 is AA and 28 = AB.

// Example 2:

// Input: 
// N = 13
// Output: M
// Explanation: M is the 13th character of
// alphabet.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function colName() which takes the column number N as input and returns the column name represented as a string.
// Expected Time Complexity: O(LogN).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 <= N <= 1018

import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the Column Number of an Excel Sheet : ");

		int num, n;

		num = n = kb.nextInt();

		// to store the string and efficiently concatenate the string in O(1), instead of O(n) everytime in the loop

		StringBuilder column_name = new StringBuilder();

		while(n != 0) // or n > 0
		{
			n--; // to fix the 0-based indexing to 1-based indexing

			column_name.append((char)((n % 26) + 'A')); // appending the typecasted character combination of n mod 26 and 'A' to the StringBuilder column_name

			// 'A' is combined because 'A' is the element at the first index, or it is the first alphabet of the english alphabet

			n = n / 26; // reducing the length of the current StringBuilder column_name by (n / 26) times every time
		}

		// reversing the StringBuilder column_name and converting it to a String

		System.out.print("\nThe Column Name of the Column Number "+num+" of an Excel Sheet is : "+column_name.reverse().toString());

		// we need to reverse the StringBuilder column_name obtained, since we are appending it, ie., we are making our answer in a reversed format
	}
}