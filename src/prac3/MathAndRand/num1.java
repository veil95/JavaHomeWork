package prac3.MathAndRand;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class num1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Укажите размер массива:");
        int n = 0;
        while (!sc.hasNextInt()){
            System.out.println("Введите целое число");
            sc.next();
        }
        n = sc.nextInt();
        double arr[] = new double[n];
        double arr2[] = new double[n];
        double min = -10;
        double max = 10;
        for (int i = 0; i < n; i++){
            arr[i] = rand.nextDouble(-10,10);
            arr2[i] = min + (Math.random() * (max - min));
        }
        System.out.println("array created with Random:");
        for (double value : arr){
            System.out.print(value + " ");
        }
        System.out.println("\narray created with Math.random");
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                if (arr2[j] > arr2[j + 1]) {
                    double tmp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = tmp;
                }
            }
        }
        System.out.println("sorted array created with Random:");
        for (double value : arr){
            System.out.print(value + " ");
        }
        System.out.println("\nsorted array created with Math.random");
        System.out.println(Arrays.toString(arr2));
    }
}
