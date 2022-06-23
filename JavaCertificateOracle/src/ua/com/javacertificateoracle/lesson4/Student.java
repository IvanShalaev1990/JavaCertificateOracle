package ua.com.javacertificateoracle.lesson4;

import java.util.Objects;

public class Student {
    private int studentId;
    private String studentName;
    private String studentSecondName;
    private int yearOfEducation;
    private int averageScoreMath;
    private int averageScoreEconomic;
    private int averageScoreLang;
    public Student(
            int studentId,
            String studentName,
            String studentSecondName,
            int yearOfEducation,
            int averageScoreMath,
            int averageScoreEconomic,
            int averageScoreLang){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSecondName = studentSecondName;
        this.yearOfEducation = yearOfEducation;
        this.averageScoreMath = averageScoreMath;
        this.averageScoreEconomic = averageScoreEconomic;
        this.averageScoreLang = averageScoreLang;
    }
    public Student(int studentId, String studentName, String studentSecondName,int yearOfEducation){
        this(
                studentId,
                studentName,
                studentSecondName,
                yearOfEducation,
                0,
                0,
                0);
    }
    public Student(){}
    public void averageScore(){
        System.out.println("averageScore= " + (averageScoreMath + averageScoreEconomic + averageScoreLang)/3 + "\n");
    }

    @Override
    public String toString() {
        return
                "studentId= " + studentId + "\n" +
                "studentName='" + studentName + '\'' + "\n" +
                "studentSecondName='" + studentSecondName + '\'' + "\n" +
                "yearOfEducation= " + yearOfEducation + "\n" +
                "averageScoreMath= " + averageScoreMath + "\n" +
                "averageScoreEconomic= " + averageScoreEconomic + "\n" +
                "averageScoreLang= " + averageScoreLang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return  studentId == student.studentId &&
                yearOfEducation == student.yearOfEducation &&
                averageScoreMath == student.averageScoreMath &&
                averageScoreEconomic == student.averageScoreEconomic &&
                averageScoreLang == student.averageScoreLang &&
                Objects.equals(studentName, student.studentName) &&
                Objects.equals(studentSecondName, student.studentSecondName);
    }
    public static void nonEquals(Student a, Student b){
       if (a.studentId == b.studentId){
           System.out.println("They equals by ID");
       }else {
           System.out.println("They are not equals by ID");
       }
        if (a.yearOfEducation == b.yearOfEducation){
            System.out.println("They equals by year Of Education");
        }else {
            System.out.println("They are not equals by year Of Education");
        }
        if (a.averageScoreMath == b.averageScoreMath){
            System.out.println("They equals by average Score Math");
        }else {
            System.out.println("They are not equals by average Score Math");
        }
        if (a.averageScoreEconomic == b.averageScoreEconomic){
            System.out.println("They equals by average Score Economic");
        }else {
            System.out.println("They are not equals by average Score Economic");
        }
        if (a.averageScoreLang == b.averageScoreLang){
            System.out.println("They equals by average Score Lang");
        }else {
            System.out.println("They are not equals by average Score Lang");
        }
        if (a.studentName.equals(b.studentName)){
            System.out.println("They equals by student Name");
        }else {
            System.out.println("They are not equals by student Name");
        }
        if (a.studentSecondName.equals(b.studentSecondName)){
            System.out.println("They equals by student Second Name");
        }else {
            System.out.println("They are not equals by student Second Name");
        }
    }

}
