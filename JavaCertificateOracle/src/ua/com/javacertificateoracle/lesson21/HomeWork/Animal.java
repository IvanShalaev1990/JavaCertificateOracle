package ua.com.javacertificateoracle.lesson21.HomeWork;

public class Animal {
    protected int eyes;
    public Animal(int eyes){
        this.eyes = eyes;
        System.out.println("I'm Animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void drink(){
        System.out.println("Animal drinks");
    }
}
