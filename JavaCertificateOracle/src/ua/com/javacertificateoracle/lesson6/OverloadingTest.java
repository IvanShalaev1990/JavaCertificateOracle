package ua.com.javacertificateoracle.lesson6;

public class OverloadingTest {
    public int summary(){
        return 0;
    }
    public int summary(int a){
        return a;
    }
    public int summary(int a, int b){
        return summary(a) + b;
    }
    public int summary(int a, int b, int c){
        return summary(a,b) + c;
    }
    public int summary(int a, int b, int c, int d){
        return summary(a, b, c) + d;
    }
}
class Test{
    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        System.out.println(ot.summary(10, 20,30, 40));
        System.out.println(ot.summary(10, 20,30));
        System.out.println(ot.summary(10, 20));
        System.out.println(ot.summary(10));
        System.out.println(ot.summary());
    }
}
