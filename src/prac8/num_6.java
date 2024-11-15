package prac8;

public class num_6 {
    public static boolean isPrime(int n, int del){
        if (del == 1){
            return true;
        }
        if (n % del == 0){
            return false;
        }
        else{
            return isPrime(n,del - 1);
        }
    }
    public static void main(String [] args){
        int n = 13;
        if (isPrime(n, n / 2 )){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
