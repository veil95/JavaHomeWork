package prac9.num1;

public class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;

    public Student(int iDNumber, String name) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }
    @Override
    public int compareTo(Student other){

        return Integer.compare(this.iDNumber, other.iDNumber);
    }
    @Override
    public String toString() {

        return "Student{" + "iDNumber=" + iDNumber + ", name='" + name + '\'' + '}';
    }
}
