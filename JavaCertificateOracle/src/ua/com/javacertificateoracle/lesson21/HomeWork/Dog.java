package ua.com.javacertificateoracle.lesson21.HomeWork;

public class Dog extends Pet{
    public Dog(int eyes, String name){
        super(eyes, name);
        System.out.println("I'm Dog & my name is " + name);
    }
    public void play(){
        System.out.println("Dog plays");
    }
}
