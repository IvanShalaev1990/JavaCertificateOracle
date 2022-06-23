package ua.com.javacertificateoracle.lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee Max = new Employee(
                "Max",
                "Mad",
                35,
                2800,
                "Enginneer");
        Employee Herold = new Employee(
                "Herold",
                "FromRivria",
                38,
                3400,
                "Doctor");
        Max.info();
        System.out.println(Employee.getEmployeeCounter());
    }
}
