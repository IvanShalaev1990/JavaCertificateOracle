package ua.com.javacertificateoracle.lesson23;

public class Tiger {
    public void eat(String s){
        if (!s.equals("myaso")){
            throw new NeMysoExeption("Tiger does not eats " + s);
        }
        System.out.println("Tiger eats only " + s);
    }
    public void drink(String s) throws NeVodaExeption{
        if (!s.equals("whater")){
            throw new NeVodaExeption("Tiger does not drinks " + s);
        }
        System.out.println("Tiger drinks only " + s);
    }
}
