import java.util.Scanner;
import java.io.*;

class PrintFileContentsMultithreading
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter file name : ");

		String filename = kb.next();

		File file = new File(filename);

		if(file.exists())
		{
			Thread main = Thread.currentThread();

			try
			{
				FileInputStream fin = new FileInputStream(file);

				int i;

				while((i = fin.read()) != -1)
				{
					char ch = (char)i;

					System.out.print(ch+" ");

					i++;

					main.sleep(100);
				}

				fin.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("File Does Not Exist!");
		}
	}
}