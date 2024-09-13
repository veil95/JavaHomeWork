package prac1;

import java.util.Scanner;

public class num7 {
    public static long factorial(int n){
        long res = 1;
        if (n < 0){
            System.out.println("Факториал от отрицательного числа взять нельзя");
        }
        else if (n == 1){
            return 1;
        }
        else{
            for (int i = 1; i <= n; i++){
                res *= i;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала: ");
        int number = sc.nextInt();
        long res = factorial(number);
        System.out.println("Факториал " + number + " равен " + res);
    }
}