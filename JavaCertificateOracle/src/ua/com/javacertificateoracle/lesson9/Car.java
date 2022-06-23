package ua.com.javacertificateoracle.lesson9;

public class Car {
    private String name;
    private int carId;
    private Color color;
    private String engine;
    private BodyType bodyType;
    private static int carCounter;

    public Car(String name ,Color color, String engine, BodyType bodyType){
        carCounter++;
        this.name = name;
        this.carId = carCounter;
        this.color = color;
        this.engine = engine;
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor(){
        return this.color;
    }
    public String getEngine(){
        return this.engine;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public static int getCarCounter() {
        return carCounter;
    }

    public void info(){
        System.out.println(
                "Car name= " + name + "\n" +
                "Car Id= " + carId + "\n" +
                "Car color= " + color.getColor() + "\n" +
                "Car engine= '" + engine + '\'' + "\n" +
                "Car bodyType= " + bodyType.getBodyType()+ "\n" +
                "Car produced= " + getCarCounter() + "\n");
    }
}
