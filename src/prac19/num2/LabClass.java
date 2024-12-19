package prac19.num2;

import java.util.*;

class LabClass {
    private List<Student> students;

    public LabClass() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void sortByAverageScore() {
        students.sort(Comparator.comparingDouble(Student::getAverageScore).reversed());
    }

    public Student findStudentByName(String fullName) throws StudentNotFoundException, EmptyStringException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("The name cannot be empty.");
        }
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with name '" + fullName + "' not found.");
    }
}