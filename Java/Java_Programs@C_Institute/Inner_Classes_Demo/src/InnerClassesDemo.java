class OuterClass {

    int x = 10;

    // inner class can also be declared as private, if we don't want outside objects to access the inner class

    class InnerClass {

        int y = 20;

        public int getX() {

            return x;
        }
    }

    static class StaticInnerClass {

        int z = 30;
    }
}

public class InnerClassesDemo {

    public static void main(String[] args) {

        // creating an object of inner class (requires creating an object of outer class)

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer.x + " " + inner.y);

        // objects of inner class can access instance variables of outer class with the help of getter methods

        System.out.println(inner.getX());

        // creating an object of static inner class (doesn't require creating an object of outer class)

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        System.out.println(staticInner.z);
    }
}