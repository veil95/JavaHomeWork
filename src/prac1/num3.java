package prac1;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер массива:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int summ = 0;
        System.out.println("Введите " + n + " элементов масмива:");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            summ += arr[i];
        }
        double avg = (double) summ / n;
        System.out.println("Сумма элементов массива: " + summ);
        System.out.println("Среднее арифиметическое массива: " + avg);
    }
}