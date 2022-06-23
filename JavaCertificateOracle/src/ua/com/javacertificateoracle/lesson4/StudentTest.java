package ua.com.javacertificateoracle.lesson4;

public class StudentTest {
    public static void main(String[] args) {
        Student Max = new Student(
                1,
                "Max",
                "Mad",
                2022,
                78,
                82,
                90);
        Student Johan = new Student(
                2,
                "Johan",
                "Mc'Clane",
                2022,
                89,
                95,
                89
        );
        Student Herold = new Student(
                3,
                "Herold",
                "From Rivia",
                2022,
                89,
                95,
                98
        );
        Student Dalay = new Student(
                4,
                "Dalay",
                "Lama",
                2023
        );
        System.out.println(Max.toString());
        Max.averageScore();
        System.out.println(Johan.toString());
        Johan.averageScore();
        System.out.println(Herold.toString());
        Herold.averageScore();
        System.out.println(Dalay.toString());
        Dalay.averageScore();
    }
}
