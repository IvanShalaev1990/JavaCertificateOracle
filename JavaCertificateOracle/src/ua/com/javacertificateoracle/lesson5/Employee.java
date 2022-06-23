package ua.com.javacertificateoracle.lesson5;

public class Employee {
    private static int employeeCounter;
    protected int employeeId;
    private String employeeName;
    public String employeeSureName;
    private int employeeAge;
    private double employeeSalary;
    private String employeeDepartament;

    public Employee(
            String employeeName,
            String employeeSureName,
            int employeeAge,
            double employeeSalary,
            String employeeDepartament) {
        this.employeeCounter++;
        this.employeeId = this.employeeCounter;
        this.employeeName = employeeName;
        this.employeeSureName = employeeSureName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
        this.employeeDepartament = employeeDepartament;
    }

    public static int getEmployeeCounter() {
        return employeeCounter;
    }

    public void employeeSalary(){
        System.out.println(this.employeeSalary);
    }
    public void employeeId(){
        System.out.println(this.employeeId);
    }
    public void employeeSureName(){
        System.out.println(this.employeeSureName);
    }
    public double salaryIncrease(double salaryIncrease){
        return employeeSalary *= salaryIncrease;
    }
    public void info(){
        System.out.println("employeeId=" + employeeId + "\n" +
                "employeeName='" + employeeName + '\'' + "\n" +
                "employeeSureName='" + employeeSureName + '\'' + "\n" +
                "employeeAge= " + employeeAge + "\n" +
                "employeeSalary= " + employeeSalary + "\n" +
                "employeeDepartament='" + employeeDepartament + '\''+ "\n");
    }
}
