class GenericsExample1
{
	// generics example

	public static <E> void printArray(E[] inputArray)
	{
		// display the array elements

		for(E element : inputArray)
		{
			System.out.printf("%s ", element); 

			// it prints the values like Integer, Double, and Character using %s format specifier,
			// in the form of a String, the classes which have toString() method defined in them, and extend the Object class.
		}

		System.out.println();
	}

	public static void main(String[] args)
	{
		// create arrays of Integer, Double, and Character

		Integer[] intArray = {1, 2, 3, 4, 5}; // create an Integer array

		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4}; // create a Double array

		Character[] charArray = {'H', 'E', 'L', 'L', 'O'}; // create a Character array

		System.out.print("\nArray integerArray Contains : ");

		printArray(intArray); // pass an integer array

		System.out.print("\nArray doubleArray Contains : ");

		printArray(doubleArray); // pass a double array

		System.out.print("\nArray charArray Contains : ");

		printArray(charArray); // pass a character array
	}
}