package ua.com.javacertificateoracle.lesson22;

public abstract class Fish extends Animal{
    public Fish(String name){
        super(name);
    }
    public abstract void swim();
    @Override
    public void sleep() {
        System.out.println("Vsegda interestno nabludat kak ribi spyt");
    }
}
