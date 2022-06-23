package ua.com.javacertificateoracle.lesson8;

public class NoneAccessModifiers {
    public static int multiplies(int a, int b, int c){
        return a * b * c;
    }
    public static void divide(int a, int b){
        System.out.println((a/b) + " " + (a%b));
    }
    public static final double PI = 3.14;
    public double PCircle( double r){
        return PI * (r * r);
    }
    public static double circumference(double r){
        return 2 * PI * r;
    }
}
class NoneAccessModifiersTest {
    public static void main(String[] args) {
        NoneAccessModifiers.divide(10, 3);
        System.out.println(NoneAccessModifiers.circumference(44.4));
        NoneAccessModifiers NAM = new NoneAccessModifiers();
        System.out.println(NAM.PCircle(44.4));
    }
}
