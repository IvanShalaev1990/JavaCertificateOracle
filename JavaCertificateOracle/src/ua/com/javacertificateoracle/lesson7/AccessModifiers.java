package ua.com.javacertificateoracle.lesson7;

import ua.com.javacertificateoracle.lesson5.Employee;

public class AccessModifiers {
    public static void main(String[] args) {
        ua.com.javacertificateoracle.lesson5.Employee Rick = new Employee(
                "Rick",
                "Sunchez",
                56,
                2500,
                "Scientist");
        Rick.employeeId();
        Rick.employeeSureName();
        Rick.employeeSalary();
    }
}
