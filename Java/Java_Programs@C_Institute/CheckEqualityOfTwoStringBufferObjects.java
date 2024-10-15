class CheckEqualityOfTwoStringBufferObjects
{
	// we have to create our own method because the definition of equals() in StringBuffer just considers references for checking equality

	public static boolean areEqual(StringBuffer sb1, StringBuffer sb2)
	{
		// 1. check if the objects have the same references

		if(sb1.equals(sb2))
		{
			return true;
		}

		// if(sb1.hashCode() == sb2.hashCode())
		// {
		// 	return true;
		// }

		// 2. check if the objects vary in content

		// a) check if the objects vary in length

		if(sb1.length() != sb2.length())
		{	
			return false;
		}

		// b) check if the objects don't have same characters in same order

		for(int i = 0; i < sb1.length(); i++)
		{
			if(sb1.charAt(i) != sb2.charAt(i))
			{
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Hi");

		StringBuffer sb2 = new StringBuffer("Hi");

		// StringBuffer sb2 = new StringBuffer("Bye");

		// StringBuffer sb2 = sb1;

		System.out.println(areEqual(sb1, sb2));
	}
}