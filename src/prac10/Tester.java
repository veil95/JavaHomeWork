package prac10;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String [] args){
        Student student1 = new Student("челикс", "цаль", "матан", 2, "A1", 3.5);
        Student student2 = new Student("бобик", "шмит", "физика", 3, "B1", 3.8);
        Student student3 = new Student("чемпик", "тудай", "биология", 1, "C1", 3.2);
        Student student4 = new Student("дарвин", "чемпиков", "химия", 4, "D1", 3.9);
        Student student5 = new Student("урслан", "полюкаев-яблочный", "Engineering", 2, "E1", 3.7);

        SortingStudentByGPA list1 = new SortingStudentByGPA ();
        list1.setArray(student1, student2, student3);

        SortingStudentByGPA list2 = new SortingStudentByGPA();
        list2.setArray(student5, student4);

        System.out.println("List 1 before sorting:");
        list1.outArray();
        list1.mergesort();
        System.out.println("\nList 1 after sorting by GPA:");
        list1.outArray();

        System.out.println("\nList 2 before sorting:");
        list2.outArray();
        list2.mergesort();
        System.out.println("\nList 2 after sorting by GPA:");
        list2.outArray();

        }
    }

