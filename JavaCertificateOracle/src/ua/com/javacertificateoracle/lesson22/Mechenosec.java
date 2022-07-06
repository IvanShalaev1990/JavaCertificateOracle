package ua.com.javacertificateoracle.lesson22;

public class Mechenosec extends Fish{
    public Mechenosec(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Mechenosec riba kotoraya krasivo plavaet");
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec ne hishnaya riba, on est obichniy korm");
    }

}
