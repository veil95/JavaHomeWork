package prac5.num2;

import java.awt.*;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Color color, int y, int x, int width, int height) {
        super(color, y, x);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }
}
