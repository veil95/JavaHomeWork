package prac3.formatString;

public class ReportTest {
    public static void main(String [] args){
        Employee[] employees = {
                new Employee("Иван Иванов", 55000.50),
                new Employee("Мария Петрова", 72000.75),
                new Employee("Алексей Сидоров", 48500.00),
                new Employee("Елена Смирнова", 91000.99)
        };
        Report.generateReport(employees);
    }
}
