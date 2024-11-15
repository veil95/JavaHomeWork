package prac4_1;

class Manager extends Employer {
    private double averageSum;

    public Manager(String FirstName, String LastName, int income, double averageSum) {
        super(FirstName, LastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome(int workedDays) {
        return super.getIncome(workedDays) + averageSum; // Добавляем доход от продаж
    }
}
