package ua.com.javacertificateoracle.lesson19;

import java.util.Random;

public class ForEachTest {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int [] [] myArray = new int[myRandom.nextInt(100)][myRandom.nextInt(100)];
        OUTER:
        for (int i = 0; i < myArray.length; i++) {
            INNER:
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = myRandom.nextInt(100);
            }
        }
        OUTER:
        for (int [] myArrayTwo:
             myArray) {
            INNER:
            for (int myInt:
                 myArrayTwo) {
                System.out.print(myInt + " ");
            }
            System.out.println();
        }

    }
}
