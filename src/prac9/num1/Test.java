package prac9.num1;

public class Test {
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;
            while (position > 0 && list[position - 1].compareTo(key) > 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
    public static void main(String [] args){
        Student[] students = {
                new Student(3, "Andruxa"),
                new Student(1, "VOLODYA"),
                new Student(5, "Slavik"),
                new Student(2, "Tolik"),
                new Student(4, "Serega")
        };
        for (Student student : students){
            System.out.println(student);
        }

        insertionSort(students);
        System.out.println();
        for (Student student : students){
            System.out.println(student);
        }
    }
}
