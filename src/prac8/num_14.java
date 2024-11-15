package prac8;

public class num_14 {
    public static void printDigits(int n){
        if (n == 0){
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }
    public static void main(String [] args){
        printDigits(12345);
    }
}
