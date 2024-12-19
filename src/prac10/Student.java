package prac10;

public class Student {
    private String name;
    private String lastname;
    private String major;
    private int course;
    private String group;
    private double gpa;
    public Student(String name, String lastname, String major, int course, String group, double gpa) {
        this.name = name;
        this.lastname = lastname;
        this.major = major;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return String.format("Student{name='%s %s', major='%s', year=%d, group='%s', gpa=%.2f}",
                name, lastname, major, course, group, gpa);
    }
}
