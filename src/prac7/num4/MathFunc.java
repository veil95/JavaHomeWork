package prac7.num4;

public class MathFunc implements MathCalculable{
    public static double pow(double el, double exp){
        return MathCalculable.pow(el,exp);
    }

    public static double abs(int x, int y) {
        return MathCalculable.pow(x * x + y * y, 0.5);
    }
}
