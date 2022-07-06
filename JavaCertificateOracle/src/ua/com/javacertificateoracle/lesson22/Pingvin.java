package ua.com.javacertificateoracle.lesson22;

public class Pingvin extends Bird{
    public Pingvin(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Pingvin lubit est ribu");
    }

    @Override
    public void sleep() {
        System.out.println("Pingviny spyt prigavshis drug k drugu");
    }

    @Override
    public void speak() {
        System.out.println("Pingviny ne pout kak solovyi");
    }

    @Override
    public void fly() {
        System.out.println("Pingviny ne umeut letat");
    }
}
