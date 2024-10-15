import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIDemo {

    public static void main (String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 8, 9);

        // Example 1 (Creating a Stream) :-

        // create a stream of integer type data

        Stream<Integer> data = nums.stream();

        System.out.println("The Stream of integers is as follows :\n");

        data.forEach(n -> System.out.println(n));

        System.out.println();

        // Using a stream after consuming it (as stated below) gives the following error :-
        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

        // data.forEach(n -> System.out.println(n));

        // Example 2 (Finding the size of a Stream) :-

        data = nums.stream();

        long count = data.count();

        System.out.println("The size of the stream is : " + count);

        System.out.println();

        // data.forEach(n -> System.out.println(n)); // gives error

        // Example 3 (Sorting a Stream) :-

        data = nums.stream();

        Stream<Integer> sortedData = data.sorted();

        System.out.println("The sorted Stream of integers is as follows :\n");

        sortedData.forEach(n -> System.out.println(n));

        System.out.println();

        // Example 4 (Doubling the values of a Stream using map() function) :-

        data = nums.stream();

        Stream<Integer> doubledData = data.map(n -> n * 2);

        System.out.println("The stream of integers having doubled values is as follows :\n");

        doubledData.forEach(System.out::println);

        System.out.println();

        // Example 5 (Mapping in a more concise form) :-

        nums.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.println(n));

        System.out.println("The stream of integers having squared values is as follows :\n");

        System.out.println();

        // Example 6 ((Using an object of anonymous class implementing Function functional interface to map values of a Stream with cuber function to cube them)) :-

        Function<Integer, Integer> cuber = new Function() {

            @Override
            public Object apply(Object o) {

                int n = (int)o;

                return n * n * n;
            }
        };

        data = nums.stream();

        System.out.println("The stream of integers having cubed values is as follows :\n");

        data.
             map(cuber)
                     .forEach(n -> System.out.println(n));

        System.out.println();

        // Example 7 (Filtering out odd values from the Stream, based on a Predicate, using filter() function) :-

        System.out.println("The stream of integers having odd values is as follows :\n");

        nums.stream()
                .filter(n -> n % 2 == 1)
                .forEach(n -> System.out.println(n));

        System.out.println();

        // Example 8 (Using multiple functions together) :-

        System.out.println("The stream of integers after filtering, sorting, and mapping is as follows :\n");

        nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));

        System.out.println();

        // Example 9 (Using an object of anonymous class implementing the Predicate functional interface to filter out values from a Stream) :-

        Predicate<Integer> oddTestPredicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {

                return n % 2 == 1;
            }
        };

        // OR

        // Using Lambda expression and storing the Predicate

        // Predicate<Integer> oddTestPredicate = n -> n % 2 == 1;

        System.out.println("The stream of integers having odd values is as follows :\n");

        nums.stream()
                .filter(oddTestPredicate)
                .forEach(n -> System.out.println(n));

        System.out.println();

        // Example 10 (Reducing the stream of integers into their sum, using reduce() function) :-

        int sum = nums.stream()
                .reduce(0, (acc, num) -> acc + num);

        System.out.println("The sum of the numbers is : " + sum);

        System.out.println();

        // Example 11 (Using an object of anonymous class implementing BinaryOperator interface to reduce the values to their sum)

        BinaryOperator<Integer> summer = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer acc, Integer num) {

                return acc + num;
            }
        };

        int initialSum = 0;

        int Sum = nums.stream()
                .reduce(initialSum, summer);

        System.out.println("The sum of the numbers is : " + Sum);

        System.out.println();

        // Example 12 (Using parallelStream to filter, map, and reduce the data of the stream) :-

        int newSum = nums.parallelStream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (acc, num) -> acc + num);

        // 4, 8 => 8, 16 => 8 + 16 => 24

        System.out.println("The sum of the after filtering and mapping numbers stored in a parallelStream is : " + newSum);

        System.out.println();
    }
}