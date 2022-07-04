package ua.com.javacertificateoracle.lesson21;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;
    public void setName(StringBuilder name){
        if(name.length() >= 3) {
            this.name = name;
        }
    }
    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setCourse(int course){
        if (course <= 4 && course > 0){
            this.course = course;
        }
    }
    public int getCourse(){
        return this.course;
    }
    public void setGrade(int grade){
        if(grade <= 10 && grade > 0){
            this.grade = grade;
        }
    }
    public int getGrade(){
        return this.grade;
    }
    public String getInfo(){
        return "name " + getName() + "\n" +
                "course " + getCourse() + "\n" +
                "grade " + getGrade() + "\n";
    }
}
