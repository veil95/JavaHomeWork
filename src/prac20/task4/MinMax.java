package prac20.task4;

public class MinMax<T extends Comparable<T>> {
    private final T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }

        return min;
    }

    public T findMax() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] numbers = {11, 0, 4, 1, 5, 9, 2, -6, 5, -3, 5};
        MinMax<Integer> minMax = new MinMax<>(numbers);

        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());
    }
}