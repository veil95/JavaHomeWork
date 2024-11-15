package prac3.MathAndRand;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class num4 {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Укажите размер массива: ");
        int n;
        while (!sc.hasNextInt()){
            System.out.println("Введите целое число:");
            sc.next();
        }
        n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> arr2 = new ArrayList<>();
        boolean fl = false;
        for (int i = 0; i < n; i++){
            arr[i] = rand.nextInt(1,n + 1);
            if (arr[i] % 2 == 0){
                arr2.add(arr[i]);
                fl = true;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("New ArrayList");
        if (fl){
            for (int value : arr2){
                System.out.println(value + " ");
            }
        }
        else{
            System.out.println("There are no even numbers");
        }
    }
}
