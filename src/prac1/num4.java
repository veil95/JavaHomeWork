package prac1;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер массива: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Введите " + n + " элементов массива");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int fl = 0, sum = 0;
        do{
            sum += arr[fl];
            fl++;
        } while(fl != n);
        System.out.println("Сумма посчитанная с помощью цикла do while: " + sum);
        sum = 0;
        fl = 0;
        while (fl != n){
            sum += arr[fl];
            fl++;
        }
        System.out.println("Сумма посчитанная с помощью цикла while: " + sum);
        int min = arr[0], max = arr[0];
        for (int k = 1; k < n; k++){
            if (arr[k] > max){
                max = arr[k];
            }
            if (arr[k] < min){
                min = arr[k];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }
}