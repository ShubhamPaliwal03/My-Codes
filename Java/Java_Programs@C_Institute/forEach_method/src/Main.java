import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Part of M-1

class ConsumerDemo implements Consumer<Integer> {

    @Override
    public void accept(Integer i) {

        System.out.println(i);
    }
}

public class Main {

    public static void main (String[] args) {

        // defining an arraylist

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // M-1 : Using a class that implements the Consumer functional interface, creating and storing
        // an instance of it, and passing it to the forEach method

        Consumer<Integer> consumer1 = new ConsumerDemo();

        System.out.println("Printing using M-1 :\n");

        list.forEach(consumer1);

        System.out.println();

        // M-2 : Using an anonymous inner class of Consumer functional interface, creating and storing
        // an instance of it, and passing it to the forEach method

        Consumer<Integer> consumer = new Consumer<Integer>() {

            @Override
            public void accept(Integer i) {

                System.out.println(i);
            }
        };

        System.out.println("Printing using M-2 :\n");

        list.forEach(consumer);

        System.out.println();

        // M-3 : Using anonymous inner class of Consumer functional interface, creating and passing it directly
        // to the forEach method (without storing it)

        System.out.println("Printing using M-3 :\n");

        list.forEach(new Consumer<Integer>() {

            @Override
            public void accept (Integer i) {

                System.out.println(i);
            }
        });

        System.out.println();

        // M-4 : Using lambda expression to create and store an instance of class that implements Consumer interface

        Consumer<Integer> cons = (Integer i) -> System.out.println(i);

        System.out.println("Printing using M-4 :\n");

        list.forEach(cons);

        System.out.println();

        // M-5 : Using lambda expression with forEach loop (replacing the anonymous class with lambda expression)

        System.out.println("Printing using M-5 :\n");

        list.forEach(n -> System.out.println(n));

        System.out.println();

        // M-6 : Using lambda expression with forEach loop, but directly using method reference to call the method

        System.out.println("Printing using M-6 :\n");

        list.forEach(System.out::println);
    }
}