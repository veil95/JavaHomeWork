package prac8;

public class SumNum_num5 {
    public static int SumNum(int n){
        if (n == 0){
            return 0;
        }
        return n % 10 + SumNum(n / 10);
    }
    public static void main(String []  args){
        System.out.println(SumNum(12345));
    }
}
