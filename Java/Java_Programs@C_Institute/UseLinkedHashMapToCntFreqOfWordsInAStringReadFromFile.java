import java.util.*;
import java.io.*;

class UseLinkedHashMapToCntFreqOfWordsInAStringReadFromFile
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the Absoulte Address (Path) of the text file which you want to use : ");

		String path = kb.nextLine();

		StringBuilder sb = new StringBuilder();

		try
		{
			FileInputStream fin = new FileInputStream(path);

			BufferedInputStream bin = new BufferedInputStream(fin);

			int i = 0;

			while((i = bin.read()) != -1)
			{
				sb.append((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

		String[] words = sb.toString().toLowerCase().split(" "); 

		LinkedHashMap<String, Integer> fMap = new LinkedHashMap<>();

		for(String word : words)
		{
			fMap.put(word ,fMap.getOrDefault(word, 0) + 1);
		}

		System.out.println("\nThe Frequency of Each Word in the text extracted from the given file is as follows : ");

		for(String key : fMap.keySet())
		{
			System.out.println("\n"+key+" : "+fMap.get(key));
		}
	}
}