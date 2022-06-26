package ua.com.javacertificateoracle.lesson17;

public class BuilderLineTest {
    public static boolean myEquals(StringBuilder sb1, StringBuilder sb2){
        String s1 = String.valueOf(sb1).trim();
        String s2 = String.valueOf(sb2).trim();
        if (s1.equalsIgnoreCase(s2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello ");
        StringBuilder sb2 = new StringBuilder(" HELLO ");
        StringBuilder sb3 = new StringBuilder("WORLD ");
        System.out.println(myEquals(sb1, sb2));
        System.out.println(myEquals(sb1, sb3));
    }
}
