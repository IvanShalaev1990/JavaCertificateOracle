package ua.com.javacertificateoracle.lesson21.HomeWork;

public class HomeWorkTest {
    public static void main(String[] args) {
        Dog myDog = new Dog(2, "Lucky");
        Cat myCat = new Cat(1, "Unlucky");
        System.out.println(myDog.name);
        System.out.println(myCat.name);
       myDog.play();
       myCat.sleep();
       myCat.drink();
       myDog.eat();
    }
}
