package ua.com.javacertificateoracle.lesson9;

public class CarTest {
    public static void main(String[] args) {
        Car Lamba = new Car(
                "Lambargini",
                Color.YELLOW,
                "V8",
                BodyType.COUPE);
        Car Fera = new Car(
                "Ferrari",
                Color.RED,
                "V8",
                BodyType.SEDAN);
        Car AstonMartin = new Car(
                "Aston Martin",
                Color.BLUE,
                "V8",
                BodyType.HATCHBACK);
        Car BMW = new Car(
                "BMW",
                Color.BLACK,
                "V6",
                BodyType.SEDAN);
        Car Micro = new Car(
                "Micro",
                Color.PINK,
                "V4",
                BodyType.MICRO);
        Lamba.info();
        Fera.info();
        AstonMartin.info();
        BMW.info();
        Micro.info();
        Lamba = null;
        Fera = null;
        AstonMartin = null;
    }
}
