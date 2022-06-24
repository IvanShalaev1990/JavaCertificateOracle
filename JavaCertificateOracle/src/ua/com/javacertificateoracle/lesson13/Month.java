package ua.com.javacertificateoracle.lesson13;

public enum Month {
    JANUARY(31, "January", 1),
    FEBRUARY(28,"February", 2),
    MARCH(31, "March", 3),
    APRIL(30, "April",4),
    MAY(31,"May", 5),
    JUNE(30,"June", 6),
    JULY(31,"July",7),
    AUGUST(30,"August",8),
    SEPTEMBER(31, "September",9),
    OCTOBER(30,"October",10),
    NOVEMBER(30,"November",11),
    DECEMBER(31,"December",12);
    int numOfDays;
    String name;
    int id;
    Month( int numOfDays, String name, int id){
        this.numOfDays = numOfDays;
        this.name = name;
        this.id = id;
    }

    public int getNumOfDays() {
        return numOfDays;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
