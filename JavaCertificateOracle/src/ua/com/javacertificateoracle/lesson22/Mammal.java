package ua.com.javacertificateoracle.lesson22;

public abstract class Mammal extends Animal implements Speakable{
    public Mammal(String name){
        super(name);
    }
    public abstract void run();
}
