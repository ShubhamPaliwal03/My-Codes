import java.io.File;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		// input path

		System.out.print("Enter Path : ");
		String path = kb.next();

		// create file instance

		File file = new File(path);

		System.out.println("\n"+file.getName() + " exists "+file.exists());

		System.out.println(file.getName() + " is file "+file.isFile());

		System.out.println(file.getName() + " is directory "+file.isDirectory());

		System.out.println(file.getName() + " is executable "+file.canExecute());

		System.out.println(file.getName() + " is readable "+file.canRead());

		System.out.println(file.getName() + " is writable "+file.canWrite());

		System.out.println(file.getName() + " is absolute "+file.isAbsolute());

		System.out.println(file.getName() + " is created "+file.mkdir());

		System.out.println(file.getName() + " is deleted "+file.delete());

		System.out.println(file.getName() + " is created with intermediates "+file.mkdirs());
	}
}