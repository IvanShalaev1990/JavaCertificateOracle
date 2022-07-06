package ua.com.javacertificateoracle.lesson22;

public class Lion extends Mammal{
    public Lion(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Lev kak vse hishniki lubit myso");
    }

    @Override
    public void sleep() {
        System.out.println("Bolshuu chast dnya lev spit");
    }

    @Override
    public void run() {
        System.out.println("Lev ne samaya bistraya koshka");
    }
}
