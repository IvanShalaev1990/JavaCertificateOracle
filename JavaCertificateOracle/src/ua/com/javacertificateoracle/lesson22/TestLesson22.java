package ua.com.javacertificateoracle.lesson22;

public class TestLesson22 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Mechenosec");
        Pingvin pingvin = new Pingvin("Pingvin");
        Lion lev = new Lion("Lev");
        Animal[] array2 = {mechenosec, pingvin, lev};
        Speakable[] array3 = { pingvin, lev};
        for (Animal animal:
             array2) {
            if (animal instanceof Mechenosec){
                ((Mechenosec)animal).sleep();
                ((Mechenosec)animal).eat();
                ((Mechenosec)animal).swim();
            }
            if (animal instanceof Pingvin){
                ((Pingvin)animal).sleep();
                ((Pingvin)animal).eat();
                ((Pingvin)animal).fly();
            }
            if (animal instanceof Lion){
                ((Lion)animal).sleep();
                ((Lion)animal).eat();
                ((Lion)animal).run();
            }
        }
        for (Speakable animal:
                array3) {
            if (animal instanceof Pingvin){
                ((Pingvin)animal).sleep();
                ((Pingvin)animal).eat();
                ((Pingvin)animal).fly();
                ((Pingvin)animal).speak();
            }
            if (animal instanceof Lion){
                ((Lion)animal).sleep();
                ((Lion)animal).eat();
                ((Lion)animal).run();
                ((Lion)animal).speak();
            }
        }
    }
}
