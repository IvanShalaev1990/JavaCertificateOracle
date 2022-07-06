package ua.com.javacertificateoracle.lesson22;

public class TestLesson22 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Mechenosec");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        Speakable pingvin = new Pingvin("Pingvin");
        pingvin.speak();
        Animal lev = new Lion("Lev");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();
        Mammal lev2 = new Lion("lev2");
        System.out.println(lev2.name);
        lev2.eat();
        lev2.run();
        lev2.sleep();
        lev2.speak();
    }
}
