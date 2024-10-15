class MainThreadDemo
{
    public static void main (String[] args) {

        // get a reference to the main thread

        Thread mainThread = Thread.currentThread();

        // set the name of the main thread

        mainThread.setName("MyMainThread");

        // display the name of the main thread

        System.out.println("Name of the main thread: " + mainThread.getName());
    }
}