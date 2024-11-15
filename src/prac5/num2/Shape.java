package prac5.num2;

import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int y, int x) {
        this.color = color;
        this.y = y;
        this.x = x;
    }
    public abstract void draw(Graphics g);
}
