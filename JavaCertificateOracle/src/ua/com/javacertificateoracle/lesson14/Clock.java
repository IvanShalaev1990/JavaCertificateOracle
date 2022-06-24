package ua.com.javacertificateoracle.lesson14;

public class Clock {
    public static void clock(){
        OUTER :
        for (int i = 0; i < 6; i++) {
            INNER :
            for (int j = 0; j < 60 ; j++) {
                if(i > 1 && j % 10 == 0){
                    break OUTER;
                }
                SECOND_INNER :
                for (int k = 0; k < 60 ; k++) {
                    if (k * i > j) {
                        break SECOND_INNER;
                    }
                    System.out.println(i + " : " + j + " : " + k);
                }
            }
        }
    }
}
