class MyThreadDemo extends Thread
{
    private String threadName;

    MyThreadDemo(String threadName)
    {
        super(threadName);
        this.threadName = threadName;
        start();
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Starting " + threadName + " thread...");

            for (int i = 1; i <= 5; i++)
            {
                System.out.println("Thread " + threadName + " running " + i + "th time...");

                Thread.sleep(1000);
            }

            System.out.println("Thread " + threadName + " finished running....");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class CreatingThreadByExtendingThreadClass
{
    public static void main(String[] args)
    {
        Thread mainThread = Thread.currentThread();

        System.out.println("Main Thread: " + mainThread.getName() + " started...");

        MyThreadDemo t1 = new MyThreadDemo("Shubham");

        System.out.println("Is Thread Shubham alive ? " + t1.isAlive());

       try
       {
           t1.join();
       }
       catch (InterruptedException e)
       {
           System.out.println(e);
       }

        System.out.println("Is Thread Shubham alive ? " + t1.isAlive());

        MyThreadDemo t2 = new MyThreadDemo("Tarun");

        try
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println("Thread " + mainThread.getName() + " running " + i + "th time...");
                Thread.sleep(2500);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        MyThreadDemo t3 = new MyThreadDemo("Vishwajeet");
        MyThreadDemo t4 = new MyThreadDemo("Surendra");
        MyThreadDemo t5 = new MyThreadDemo("Mohit");

        System.out.println("Main Thread: " + mainThread.getName() + " finished...");
    }
}