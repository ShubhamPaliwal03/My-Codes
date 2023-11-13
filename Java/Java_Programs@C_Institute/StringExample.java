class StringExample
{
	public static void main(String[] args)
	{
		String s1 = new String("Hello World!");

		System.out.println(s1);

		byte bArr[] = {65, 66, 67, 68, 69};

		String s2 = new String(bArr);

		char cArr[] = {'T', 'A', 'R', 'U', 'N'};

		String s3 = new String(cArr);

		System.out.println(s1); 								// Hello World
		System.out.println(s2); 								// ABCDE
		System.out.println(s3); 								// TARUN

		System.out.println(s1.length()); 						// 11

		System.out.println(s3.startsWith("T")); 				// true

		System.out.println(s3.endsWith("T")); 					// false

		System.out.println(s3.contains("R")); 					// true

		System.out.println(s3.equals("Tarun")); 		  		// false

		System.out.println(s3.equalsIgnoreCase("Tarun")); 		// true

		System.out.println(s3.compareTo("Tarun")); 				// -

		System.out.println(s3.compareToIgnoreCase("Tarun"));	// 0

		System.out.println(s3.toLowerCase()); 					// tarun

		System.out.println(s3.toUpperCase()); 					// TARUN
	}
}