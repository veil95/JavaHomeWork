package prac4_1;

public class EmployerTest {
    public static void main(String [] args){
        Employer[] employees = {new Employer("John", "Doe", 3000),
                                new Manager("Jane", "Smith", 4000, 500),
                                new Manager("Alice", "Johnson", 3500, 300)};
        int workedDays = 30;
        for (Employer emp : employees) {
            System.out.println(emp.getFirstName() + " " +
                               emp.getLastName() + ": " +
                               emp.getIncome(workedDays));
        }
    }
}
