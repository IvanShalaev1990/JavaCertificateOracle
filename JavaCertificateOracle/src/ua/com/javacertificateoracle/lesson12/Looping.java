package ua.com.javacertificateoracle.lesson12;

import ua.com.javacertificateoracle.lesson4.Student;

public class Looping {
    public static void main(String[] args) {
        Student Herold = new Student(
                1,
                "Herold",
                "FromRivia",
                2022,
                78,
                81,
                67);
        Student Johan = new Student(
                2,
                "Johan",
                "Mc'Clayn",
                2022,
                78,
                81,
                76);
        Student.nonEquals(Herold, Johan);
    }
}
