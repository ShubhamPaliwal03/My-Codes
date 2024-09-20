class BruteForceAttack
{
	public static void main(String[] args)
	{
		String targetPassword = "6372149"; // the password that you want to crack
		int maxLength = 7;				// the length of the password that you want to crack

		boolean found = false;

		for (int i = 0; i < Math.pow(10, maxLength); i++)
		{
			String guess = String.format("%0" + maxLength + "d", i);

			if (guess.equals(targetPassword))
			{
				System.out.println("Password Found : " + guess);

				found = true;
				break;
			}
		}

		if (!found)
		{
			System.out.println("Password Not Found.");
		}
	}
}