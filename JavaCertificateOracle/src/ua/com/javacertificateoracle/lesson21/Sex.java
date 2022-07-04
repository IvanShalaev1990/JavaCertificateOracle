package ua.com.javacertificateoracle.lesson21;

public enum Sex {
    MALE("Man"),
    FEMALE("Woman");
    private String sex;
    Sex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return this.sex;
    }
}
