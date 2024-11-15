package prac5.num2;

import java.awt.*;

public class Circle extends Shape {
    private int r;

    public Circle(Color color, int y, int x, int r) {
        super(color, y, x);
        this.r = r;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, r, r);
    }
}
