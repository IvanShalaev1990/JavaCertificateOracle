package ua.com.javacertificateoracle.lesson24;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HomeWork {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY, MM-dd!! hh");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh, dd/MM/YY");
    public void workScadual(LocalDateTime a, LocalDateTime b, Period p, Duration d){
        do {
            System.out.println("Work from " + a.format(dtf));
            a = a.plus(p);
            System.out.println("Until " + a.format(dtf));
            System.out.println("Rest from " + a.format(dtf2));
            a = a.plus(d);
            System.out.println("Until " + a.format(dtf2));
        }while(a.isBefore(b));
    }

    public static void main(String[] args) {
        HomeWork hw = new HomeWork();
        LocalDateTime a = LocalDateTime.of(2022, Month.JULY, 11, 9, 00);
        LocalDateTime b = LocalDateTime.of(2022, Month.DECEMBER, 11, 19, 35);
        Period p = Period.ofDays(5);
        Duration d = Duration.ofHours(7);
        hw.workScadual(a, b, p,d);
    }
}
