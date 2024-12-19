package prac9.num2;

public class Student implements Comparable<Student>{
    private String name;
    private int gpa;

    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other){
        return Integer.compare(this.gpa, other.gpa);
    }
    @Override
    public String toString(){
        return "Student{name='" + name + "', gpa=" + gpa + "}";
    }
}
