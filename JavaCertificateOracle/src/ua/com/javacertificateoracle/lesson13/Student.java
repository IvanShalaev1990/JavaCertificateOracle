package ua.com.javacertificateoracle.lesson13;

public class Student {
    public int grade;
    public String name;
    public String gradeInLater;
    public Student(){}
    public Student(int grade, String name){
        this.grade = grade;
        this.name = name;
    }
    public static void score(Student a){
        if (a.grade >= 0 && a.grade < 20){
            a.gradeInLater = "E";
            System.out.println(a.name + "'s score is - E");
        } else if (a.grade >= 20 && a.grade < 40){
            a.gradeInLater = "D";
            System.out.println(a.name + "'s score is - D");
        }else if (a.grade >= 40 && a.grade < 60){
            a.gradeInLater = "C";
            System.out.println(a.name + "'s score is - C");
        }else if (a.grade >= 60 && a.grade < 80){
            a.gradeInLater = "B";
            System.out.println(a.name + "'s score is - B");
        }else if(a.grade >= 80 && a.grade <= 100){
            a.gradeInLater = "A";
            System.out.println(a.name + "'s score is - A");
        }
        else {
            System.out.println("Wrong score");
        }
    }
    public static void scoreIntoSwitch(Student a){
        switch (a.gradeInLater){
            case "E" :
                System.out.println(a.name + "should work very hard.");
                break;
            case "D" :
                System.out.println(a.name + "should work hard.");
                break;
            case "C" :
                System.out.println(a.name + "should work harder.");
                break;
            case "B" :
                System.out.println(a.name + "is a good student.");
                break;
                case "A" :
                System.out.println(a.name + "is a great student.");
                break;
            default:
                System.out.println("Grade is incorrect");
        }
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student Johan = new Student(99, "Johan");
        Student Herold = new Student(67, "Herold");
        Student.score(Johan);
        Student.scoreIntoSwitch(Johan);
        Student.score(Herold);
        Student.scoreIntoSwitch(Herold);
    }
}
