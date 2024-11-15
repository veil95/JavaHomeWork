package prac3.formatString;

public class Report {
    public static void generateReport(Employee[] employees){
        System.out.println("Отчет о зарплатах сотрудников:");
        System.out.println("========================================");
        System.out.printf("%-20s %15s%n", "ФИО", "Зарплата (руб)");
        for (Employee employee : employees) {
            System.out.printf("%-20s %15.2f%n", employee.getFullname(), employee.getSalary());
        }
        System.out.println("========================================");
    }
}
