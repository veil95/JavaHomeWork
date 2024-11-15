public class test {
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;

            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            }

            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] array = {5, 3, 8, 1, 2, 7}; // Массив Integer, который реализует Comparable
        System.out.println("До сортировки:");
        for (Integer num : array) {
            System.out.print(num + " ");
        }

        selectionSort(array);

        System.out.println("\nПосле сортировки:");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
    }
}
