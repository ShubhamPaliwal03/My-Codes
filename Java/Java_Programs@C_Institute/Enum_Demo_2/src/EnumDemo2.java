enum Car {

    Lamborghini(900), Suzuki(50), Toyota(70), Ford(80);

    private int price;

    Car (int price) {

        this.price = price;
    }

    int getPrice() {

        return price;
    }
}

public class EnumDemo2 {

    public static void main (String[] args) {

        for (Car car : Car.values()) {

            System.out.println(car + " : $" + car.getPrice() + "K");

//            System.out.println(STR."\{car} : $\{car.getPrice()}K");
        }
    }
}