package ua.com.javacertificateoracle.lesson20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWorkLesson20 {
    public static void stringSorting(String ... strArray){
        ArrayList <String> list = new ArrayList<>();
        for (String str:
             strArray) {
            if(!list.contains(str)){
                list.add(str);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
class HomeWorkLesson20Test{
    public static void main(String[] args) {
        HomeWorkLesson20.stringSorting("Hello", "World", "Rape", "Me", "Hello", "World", "Rape", "Me");
    }
}
