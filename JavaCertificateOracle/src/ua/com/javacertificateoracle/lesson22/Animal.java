package ua.com.javacertificateoracle.lesson22;

public abstract class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void eat();
    public abstract void sleep();
}
