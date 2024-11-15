package prac4_1;

public class Employer {
    private String FirstName;
    private String LastName;
    private int income;
    public Employer(String FirstName, String LastName, int income){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.income = income;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
    public double getIncome(int workedDays){
        return income * (workedDays / 30.0) * 12;
    }
}
