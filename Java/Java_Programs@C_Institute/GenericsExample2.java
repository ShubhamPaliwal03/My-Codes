class GenericsExample2
{
	// determines the largest of the three Comparable objects

	public static <T extends Comparable<T>> T maximum(T x, T y, T z)
	{
		// assume x is initially the largest

		T max = x;

		// n1.compareTo(n2) returns a positive integer if n1 is greater than n2

		if(y.compareTo(max) > 0)
		{
			max = y; // y is the largest so far
		}

		if(z.compareTo(max) > 0)
		{
			max = z; // z is the largest now
		}

		return max;
	}

	public static void main(String[] args)
	{
		System.out.printf("\nMax of %d, %d, and %d is : %d\n\n", 3, 4, 5, maximum(3, 4, 5));

		System.out.printf("\nMax of %.1f, %.1f, and %.1f is : %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

		System.out.printf("\nMax of %s, %s, and %s is : %s\n\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
	}
}