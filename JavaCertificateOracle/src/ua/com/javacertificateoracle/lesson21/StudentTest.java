package ua.com.javacertificateoracle.lesson21;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Igor"));
        student.setCourse(-1);
        student.setGrade(0);
        System.out.println(student.getInfo());
    }
}
