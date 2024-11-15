package prac3.formatString;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.salary = salary;
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}
