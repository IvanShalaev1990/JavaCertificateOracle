package ua.com.javacertificateoracle.lesson22;

public interface Speakable {
    default void speak(){
        System.out.println("Some body speaks");
    }
}
