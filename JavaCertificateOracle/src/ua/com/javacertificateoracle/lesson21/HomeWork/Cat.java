package ua.com.javacertificateoracle.lesson21.HomeWork;

public class Cat extends Pet{
    public Cat(int eyes, String name){
        super(eyes, name);
        System.out.println("I'm Cat & my name is " + name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
