package arithmetic;

public class Math
{
	public int reverse(int num)
	{
		int reverse = 0;

		while(num > 0) // or num != 0
		{
			int digit = num % 10;

			reverse = reverse * 10 + digit;

			// using reverse *= 10 + digit destroys the logic here, due to operator precedence, 
			// because 10 + digit is calculated first and then the result is multiplied by reverse

			num /= 10;
		}

		return reverse;
	}

	public int getLength(int num)
	{
		int length = 0;

		while(num > 0) // or num != 0
		{
			length++;

			num /= 10;
		}

		return length;
	}

	public int getLastDigit(int num)
	{
		return num % 10; // returns the last digit
	}
}