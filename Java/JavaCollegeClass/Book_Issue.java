class Library
{
	int b_no;
	
	public void SetBookNo(int x)
	{
		b_no = x;
	}

	public void displayBN()
	{
		System.out.println("\nBook Number : "+b_no);
	}
}

class Book_Bank extends Library

{
	String author;
	String title;

	public void SetBookAT(String a, String t)
	{
		author = a;
		title = t;		
	}

	public void displayAT()
	{
		System.out.println("\nAuthor : "+author);
		System.out.println("\nTitle : "+title);
	}
}

interface Author
{
	String auth = "Yashwant Kanetkar";
	void displayA();	
}

class Test extends Book_Bank implements Author
{
	public void displayA()
	{
		System.out.println("\nThe Author of the book is : "+auth);
	}
	
	public void displayMain()
	{
		displayBN();
		displayAT();
		displayA();
	}
}

class Book_Issue
{
	public static void main(String args[])
	{
		Test T = new Test();
		
		T.SetBookNo(1151);
		T.SetBookAT("Abhishek","Let Us C");
		T.displayMain();				
	}
}