package prac3.MathAndRand.num2;

import java.util.Random;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Random rand){
        double x = rand.nextDouble(-20,20);
        double y = rand.nextDouble(-20,20);
        this.center = new Point(x,y);
        this.radius = rand.nextDouble() * 20 + 1;
    }


    public double getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Center: " + center.toString() + ", Radius: " + radius;
    }
}
