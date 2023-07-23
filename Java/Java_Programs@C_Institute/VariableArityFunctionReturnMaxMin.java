import java.util.Scanner;

class VariableArityFunctionReturnMaxMin
{
	// static int[] getMaxMin(int ... num)
	// {
	// 	int max = -2147483648;
	// 	int min = 2147483647;

	// 	int extremes[] = new int[2];

	// 	for(int n:num)
	// 	{
	// 		if(n>max)
	// 		{
	// 			max = n;
	// 		}

	// 		if(n<min)
	// 		{
	// 			min = n;
	// 		}
	// 	}

	// 	extremes[1] = max;

	// 	extremes[0] = min;

	// 	return extremes;
	// }

	static int[] getMaxMin(int ... x)
	{
		int minMax[] = {x[0],x[0]}; // ie., initializing the min and max to the var arg array's first argument

		for(int n:x)
		{
			if(n>minMax[1])
			{
				minMax[1] = n;
			}

			if(n<minMax[0])
			{
				minMax[0] = n;
			}
		}

		return minMax;
	}

	public static void main(String args[])
	{
		int minMax[] = getMaxMin(1,2,3,-3,-2,-1);

		System.out.println("Maximum is : "+minMax[1]);
		System.out.print("Minimum is : "+minMax[0]);
	}
}