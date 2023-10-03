class Mythread implements Runnable
{
	private Thread t;

	private String name;

	public Mythread(String name)
	{
		this.name = name;

		t = new Thread(this,name);

		System.out.println("\nStarting "+ name +" thread...");

		t.start(); // calls the run()
	}

	// we cannot use extends InterruptedException here because we are overriding the method run() present in the class implemented from 
	// the Runnable interface, and the run() method does not have throws in its definition.

	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("\n"+name+" running "+i+" th time...");

				Thread.sleep(500); // sleep for 0.5s or 500ms
			}

			System.out.println("\nExiting from "+name+" thread...");
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Main
{
	public static void main(String[] args)throws InterruptedException // or we can also use a try-catch block
	{
		Mythread m1 = new Mythread("Mr. Threaddy");

		for(int i=1;i<=5;i++)
		{
			System.out.println("\nMain thread running "+i+" th time");
			Thread.sleep(500);
		} 

		System.out.println("\nExiting from the main thread....");
	}
}