package ua.com.javacertificateoracle.lesson9;

public enum Color {
    RED("Red", 8),
    GREEN("Green", 7),
    BLACK("Black",9),
    YELLOW("Yellow", 7),
    PINK("Pink", 5),
    PURPLE("Purple", 4),
    BLUE("Blue", 4),
    GRAY("Gray", 8),
    BROWN("Brown",4);
    private String color;
    private int rating;
    Color(String color, int rating){
        this.color = color;
        this.rating = rating;
    }

    public String getColor() {
        return color;
    }

    public int getRating() {
        return rating;
    }
}
