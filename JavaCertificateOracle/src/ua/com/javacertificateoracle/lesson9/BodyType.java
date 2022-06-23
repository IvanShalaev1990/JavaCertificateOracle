package ua.com.javacertificateoracle.lesson9;

public enum BodyType {
    MICRO("Micro"),
    COUPE("Coupe"),
    HATCHBACK("Hatchback"),
    SEDAN("Sedan");
   private String bodyType;
    BodyType(String bodyType){
        this.bodyType = bodyType;
    }


    public String getBodyType() {
        return bodyType;
    }
}
