package prac19.num2;

class Student {
    private String fullName;
    private double averageScore;

    public Student(String fullName, double averageScore) {
        this.fullName = fullName;
        this.averageScore = averageScore;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{name='" + fullName + "', averageScore=" + averageScore + "}";
    }
}