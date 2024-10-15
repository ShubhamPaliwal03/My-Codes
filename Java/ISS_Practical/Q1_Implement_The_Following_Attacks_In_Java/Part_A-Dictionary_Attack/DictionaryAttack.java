import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class DictionaryAttack
{
	public static void main(String[] args)
	{
		String targetPassword = "password123";    // the password you want to crack
		String dictionaryFile = "dictionary.txt"; // the file containing the potential passwords

		try (BufferedReader reader = new BufferedReader(new FileReader(dictionaryFile)))
		{
			String password;

			while ((password = reader.readLine()) != null)
			{
				if(password.equals(targetPassword))
				{
					System.out.println("Password Found : " + password);

					return;
				}
			}

			System.out.println("Password Not Found!");
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}