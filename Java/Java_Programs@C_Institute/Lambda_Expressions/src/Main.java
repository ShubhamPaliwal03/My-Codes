// functional interface

@FunctionalInterface
interface A {

    void show(); // we can have only one non-overriding abstract method
    String toString(); // we can have overriding method(s)
}

// creating a class which implements the functional interface

class B implements A {

    public void show() {

        System.out.println("Hi from show() of class B!");
    }
}

public class Main {

    public static void main(String[] args) {

        // instantiating an object of a class that implements interface A

        A obj1 = new B();

        obj1.show();

        // instantiating an object of an anonymous class

        A obj2 = new A () {

            public void show() {

                System.out.println("Hi from show() of anonymous inner class!");
            }
        } ;

        obj2.show();

        // instantiating an object using a lambda expression

        A obj3 = () -> System.out.println("Hi from show() defined by lambda expression!");

        obj3.show();
    }
}