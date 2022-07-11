package ua.com.javacertificateoracle.lesson24;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestOfTime {
    public static void time(){
        System.out.println(LocalDateTime.now());
    }
}
class TestOfTimeTest{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(LocalDateTime.now().
                    plus(Period.ofDays(i)).
                    format(DateTimeFormatter.
                            ofLocalizedDateTime(FormatStyle.SHORT)));
        }
    }
}
