// WAP to input the name of a file and create a file object using the name of that file.
// If that file exists, then read the data of the file and print how many alphabets, digits and symbols are present in the file.
// If the file does not exist, then input data from the user and write that data on a newly created file.

import java.util.Scanner;
import java.io.*;

class FileHandlingTextContentAnalyzer
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the filename : ");

		System.out.println("\n-------------------");

		String filename = kb.nextLine();

		File file = new File(filename);

		if(!file.exists())
		{
			System.out.println("\nThe file "+filename+"does not exist! The program is creating such a file for you in the system in the path '"+file.getAbsolutePath()+"' .....");

			try
			{
				FileOutputStream fout = new FileOutputStream(filename);

				System.out.println("\nEnter the data you want to write to the file :\n");

				String data = kb.nextLine();

				kb.close();

				byte[] b = data.getBytes(); // converting string into byte array

				fout.write(b);

				fout.close();

				System.out.println("\nData written on file..."); 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		int alph = 0, dig = 0, sym = 0;

		try
		{
			FileInputStream fin = new FileInputStream(filename);

			int i=0; // to avoid leaving the variable 'i' uninitialized

			while((i=fin.read())!=-1)
			{

				if(i>=65 && i<=90 || i>=97 && i<=122) // an alphabet (a uppercase letter or a lowercase letter)
				{
					alph++;
				}
				else if(i>=48 && i<=57)
				{
					dig++;
				}
				else
				{ 
					sym++;
				}
			}

			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("\nIn the file "+filename+", the Number of : ");
		System.out.println("\nAlphabets are : "+alph);
		System.out.println("\nDigits are : "+dig);
		System.out.println("\nSymbols are : "+sym);
	}
}