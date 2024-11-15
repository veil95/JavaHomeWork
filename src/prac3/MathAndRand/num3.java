package prac3.MathAndRand;

import java.util.Random;
import java.util.Arrays;
public class num3 {
    public static void main(String [] args){
        Random rand = new Random();
        int arr[] = new int[4];
        int num;
        boolean fl = false;
        for (int i = 0; i < 4; i++){
            arr[i] = rand.nextInt(10, 100);
            num = arr[i];
            if (i != 0 && num < arr[i-1]){
                fl = true;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (fl){
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
        else{
            System.out.println("Массив является строго возрастающей последовательностью");
        }
    }
}
