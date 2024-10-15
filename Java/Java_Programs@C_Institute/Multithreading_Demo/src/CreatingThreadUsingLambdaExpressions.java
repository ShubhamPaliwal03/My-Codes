public class CreatingThreadUsingLambdaExpressions {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> System.out.println("Thread 1 running..."));
        t1.start();

        Runnable r1 = () -> System.out.println("Thread 2 running...");
        r1.run();
    }
}