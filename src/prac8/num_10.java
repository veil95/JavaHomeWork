package prac8;

public class num_10 {
    public static int reverse(int n, int res){
        if (n % 10 == 0){
            return res;
        }
        return reverse(n / 10, res * 10 + n % 10);
    }
    public static void main(String [] args){
        System.out.println(reverse(12345,0));
    }
}
