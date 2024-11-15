package prac1;

import java.util.Scanner;


public class num3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер массива:");
        int n = 0;
        while (!sc.hasNextInt()){
            System.out.println("Введите целое число");
            sc.next();
        }
        n = sc.nextInt();
        int arr[] = new int[n];
        int summ = 0;
        System.out.println("Введите " + n + " элементов масcива:");
        for(int i = 0; i<n; i++){
           while (!sc.hasNextInt()){
               System.out.println("Введите целое число");
               sc.next();
           }
           arr[i] = sc.nextInt();
           summ += arr[i];
        }
        double avg = (double) summ / (double) n;
        System.out.println("Сумма элементов массива: " + summ);
        if (avg % 1 == 0) {
            System.out.printf("Среднее арифиметическое массива: %d", (int) avg);
        } else {
            System.out.printf("Среднее арифиметическое массива: %.4f", avg);
        }
    }
}