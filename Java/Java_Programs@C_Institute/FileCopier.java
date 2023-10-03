// WAP to input path of a source file and a destination file, and copy the contents of source file into the destination file.
// You can use FileInputStream, FileOutputStream or FileReader, FileWriter.

import java.util.Scanner;
import java.io.*;

class FileCopier
{
	public static void main(String[] args)throws Exception
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the name of the source file along with extension : ");

		String source =  kb.nextLine();

		File s_file = new File(source);

		if(s_file.exists())
		{
			System.out.print("\nEnter the name of the destination file with extension : ");

			String destination = kb.nextLine();

			File d_file = new File(destination);

			if(!s_file.exists())
			{
				// if the file does not exist, FileWriter creates a new file.

				System.out.println("\nThe destination file '"+destination+" ' does not exist!\n\nThe program is creating a destination file"+destination+"for you....");
			}

			FileReader fr = new FileReader(source);

			int i;

			String data = "";

			while((i=fr.read())!=-1)
			{
				data = data.concat(String.valueOf((char)i));
			}

			System.out.println("\nThe Data has been read from the source file '"+source+"' ......");

			fr.close();

			try
			{
				FileWriter fw = new FileWriter(destination);

				fw.write(data);

				fw.close();
			}

			catch(Exception e)
			{
				System.out.print(e);
			}

			System.out.println("\nThe Data has been written into the destination file '"+destination+"' ......");

			System.out.println("\n\nCheck the filepath : '"+d_file.getAbsolutePath()+"'");
		}			
		else
		{
			System.out.println("\nThe source file '"+source+"' does not exist!\n\nTerminating the program.....");
		}
	}	
}