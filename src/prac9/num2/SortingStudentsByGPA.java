package prac9.num2;

public class SortingStudentsByGPA {
    public static void quickSort(Student[] arr, int low, int high){
        if (low < high) {
            int pivot_index = partition(arr, low, high);
            quickSort(arr, low, pivot_index - 1);
            quickSort(arr, pivot_index + 1, high);
        }
    }
    public static int partition(Student[] arr, int low, int high){
        Student pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++){
            if (pivot.compareTo(arr[j]) < 0){
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void main(String [] args){
        Student[] students = {
                new Student("слоняра", 3),
                new Student("степашка", 4),
                new Student("поздняк", 2),
                new Student("чопикс", 5)
        };
        for (Student student : students){
            System.out.println(student);
        }
        quickSort(students, 0, students.length - 1);

        System.out.println();
        for (Student student : students){
            System.out.println(student);
        }
    }
}
