public class GenericsDemoPrintMethod {

    public static <T> void printArray(T[] arr) {

        for (T val : arr) {

            System.out.print(val + " ");
        }

        System.out.println("\n");
    }

    public static void main (String[] args) {

        printArray(new String[]{"Hello", "World"});
        printArray(new Integer[]{1, 3});
        printArray(new Double[]{1.4, 2.0, 3.7});
        printArray(new Boolean[]{true, false});
        printArray(new Character[]{'a', 'b', 'c'});
        printArray(new Short[]{1, 2, 3});
        printArray(new Long[]{1L, 2L, 3L});
        printArray(new Float[]{1.1f, 2.2f, 3.3f});
        printArray(new Byte[]{1, 2, 3});
    }
}
