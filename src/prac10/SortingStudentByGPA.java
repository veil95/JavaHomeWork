package prac10;

import java.util.*;

public class SortingStudentByGPA implements Comparator<Student>{
    private List<Student> students;

    public SortingStudentByGPA() {
        this.students = new ArrayList<>();
    }

    public void setArray(Student... newStudents) {
        students.addAll(Arrays.asList(newStudents));
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGpa(), o1.getGpa());
    }
    public int Size(){
        return students.size();
    }
    public void mergesort(){
        if (students.size() < 2) return;
        students = mergeSortRecursive(students);
    }
    public List<Student> mergeSortRecursive(List<Student> list) {
        if (list.size() <= 1) return list;
        int mid = list.size() / 2;
        List<Student> left = mergeSortRecursive(list.subList(0, mid));
        List<Student> right = mergeSortRecursive(list.subList(mid, list.size()));
        return merge(left, right);
    }
    public List<Student> merge(List<Student> left, List<Student> right){
        List<Student> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (compare(left.get(i), right.get(j)) <= 0) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }
        return merged;
    }
}
