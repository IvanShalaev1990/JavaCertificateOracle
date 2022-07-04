package ua.com.javacertificateoracle.lesson21.HomeWork;

public class Pet extends Animal{
    protected String name;
    protected final int tail = 1;
    protected final int paw = 4;
    public Pet(int eyes,String name){
        super(eyes);
        this.name = name;
        System.out.println("I'm Pet");
    }
    public void run(){
        System.out.println("Pet runs");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }
}
