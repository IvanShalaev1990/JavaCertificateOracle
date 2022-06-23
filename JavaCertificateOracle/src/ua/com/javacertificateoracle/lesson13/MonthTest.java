package ua.com.javacertificateoracle.lesson13;

public class MonthTest {
    public static void numOfDays(Month month){
        switch (month.getName()){
            case "January" :
                System.out.println(
                        month.getName() + " has " + Month.JANUARY.getNumOfDays() + " days"
                );
                break;
            case "February" :
                System.out.println(
                        month.getName() + " has " + Month.FEBRUARY.getNumOfDays() + " days"
                );
                break;
            case "March" :
                System.out.println(
                        month.getName() + " has " + Month.MARCH.getNumOfDays() + " days"
                );
                break;
            case "April" :
                System.out.println(
                        month.getName() + " has " + Month.APRIL.getNumOfDays() + " days"
                );
                break;
            case "May" :
                System.out.println(
                        month.getName() + " has " + Month.MAY.getNumOfDays() + " days"
                );
                break;
            case "June" :
                System.out.println(
                        month.getName() + " has " + Month.JUNE.getNumOfDays() + " days"
                );
                break;
            case "July" :
                System.out.println(
                        month.getName() + " has " + Month.JULY.getNumOfDays() + " days"
                );
                break;
            case "August" :
                System.out.println(
                        month.getName() + " has " + Month.AUGUST.getNumOfDays() + " days"
                );
                break;
            case "September" :
                System.out.println(
                        month.getName() + " has " + Month.SEPTEMBER.getNumOfDays() + " days"
                );
                break;
            case "October" :
                System.out.println(
                        month.getName() + " has " + Month.OCTOBER.getNumOfDays() + " days"
                );
                break;
            case "November" :
                System.out.println(
                        month.getName() + " has " + Month.NOVEMBER.getNumOfDays() + " days"
                );
                break;
            case "December" :
                System.out.println(
                        month.getName() + " has " + Month.DECEMBER.getNumOfDays() + " days"
                );
                break;
            default:
                System.out.println("It's not a month");
        }
    }
    public static void main(String[] args) {
        numOfDays(Month.JANUARY);
        numOfDays(Month.FEBRUARY);
        numOfDays(Month.MARCH);
        numOfDays(Month.APRIL);
        numOfDays(Month.MAY);
        numOfDays(Month.JUNE);
        numOfDays(Month.JULY);
        numOfDays(Month.AUGUST);
        numOfDays(Month.SEPTEMBER);
        numOfDays(Month.OCTOBER);
        numOfDays(Month.NOVEMBER);
        numOfDays(Month.DECEMBER);
    }
}
