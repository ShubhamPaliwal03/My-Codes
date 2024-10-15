class Box <T> {

    private T value;

    public void add (T value) {

        this.value = value;
    }

    public T get () {

        return value;
    }
}

public class GenericClassesDemo {

    public static void main (String[] args) {

        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox =  new Box<>();

        integerBox.add(1);
        System.out.println(integerBox.get());

        stringBox.add("Hello");
        System.out.println(stringBox.get());

        integerBox.add(7);
        System.out.println(integerBox.get());

        stringBox.add("World");
        System.out.println(stringBox.get());
    }
}
