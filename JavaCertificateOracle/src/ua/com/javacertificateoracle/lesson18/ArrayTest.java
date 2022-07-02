package ua.com.javacertificateoracle.lesson18;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void maxMin(int[] a){
        Arrays.sort(a);
        System.out.println("Max : " + a[a.length-1] + "\n" + "Min : " + a[0]);
    }
    public static void maxMinTwo(int[] a){
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }else if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Max : " + max + "\n" + "Min : " + min);
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
        maxMin(myArray);
        maxMinTwo(myArray);
    }
}
