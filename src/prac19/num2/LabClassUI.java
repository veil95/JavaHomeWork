package prac19.num2;

import java.util.List;
import java.util.Scanner;

class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI() {
        this.labClass = new LabClass();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- LabClass Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Sort Students by Average Score");
            System.out.println("3. Find Student by Name");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    sortStudents();
                    break;
                case 3:
                    findStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter student's full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's average score: ");
        double score = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        labClass.addStudent(new Student(name, score));
        System.out.println("Student added successfully.");
    }

    private void sortStudents() {
        labClass.sortByAverageScore();
        System.out.println("Students sorted by average score.");
    }

    private void findStudent() {
        System.out.print("Enter the full name of the student: ");
        String name = scanner.nextLine();
        try {
            Student student = labClass.findStudentByName(name);
            System.out.println("Student found: " + student);
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }

    private void displayStudents() {
        List<Student> students = labClass.getStudents();
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("List of students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
