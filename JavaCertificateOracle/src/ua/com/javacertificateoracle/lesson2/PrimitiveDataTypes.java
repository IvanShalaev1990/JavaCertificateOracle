package ua.com.javacertificateoracle.lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //Создать 4 переменных типа byte со значением 12 и записать их в 4-х системах исчесления

        byte byteBin = 0b1100;
        byte byteOct = 014;
        byte byteDec = 12;
        byte byteHex = 0xc;

        System.out.println(byteBin);
        System.out.println(byteOct);
        System.out.println(byteDec);
        System.out.println(byteHex);

        //Создать 4 переменных типа short со значением -1300 и записать их в 4-х системах исчисления

        short shortBin = -0b10100010100;
        short shortOct = -02424;
        short shortDec = -1300;
        short shortHex = -0x514;

        System.out.println(shortBin);
        System.out.println(shortOct);
        System.out.println(shortDec);
        System.out.println(shortHex);

        //Создать 4 переменных типа int со значением 0 и записать их в 4-х системах исчисления

        int intBin = 0b0;
        int intOct = 00;
        int intDec = 0;
        int intHex = 0x0;

        System.out.println(intBin);
        System.out.println(intOct);
        System.out.println(intDec);
        System.out.println(intHex);

        //Создать 4 переменных типа long со значением 123456789 и записать их в 4-х системах исчисления

        long longBin = 0b111010110111100110100010101l;
        long longOct = 0726746425l;
        long longDec = 123456789l;
        long longHex = 0x75BCD15l;

        System.out.println(longBin);
        System.out.println(longOct);
        System.out.println(longDec);
        System.out.println(longHex);

        //Создать по 2 переменных типа float, double, boolean

        float floatOne = 3.14f;
        float floatTwo = 4.4f;

        double doubleOne = 10/3d;
        double doubleTwo = 100/3d;

        boolean booleanOne = true;
        boolean booleanTwo = false;

        System.out.println(floatOne);
        System.out.println(floatTwo);

        System.out.println(doubleOne);
        System.out.println(doubleTwo);

        System.out.println(booleanOne);
        System.out.println(booleanTwo);

        //Вывести в консоль переменную типа char в разных кодировках

        char charOne = 'z';
        char charTwo = 122;
        char charThree = '\u5555';

        System.out.println(charOne);
        System.out.println(charTwo);
        System.out.println(charThree);
    }
}
