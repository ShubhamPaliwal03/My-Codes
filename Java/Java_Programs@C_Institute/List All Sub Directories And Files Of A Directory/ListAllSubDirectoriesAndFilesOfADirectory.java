import java.io.File;
import java.util.Scanner;

class Main
{
	// public static int level = 0;

	static void showAll(File file)
	{		
		if(file.isDirectory())
		{
			File[] files_and_dirs = file.listFiles();

			// The below condition is to prevent null pointer exception at runtime, because 'file.listFiles()'' returns an array of files and directories contained 
			// within the current directory. However, it may contain 'null' elements for entries that are not accessible, this becomes the reason
			// for 'NullPointerException'.
			// To solve this, we should first check if 'file.listFiles' returns 'null' before iterating through it.

 			// Using file.list().length with a null value can also generate a NullPointerException. The list() method in Java returns an
 			// array of strings representing the names of files and directories in the specified directory. If the directory is empty or
 			// does not exist, it returns null.

			// If we attempt to access the .length property of a null array, it will result in a NullPointerException.
			// To avoid this, we should always check whether the array returned by file.list() is null before trying to access its length or iterate through its elements,
			// just like we should do with file.listFiles() as told earlier.

			if(files_and_dirs != null)
			{
				if(file.list().length == 0)
				{
					System.out.print("\n\nThe Directory '"+file.getName()+"' is Empty!");
					System.out.println("\n\n---------------------------");
					return;
				}

				// System.out.println("\n\nLEVEL - "+level+" of File Path : ");
				// System.out.println("\n************************");

				System.out.println("\n\nThe Directory '"+file.getName()+"' contains the following "+file.list().length+" items :");
				System.out.println("\n\n-------------------------------------------------------------------");

				for(String filename : file.list())
				{
					System.out.print("\n"+filename);
				}

				System.out.println("\n\n------------------------------------------------");

				for(File fileobject : files_and_dirs)
				{
					showAll(fileobject);
				}
			}	
		}

		if(file.isFile())
		{
			return;
		}
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the file path : ");

		String path = kb.nextLine();

		File file = new File(path);

		if(!file.exists())
		{
			System.out.print("File path '"+path+"' does not exist!");
		}
		else
		{
			showAll(file);
		}

		System.out.println("\nAll directories, sub-directories, and files present in file path '"+path+"' have been successfully displayed above level by level.....");
	}
}