import java.util.Scanner;
import java.util.Arrays;

class SortAStringOnBasisOfTheFrequencyOfItsCharacters
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a String : ");

		String s = kb.next().toLowerCase();

		int[] frequency = new int[26];

		// Arrays.fill(frequency, 0); // not required, as it will have 0 as values by default

		for(int i = 0; i < s.length(); i++)
		{
			frequency[s.charAt(i)-'a']++;
		}

		// for(int i = 0; i < 26; i++)
		// {
		// 	if(frequency[i] != 0)
		// 	{
		// 		System.out.print(frequency[i]+" ");
		// 	}
		// 	else
		// 	{
		// 		System.out.print(0+" ");
		// 	}
		// }

		// iterate over the frequency array, and find its length, by counting the number of non-zero elements

		int freq_len = 0;

		for(int i = 0; i < frequency.length; i++)
		{
			if(frequency[i] != 0)
			{
				freq_len++;
			}
		}
		
		// create a character array from the string, keeping only the non-zero elements

		char[] string = new char[freq_len];

		// create a frequency array, keeping only the non-zero elements

		int[] freq = new int[freq_len];

		int k = 0;

		for(int i = 0; i < frequency.length; i++)
		{
			if(frequency[i] != 0)
			{
				string[k] = (char)(i+97);

				freq[k] = frequency[i];

				k++;
			}
		}
 
		// sort the array, on the basis of the frequency of the elements, 
		// and keep the string array in syncronization with their respective frequency

		int size = string.length;

		// applying bubble sort

		for(int i = 0; i < size - 1; i++)
		{
			for(int j = 0; j < size - i - 1; j++)
			{
				// sort the array in descending order

				if(freq[j] < freq[j+1])
				{
					// swap the frequency array

					int temp = freq[j];

					freq[j] = freq[j+1];

					freq[j+1] = temp;

					// swap the character array to keep it in syncronization with its respective frequency

					char tmp = string[j];

					string[j] = string[j+1];

					string[j+1] = tmp;
				}
			}
		}

		// // generate a string from the character array

		// String res = string.toString();

		System.out.print("\nThe String Sorted in Descending order on the Basis of Frequency is : ");

		for(char ch : string)
		{
			System.out.print(ch);
		}
	}
}