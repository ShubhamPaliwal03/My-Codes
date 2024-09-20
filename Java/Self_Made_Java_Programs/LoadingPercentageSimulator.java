import java.io.IOException;
import java.io.Runtime;

class LoadingPercentageSimulator
{
	public static void main(String[] args) throws IOException
	{
		for(int i = 0; i <= 100; i++)
		{
			Runtime.getRuntime().exec("cls");

			System.out.print("\nLoading : "+i+" %");

			try
			{
				Thread.sleep(100);
			}

			catch(Exception e)
			{
				System.out.println("Error : "+e);
			}
		}
	}
}