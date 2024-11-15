package prac8;

public class num_2 {
    public static void FromOneToN(int n){
        if (n == 0){
            return;
        }
        FromOneToN(n - 1);
        System.out.println(n);
    }
    public static void main(String [] args){
        FromOneToN(10);
    }
}
