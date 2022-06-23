package ua.com.javacertificateoracle.lesson13;

public enum Month {
    JANUARY(31, "January"),
    FEBRUARY(28,"February"),
    MARCH(31, "March"),
    APRIL(30, "April"),
    MAY(31,"May"),
    JUNE(30,"June"),
    JULY(31,"July"),
    AUGUST(30,"August"),
    SEPTEMBER(31, "September"),
    OCTOBER(30,"October"),
    NOVEMBER(30,"November"),
    DECEMBER(31,"December");
    int numOfDays;
    String name;
    Month( int numOfDays, String name){
        this.numOfDays = numOfDays;
        this.name = name;
    }

    public int getNumOfDays() {
        return numOfDays;
    }
    public String getName() {
        return name;
    }
}
