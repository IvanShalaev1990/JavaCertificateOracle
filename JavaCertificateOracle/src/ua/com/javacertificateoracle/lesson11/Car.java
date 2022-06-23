package ua.com.javacertificateoracle.lesson11;


import ua.com.javacertificateoracle.lesson9.Color;

public class Car {
    private static int carCounter;
    private int carId;
    private String carName;
    private Color color;
    private int numberOfDoors;
    public Car(){}
    public Car(String carName, Color color, int numberOfDoors){
        carCounter++;
        this.carId = carCounter;
        this.carName = carName;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }
    public void info(){
        System.out.println("carId = " + carId + "\n" +
                "carName = '" + carName + '\'' + "\n" +
                "color = " + color.getColor() + "\n" +
                "numberOfDoors = " + numberOfDoors + "\n" +
                "number of prodused car = " + carCounter + "\n");
    }
    public static void switchColor(Car a, Car b){
        Car c = new Car();
        c.color = a.color;
        a.color = b.color;
        b.color = c.color;
    }

    public static int getCarCounter() {
        return carCounter;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
