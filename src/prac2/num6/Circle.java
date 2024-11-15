package prac2.num6;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double CircleArea(double radius){
        return Math.PI * radius * radius;
    }

    public double lenCircle(double radius){
        return 2 * Math.PI * radius;
    }

    public boolean IsEqual(Circle OtherCircle) {
        return this.radius == OtherCircle.radius;
    }

    @Override
    public String toString(){
        return "{radius = " + radius +
                ", square = " + CircleArea(radius) +
                ", len = " + lenCircle(radius) + "}";
    }
}
