import java.util.Scanner;

class VariableArityFunctionReturnSortedArray
{
	static int[] SortArray(int ... arr)
	{
		// implementing straight selection sort algorithm
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] 	 = arr[j];
					arr[j]   = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String args[])
	{
		int sorted[] = SortArray(5,-7,4,6,1,-9,-2,7);

		System.out.print("The entered Array in Sorted Order is : ");

		for(int n:sorted)
		{
			System.out.print(n+" ");
		}
	}
}