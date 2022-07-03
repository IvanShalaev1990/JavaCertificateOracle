package ua.com.javacertificateoracle.lesson20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkLesson20 {
    public static void stringSorting(String ... str){
        List<String> myList = Arrays.asList(str);
        System.out.println(myList);
    }
}
class HomeWorkLesson20Test{
    public static void main(String[] args) {
        HomeWorkLesson20.stringSorting("Hello", "World", "Rape", "Me");
    }
}
