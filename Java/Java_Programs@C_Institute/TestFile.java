import java.util.Scanner;
import java.io.File;
class Main{
	static int funcTry(File arg){
		if(arg.isDirectory())
		{

			if(arg.listFiles().length == 0){
				return 0;
			}
			for(String x : arg.list()){
				System.out.println(x);
			}
			for(File x : arg.listFiles()){
				funcTry(x);
			}
		}
			return 1;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the path : ");
		String path = sc.next();
		File file = new File(path);

		System.out.println("All Files :");
		funcTry(file);
	}
}