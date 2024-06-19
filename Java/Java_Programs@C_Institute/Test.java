class Test
{
	public static <E extends Number> E calcSum(E[] arr)
	{
		E sum = arr[0];

		for(E val : arr)
		{
			sum += val; // i
		}

		return sum - arr[0]; // ii

		// this is going to give error of bad operand types at i and ii
	}

	public static void main(String[] args)
	{
		Integer[] intArray = {1,2,3};

		Float[] floatArray = {1.1f,2.1f,3.1f};

		Double[] doubleArray = {1.1,2.1,3.1};

		System.out.println(calcSum(intArray));
		System.out.println(calcSum(floatArray));
		System.out.println(calcSum(doubleArray));
	}
}