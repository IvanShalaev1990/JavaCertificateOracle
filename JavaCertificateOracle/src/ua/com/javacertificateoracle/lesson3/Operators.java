package ua.com.javacertificateoracle.lesson3;

public class Operators {
    public static void main(String[] args) {
    int a = 0b101;
    int c = a-- - --a + ++a + a++ +a;
        System.out.println(c);
    }
}
