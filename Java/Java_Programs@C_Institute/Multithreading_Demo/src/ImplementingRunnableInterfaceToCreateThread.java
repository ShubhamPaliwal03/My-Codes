class MyThread implements Runnable
{
    private Thread t;
    private String threadName;

    public MyThread(String threadName)
    {
        this.threadName = threadName;
        t = new Thread(this, threadName);

        System.out.println("Starting " + threadName + " thread...");
        t.start(); // calls the run method
    }

    @Override
    public void run()
    {
        try
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println("Thread " + threadName + " running " + i + "th time...");
                Thread.sleep(500);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class ImplementingRunnableInterfaceToCreateThread
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread m1 = new MyThread("My Thread 1");

        for (int i = 1; i <= 5; i++) {

            System.out.println("Main Thread running " + i + "th time...");
            Thread.sleep(100);
        }
    }
}