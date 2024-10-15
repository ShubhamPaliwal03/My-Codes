public class GenericsDemoMaxValue {

    // Generic Method with Bounded Type parameters

    public static <T extends Comparable<T>> T calcMax(T x, T y, T z) {

        T max = x;

        if (y.compareTo(max) > 0) {

            max = y;
        }

        if (z.compareTo(max) > 0) {

            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(calcMax(1, 2 , 3));
        System.out.println(calcMax(1.5, 4.5 , 3.7));
        System.out.println(calcMax("Shubham", "Tarun", "Mohit"));
        System.out.println(calcMax('a', 'b', 'c'));
    }
}
