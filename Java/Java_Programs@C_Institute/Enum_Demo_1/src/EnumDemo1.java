enum Season {

    Summer,
    Spring,
    Winter,
    Fall
}

public class EnumDemo1 {

    public static void main (String[] args) {

        for (Season s : Season.values()) {

            System.out.println(s);
        }
    }
}