package prac3.MathAndRand.num2;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "{" + x +
                "," + y +
                "}";
    }
}
