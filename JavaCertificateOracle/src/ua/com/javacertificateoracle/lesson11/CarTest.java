package ua.com.javacertificateoracle.lesson11;

import ua.com.javacertificateoracle.lesson9.Color;

public class CarTest {
    public static void main(String[] args) {
         Car Lamba = new Car(
                 "Lambargini",
                 Color.YELLOW,
                 4
         );
         Car Ferra = new Car(
                 "Ferrari",
                 Color.RED,
                 2
         );
         Lamba.info();
         Ferra.info();
         Car.switchColor(Lamba, Ferra);
         Lamba.setNumberOfDoors(2);
         Ferra.setNumberOfDoors(4);
         Lamba.info();
         Ferra.info();
    }
}
