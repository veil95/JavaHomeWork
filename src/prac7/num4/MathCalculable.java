package prac7.num4;

public interface MathCalculable {
    double PI = 3.1415926535897932384626433832795;
    static double pow(double el, double exp) {
        return Math.pow(el, exp);
    }

    static double abs(int x, int y){
        return MathCalculable.pow(x * x + y * y, 0.5);
    }

}
